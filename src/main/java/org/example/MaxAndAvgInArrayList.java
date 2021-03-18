package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MaxAndAvgInArrayList {
    public static void main(String[] args) {
        List<Integer> List = new ArrayList<>(10);
        int max = 0;
        double sum = 0;
        for (int i = 0; i<10; i++){
            List.add(new Random().nextInt(5));
            System.out.print(List.get(i)+ " ");
            sum = sum + List.get(i);
            if (List.get(i)>max){max = List.get(i);}
        }
        System.out.println();
        System.out.println("Максимум "+ max);
        System.out.println("Среднее арифметическое "+ sum/10);
    }
}
