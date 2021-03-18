package org.example.catComparings.version2;

public class CatTimosha extends Cat{
    private static CatTimosha catTimosha;

    public static CatTimosha getCatTimosha(){
        if(catTimosha ==null){
            catTimosha = new CatTimosha("black", 4, "Timosha", new Kitten("brown", 2 ,"Timosha1"));
        }
        return catTimosha;
    }


   private CatTimosha(String color, Integer age, String name, Kitten kitten) {
        super(color, age, name, kitten);
    }
    
    
}
