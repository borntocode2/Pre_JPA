package access;

public class BankAccount {
    private int balance;


    public BankAccount(){
        this.balance = 0;
    }

    public void deposit(int amount){
        if (isAmmountValid(amount)){
            balance += amount;
        }else{
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void withdraw(int amount){
        if (isAmmountValid(amount) && balance - amount >= 0){
            balance -= amount;
        }else{
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public int getBalance(){
        return balance;
    }

    private boolean isAmmountValid(int ammount){

        return ammount > 0;

    }
}
