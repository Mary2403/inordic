package org.example;

import java.util.Scanner;

public class Fibonachi{
    public static void main(String[] args) {
        System.out.println("Сколько чисел из ряда Фибоначчи необходимо вывести?");
        var scan = new Scanner(System.in).nextInt();
        int first = 0;
        int containerForFirst = 0;
        int second = 1;
        for(int i = 0; i<scan; i++)
        {
            System.out.println(first+" ");
            containerForFirst = first;
            first = second;
            second = containerForFirst + second;
        }
    }
}
