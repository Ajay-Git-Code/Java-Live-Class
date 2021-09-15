package arrayaddsubmuldivdemo;

class ArrayObj {

    private int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    private int threadTime = 1;

    public int get(int index) {
        return arr[index];
    }

    public synchronized void showAdd() throws InterruptedException {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "add run");
            sum = sum + get(i);
            if (i == 9) {
                threadTime++;
                notifyAll();

            }
        }
        System.out.println("sum " + sum);
    }

    public synchronized void showSub() throws InterruptedException {
        if (threadTime != 2) {
            System.out.println("sub wait");
            wait();
            showSub();
        }
        if (threadTime == 2) {

            int sub = 0;
            for (int i = 0; i < 10; i++) {
                System.out.println(i + "sub run");
                sub = sub - get(i);
                if (i == 9) {
                    threadTime++;
                    notifyAll();
                }
            }
            System.out.println("sub " + sub);
        }
    }

    public synchronized void showMul() throws InterruptedException {
//        boolean d = true;
        if (threadTime != 3) {
            System.out.println("mul wait");
            wait();
            showMul();
        }
        if (threadTime == 3) {

            int mul = 1;
            for (int i = 0; i < 10; i++) {
                System.out.println(i + "mul run");
                mul = mul * get(i);
                if (i == 9) {
                    threadTime++;
                    notify();
                }
            }
            System.out.println("mul " + mul);
//            d = false;
        }
    }

    public synchronized void showDiv() throws InterruptedException {
//        boolean g = true;
        if (threadTime != 4) {
            System.out.println("div wait");
            wait();
            showDiv();
        }
        if (threadTime == 4) {

            float div = 1.0f;
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " div run");
                div = get(i) / div;
                if (i == 9) {
                    threadTime++;
                }
            }
            System.out.println("div " + div);
//            g = false;
        }
    }
}

class Add extends Thread {

    ArrayObj obj;

    Add(ArrayObj obj) {
        this.obj = obj;
    }

    public void run() {
        try {
            obj.showAdd();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Sub extends Thread {

    ArrayObj obj;

    Sub(ArrayObj obj) {
        this.obj = obj;
    }

    public void run() {
        try {
            obj.showSub();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Mul extends Thread {

    ArrayObj obj;

    Mul(ArrayObj obj) {
        this.obj = obj;
    }

    public void run() {
        try {
            obj.showMul();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class Div extends Thread {

    ArrayObj obj;

    Div(ArrayObj obj) {
        this.obj = obj;
    }

    public void run() {
        try {
            obj.showDiv();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

public class ArrayAddSubMulDivDemo {

    public static void main(String[] args) {
        ArrayObj obj = new ArrayObj();
        Add add = new Add(obj);
        Sub sub = new Sub(obj);
        Mul mul = new Mul(obj);
        Div div = new Div(obj);
        add.start();
        sub.start();
        mul.start();
        div.start();

    }

}
