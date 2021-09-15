package accountdemo;

import java.util.Scanner;

class InvalidAmountException extends Exception {

    InvalidAmountException() {
        super("please enter valid amount.");
    }
}

class InsufficientBalanceException extends Exception {

    InsufficientBalanceException() {
        super("Please Enter Correct amount for withdrawal.");
    }

}

class Account {

    private String name;
    private int accnt, bal;

    void getData() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name,Account,bal");
        name = s.nextLine();
        accnt = s.nextInt();
        bal = s.nextInt();
    }

    void deposit(int amt) {
        try {
            if (amt < 1) {
                throw new InvalidAmountException();
            }
            bal += amt;
            System.out.println("after deposite - "+bal);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    void withdrawal(int amt) {
        try {
            if (amt < 1) {
                throw new InvalidAmountException();
            } else if (amt > bal) {
                throw new InsufficientBalanceException();
            }
            bal -=amt;
            System.out.println("after withdrawal - "+bal);
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}

public class AccountDemo {

    public static void main(String[] args) {
        Account obj = new Account();
        obj.getData();
        obj.deposit(0);
        obj.withdrawal(100);
    }

}
