package org.example.mobil;

public class Smartphone implements WriteSMS{


    public static void main(String[] args) {
        WriteSMS sms1 = (text)-> System.out.println(text);
        WriteSMS sms = new Smartphone();
    }

    @Override
    public void writeSMS(String text) {

    }
}
