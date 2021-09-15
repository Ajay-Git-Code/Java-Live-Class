package passworddemo;

import java.util.Scanner;

class PasswordMismatchException extends Exception {

    PasswordMismatchException() {
        super("Please Enter Correct Password.");

    }
}

class PasswordVarificationExpiersException extends Exception {

    PasswordVarificationExpiersException() {
        super("You have reach Max attemp");

    }
}

class Password {

    private String pass;
    private int chance = 3;

    Password(String pass) {
        this.pass = pass;
    }

    void getPassword() {
        String userPass;
        Scanner s = new Scanner(System.in);
        try {
            
            while (chance > 0) {
                userPass = s.next();
                try {
                    if (userPass.equals(pass)) {
                        displayMsg();
                        return;
                    } else {
                        throw new PasswordMismatchException();

                    }
                } catch (Exception e) {
                    System.out.println(e + "TRY AGAIN");
                    chance--;
                }
            }
            throw new PasswordVarificationExpiersException();
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    private void displayMsg() {
        System.out.println("Welcome");
    }
}

public class PasswordDemo {

    public static void main(String[] args) {
        System.out.println("Enter password");
        Password obj = new Password("password");
        obj.getPassword();
        
    }

}
