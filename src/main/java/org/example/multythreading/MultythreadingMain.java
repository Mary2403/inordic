package org.example.multythreading;

public class MultythreadingMain extends  Thread{
    @Override
    public void run() {

        for(int i = 0; i<100; i++){
            System.out.println("Question?");
        }
    }
    public static class MultythreadingMain2 extends Thread {
        @Override
        public void run() {

            for (int i = 0; i < 100; i++) {
                System.out.println("Answer");
            }
        }
    }

    public static void main(String[] args) {
        MultythreadingMain question = new MultythreadingMain();
        MultythreadingMain2 answer = new MultythreadingMain2();
        question.start();
        answer.start();

    }
}
