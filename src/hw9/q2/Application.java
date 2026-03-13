package hw9.q2;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * 主應用程式
 */
public class Application {

    public static void main(String[] args){

        Account account = new Account();
        account.setAccountName("BrownAccount");
        account.setDeposit(0);

        AccountService service = new AccountService();

        AtomicBoolean momIsAlive = new AtomicBoolean(true);
        AtomicBoolean brownIsAlive = new AtomicBoolean(true);

        // 媽媽執行緒
        Thread momTd = new Thread(() -> {
            // 存款次數
            int depositCount = 1;

            // 媽媽
            User mom = new User();
            mom.setUserName("Mom");

            // 存款邏輯開始
            synchronized(account) {
                while(depositCount <= 10){ // 存款未超過 10 次
                    if (account.getDeposit() > 3000 && brownIsAlive.get()) { // 帳號超過 3000 元
                        try {
                            // 暫停匯款
                            System.out.println("媽媽看到餘額在3000以上，暫停匯款");
                            account.wait();

                            // 醒來
                            System.out.println("媽媽被熊大要求匯款！");
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else if (!brownIsAlive.get()) {
                        break;
                    } else {
                        // 匯款 2000 元
                        mom.execute(() -> service.deposit(account, 2000));
                        System.out.println("媽媽存了2000，帳戶共有:" + account.getDeposit() + "===> 第" + depositCount + "次匯款");

                        // 匯款次數 +1
                        depositCount++;

                        // 通知熊大已匯款
                        account.notify();
                    }
                }

                account.notify();
                brownIsAlive.set(false);
            }
        });

        // 熊大執行緒
        Thread brownTd = new Thread(() -> {
            // 提款次數
            int withdrawCount = 1;

            // 熊大
            User brown = new User();
            brown.setUserName("Brown");

            // 提款邏輯開始
            synchronized(account) {
                while (withdrawCount <= 10) { // 提款未超過 10 次
                    if (account.getDeposit() < 2000) { // 帳號低於 2000 元
                        // 提醒媽媽匯款
                        System.out.println("熊大看到餘額在2000以下，要求匯款");
                        account.notify();

                        if (account.getDeposit() < 1000 && momIsAlive.get()) { // 帳號低於 1000 元
                            try {
                                // 暫停提款
                                System.out.println("熊大看到帳戶沒錢，暫停提款");
                                account.wait();

                                // 醒來
                                System.out.println("熊大被老媽告知帳戶已經有錢！");
                                continue;
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        } else if(!momIsAlive.get()){
                            break;
                        }
                    }

                    // 提款 1000 元
                    brown.execute(() -> service.withdraw(account, 1000));
                    System.out.println("熊大領了1000，帳戶共有:" + account.getDeposit() + "===> 第" + withdrawCount + "次提款");

                    // 提款次數 +1
                    withdrawCount++;
                }

                account.notify();
                brownIsAlive.set(false);
            }
        });

        momTd.start();
        brownTd.start();
    }

}
