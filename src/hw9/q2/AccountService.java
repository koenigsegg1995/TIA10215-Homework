package hw9.q2;

/**
 * 帳號操作 Service
 */
public class AccountService {

    /**
     * 存錢
     *
     * @param account
     *          存入的帳號
     * @param amount
     *          存入的金額
     */
    public void deposit(Account account, Integer amount){
        account.setDeposit(account.getDeposit() + amount);
    }

    /**
     * 領錢
     *
     * @param account
     *          領出的帳號
     * @param amount
     *          領出的金額
     */
    public void withdraw(Account account, Integer amount){
        account.setDeposit(account.getDeposit() - amount);
    }

}
