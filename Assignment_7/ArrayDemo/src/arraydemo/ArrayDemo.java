package arraydemo;

import java.util.Scanner;

class Array {

    int[] arr;

    void init(int size) {
        Scanner s = new Scanner(System.in);
        arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
    }

    void getValueAt(int index) {
        if (index > arr.length) {
            try {
                throw new ArrayIndexOutOfBoundsException();
            } catch (Exception e) {
                System.out.println(e);
            }
        } else {
            System.out.println(arr[index]);
        }
    }
}

public class ArrayDemo {

    public static void main(String[] args) {
        Array obj = new Array();
        obj.init(3);
        obj.getValueAt(1);
    }

}
