import java.io.*;
import java.util.Scanner;


import static java.lang.Math.floor;

public class Richest {
    public static void main(String[] args) {
        try {
            //test
            //File f = new File("test.txt");
            File f =new File(args[0]);
            Scanner s1 = new Scanner(f);

            int count = 1;
            while (s1.hasNextInt() && count != 10000) {
                count++;
                s1.nextInt();
            }
            int[] A = new int[count];
            Scanner s2 = new Scanner(f);
            for (int i = 1; i < count; i++) {
                A[i] = s2.nextInt();
            }
            minHeap heap = new minHeap(A);
            heap.HeapSort(A);
            while (s2.hasNextInt()) {
                int temp = s2.nextInt();
                if (A[1] < temp) {
                    A[1] = temp;
                    heap.HeapSort(A);
                }
            }
            FileOutputStream file = new FileOutputStream("richest.output");
            for (int i = 0; i < A.length; i++)
                file.write(A[i]);
            file.close();
        } catch (IOException e) {
            System.out.println("Error - " + e.toString());
        }

    }


}
