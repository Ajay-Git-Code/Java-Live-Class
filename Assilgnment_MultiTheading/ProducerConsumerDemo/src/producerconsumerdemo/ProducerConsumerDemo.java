package producerconsumerdemo;

class ProducerConsumer {

    private int x;
    private int sum;
    private boolean checker = true;

    synchronized void producer() throws InterruptedException {
        if (checker == false) {
            wait();
        }
        x++;
        System.out.println("produced " + x);
        notify();
        checker = false;

    }

    synchronized void consumer() throws InterruptedException {
        if (checker == true) {
            wait();
        }
            sum = sum + x;
            notify();
            checker = true;
            System.out.println("consumed " + sum);
    }
}

class ProThread extends Thread {

    ProducerConsumer obj;

    ProThread(ProducerConsumer obj) {
        this.obj = obj;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                obj.producer();
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

class ConThread extends Thread {

    ProducerConsumer obj;

    ConThread(ProducerConsumer obj) {
        this.obj = obj;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                obj.consumer();
            }
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class ProducerConsumerDemo {

    public static void main(String[] args) {
        ProducerConsumer obj = new ProducerConsumer();
        ProThread p = new ProThread(obj);
        ConThread c = new ConThread(obj);
        p.start();
        c.start();
    }

}
