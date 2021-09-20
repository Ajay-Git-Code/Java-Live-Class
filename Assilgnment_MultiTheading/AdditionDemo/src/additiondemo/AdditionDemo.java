package additiondemo;

class Addition {

    int add(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum = sum + i;
        }
        return sum;
    }
}

class Number extends Thread {

    Addition obj;
    int start, end, sum = 0;

    Number(Addition obj, int start, int end) {
        this.obj = obj;
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        sum = obj.add(start, end);
    }
}

public class AdditionDemo {

    public static void main(String[] args) {
        Addition obj = new Addition();
        Number t1 = new Number(obj, 1, 3);
        Number t2 = new Number(obj, 4, 7);
        Number t3 = new Number(obj, 8, 11);
        Number t4 = new Number(obj, 12, 14);
        try {
            t1.start();
            t2.start();
            t3.start();
            t4.start();
            t1.join();
            t2.join();
            t3.join();
            t4.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println(t1.sum+t2.sum+t3.sum+t4.sum);

    }

}
