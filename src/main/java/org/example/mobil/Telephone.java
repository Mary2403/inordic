package org.example.mobil;

public abstract class Telephone implements WriteSMS {
    public static void main(String[] args) {
        Telephone nokia1 = new Telephone() {

            @Override
            public void writeSMS(String text) {

            }
        };
        Telephone samsung1 = new Telephone() {
            @Override
            public void writeSMS(String text) {

            }
        };

    }


}

//class Anon extends Telephone {}
