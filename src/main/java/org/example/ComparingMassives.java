package org.example;

import java.util.Random;

public class ComparingMassives {
    public static void main(String[] args) {
        int[] a = new int[5];
        int[] b = new int[5];
        int flag = 1;

        for (int i = 0; i < 5; i++) {
            a[i] = new Random().nextInt(5);
            System.out.print(a[i] + "; ");
        }
        System.out.println();
        for (int i = 0; i < 5; i++) {
            b[i] = new Random().nextInt(5);
            System.out.print(b[i] + "; ");
        }
        System.out.println();

        for (int i = 0; i < 5; i++) {
            if (a[i] != b[i]) {
                System.out.println("Массивы разные");
                flag = 0;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Массивы одинаковые");
    }
}
