package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class UniqueNumbers {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        List<Integer> uniqueList = new ArrayList<>();

        //Метод на заполнение списка
        list = returningArray();
        //Метод для вывода уникальных значений
        uniqueList = cancellingDoublicats( list);

    }

    public static List<Integer> returningArray(){
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(20));
        }
        System.out.println(list);
        return list;
    }

    public static List<Integer> cancellingDoublicats(List<Integer> list){
        List<Integer> uniqueList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int flag = 0;

            for (int j = 0; j < uniqueList.size(); j++) {
                if (list.get(i) == uniqueList.get(j)) {
                    flag = 1;
                }
            }
            if (flag == 0) {
                uniqueList.add(list.get(i));
            }
        }
        System.out.print(uniqueList);
        return uniqueList;
    }
}
