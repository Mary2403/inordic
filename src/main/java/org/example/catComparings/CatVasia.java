package org.example.catComparings;

public class CatVasia extends Cat{
    private static CatVasia catVasia;

    public static CatVasia getCatVasia() {
        if(catVasia==null) {
            catVasia = new CatVasia("grey", 3, "Vasia");

        }
        return catVasia;
    }

    private CatVasia(String calor, Integer age, String name) {
        super(calor, age, name);
    }
}
