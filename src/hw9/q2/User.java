package hw9.q2;

/**
 * 用戶
 */
public class User {

    /**
     * 用戶名
     */
    private String userName;

    /**
     * 對帳號進行的操作
     *
     * @param execute
     *          執行的操作
     */
    public void execute(Execute execute){
        execute.execute();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
