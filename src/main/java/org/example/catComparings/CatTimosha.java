package org.example.catComparings;

public class CatTimosha extends Cat{
    private static CatTimosha catTimosha;

    public static CatTimosha getCatTimosha(){
        if(catTimosha ==null){
            catTimosha = new CatTimosha("black", 4, "Timosha");
        }
        return catTimosha;
    }


   private CatTimosha(String calor, Integer age, String name) {
        super(calor, age, name);
    }
    
    
}
