package findsqrtdemo;

import java.util.InputMismatchException;
import java.util.Scanner;

class ComplexNumberException extends Exception {
    
    ComplexNumberException() {
        super("Negative number not allow");
    }
}

class FindSqrt {
    
    int number;
    
    void getNumber() {
        Scanner s = new Scanner(System.in);
        try {
            number = s.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
    }
    
    void calculates() {
        try {
            if (number < 0) {
                throw new ComplexNumberException();
            } else {
                System.out.println(Math.sqrt(number));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
}

public class FindSqrtDemo {
    
    public static void main(String[] args) {
        System.out.println("squart root");
        FindSqrt obj = new FindSqrt();
        obj.getNumber();
        obj.calculates();
    }
    
}
