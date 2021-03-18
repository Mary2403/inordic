package org.example;

import java.util.Scanner;

public class StarWords {

    public static void main(String[] args) {
        System.out.println("Введите высоту рамки");
        int scanHeight = inputHeight(); //считывание высоты + проверка

        System.out.println("Введите длину рамки");
        int scanLength = inputLength(); //считывание длины

        System.out.println("Введите слово");
        String scanUserWord = inputWord(); //Считывание слова
        var lengthUserWord = scanUserWord.length(); //Переменная для хранения длины слова

        while (lengthUserWord > scanLength - 2) {
            System.out.println("Слово не помещается. Введите длину рамки заново");
            scanLength = inputLength();
            System.out.println("Введите слово");
            scanUserWord = inputWord();
        }//Проверка слова и длины рамки, в случае неудачи - перезапись

        lengthUserWord = scanUserWord.length();//Перезапись переменной для хранения длины слова


        int emptyLinesBeforeWord = (scanHeight - 3) / 2; //Подсчет кол-ва пустых строк над словом
        int emptyBetweenStars = scanLength - 2;//Подсчет кол-ва пробелов в пустых строках между звездами
        int emptyLeftWord = (scanLength - 2 - lengthUserWord) / 2;//Подсчет кол-ва пробелов перед словом
        int emptyRightWord = scanLength - 2 - emptyLeftWord - lengthUserWord;//Подсчет кол-ва пробелов после слова
        int emptyLinesAfterWord = scanHeight - 3 - emptyLinesBeforeWord;//Подсчет кол-ва пустых строк после слова

        programmLogic(scanLength, emptyLinesBeforeWord, emptyBetweenStars, emptyLeftWord,  scanUserWord,emptyRightWord,
                emptyLinesAfterWord); //Вывод на печать

    }

    //Вызываемые функции
    
    public static int inputHeight() { //Ввод высоты
        int scanHeight = new Scanner(System.in).nextInt();
        while (scanHeight < 3) {
            System.out.println("Слово не влезет по высоте. Задайте высоту заново");
            scanHeight = new Scanner(System.in).nextInt();

        }
        return scanHeight;
    }

    public static int inputLength() { //Ввод длины
        var scanLength = new Scanner(System.in).nextInt();
        return scanLength;
    }

    public static String inputWord() { //Ввод слова
        var scanUserWord = new Scanner(System.in).nextLine();
        return scanUserWord;
    }

    //Вся логика печати
    public static void programmLogic(int scanLength, int emptyLinesBeforeWord, int emptyBetweenStars, int emptyLeftWord,
                                     String scanUserWord,int emptyRightWord, int emptyLinesAfterWord) {
        //Печать первой строки
        for (int i = 0; i < scanLength; i++) {
            System.out.print("*");
        }
        System.out.println();
        //Печать пустых строк перед словом
        for (int i = 0; i < emptyLinesBeforeWord; i++) {
            System.out.print("*");
            for (int j = 0; j < emptyBetweenStars; j++) {
                System.out.print(" ");
            }
            System.out.println("*");

        }
        //Печать слова
        System.out.print("*");
        for (int i = 0; i < emptyLeftWord; i++) {
            System.out.print(" ");
        }
        System.out.print(scanUserWord);
        for (int i = 0; i < emptyRightWord; i++) {
            System.out.print(" ");
        }
        System.out.println("*");
        //Печать пустых строк после слова
        for (int i = 0; i < emptyLinesAfterWord; i++) {
            System.out.print("*");
            for (int j = 0; j < emptyBetweenStars; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        //Печать последней строки
        for (int i = 0; i < scanLength; i++) {
            System.out.print("*");
        }
    }

}
