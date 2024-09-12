package account;

public class Account {
    int balance;
    int amount;
    void deposit(int amount){
        balance += amount;
        System.out.println(amount+ "원이 입금되었습니다. 현재 잔액은 : " + balance);
    }

    void withdraw(int amount){
        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "원이 출금되었습니다. 현재 잔액은 : " + balance);
        }
        else{
            System.out.println("잔액이 부족합니다.");
        }
    }
}
