package account;

public class AcoountMain {
    public static void main(String[] args) {
        Account account = new Account();

        account.deposit(10000);
        account.withdraw(9000);
        account.withdraw(2000);

        System.out.println("현재 잔액은 : " + account.balance + " 입니다.");
    }
}