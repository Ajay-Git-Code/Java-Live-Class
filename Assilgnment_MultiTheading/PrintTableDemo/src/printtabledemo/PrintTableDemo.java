package printtabledemo;

class PrintTable {

    public synchronized void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(n * i+" ");
        }
        System.out.println();
    }
}

class Table extends Thread {

    PrintTable obj;
    int x, y;

    Table(PrintTable obj, int x, int y) {
        this.obj = obj;
        this.x = x;
        this.y = y;
    }

    public void run() {
        obj.printTable(x);
        obj.printTable(y);
    }
}

public class PrintTableDemo {

    public static void main(String[] args) {
        PrintTable obj = new PrintTable();
        Table t1 = new Table(obj, 11, 12);
        Table t2 = new Table(obj, 13, 14);
        Table t3 = new Table(obj, 15, 16);
        t1.start();
        t2.start();
        t3.start();
    }

}
