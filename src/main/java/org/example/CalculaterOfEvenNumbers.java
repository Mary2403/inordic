package org.example;

import java.util.Scanner;

public class CalculaterOfEvenNumbers {

    public static void main(String[] args) {
        System.out.println("Реализован калькулятор четных чисел от 0 до N. N <=10.\nВведите N");
        int userNumber = enterNumber();

        boolean userCheckBordings = checkBordings(userNumber);

        if (userCheckBordings ==true){
            int sumEven = sumEvenNumbers(userNumber);
            System.out.println("Сумма четных чисел от 0 до "+userNumber+ " = "+ sumEven );
        }
        else System.out.println("Число должно быть от 0 до 10");

    }
    public static int enterNumber(){
        var scan = new Scanner(System.in);
        var num = scan.nextInt();
        return num;
    }
    public static boolean checkBordings(int userNumber){
        if(userNumber>=0||userNumber>10){
            return true;
        }
       else return false;
    }
    public static int sumEvenNumbers(int userNumber){
            int sum = 0;
            for(int i = 0; i<=userNumber; i++){
                if (i%2==0){
                    sum = sum+i;
                }
            }
            return sum;
    }
}
