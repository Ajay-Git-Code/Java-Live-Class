package addmultithearddemo;

class Addition extends Thread {

    public void run() {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            sum = sum + i;
        }
        System.out.println("sum " + sum);
    }
}

class Multiplication extends Thread {
    public void run(){
        int mul = 1;
        for(int i = 2;i<=30;i++)
        {
            mul = mul *i;
        }
        
        System.out.println("mul "+mul);
    }
}

public class AddMultiTheardDemo {

    public static void main(String[] args) {
        Thread addObj = new Addition();
        Thread mulObj = new Multiplication();
        addObj.start();
        mulObj.start();
    }

}
