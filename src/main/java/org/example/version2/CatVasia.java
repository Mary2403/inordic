package org.example.catComparings.version2;

public class CatVasia extends Cat{
    private static CatVasia catVasia;

    public static CatVasia getCatVasia() {
        if(catVasia==null) {
            catVasia = new CatVasia("grey", 7, "Vasia", new Kitten("blue", 3, "Vasia1"));

        }
        return catVasia;
    }

    private CatVasia(String color, Integer age, String name, Kitten kitten) {
        super(color, age, name, kitten);
    }
}
