package seminar4;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
        

        Orange org1 = new Orange(18.3);
        Orange org2 = new Orange(20.6);
        Apple apl1 = new Apple(12.1);
        Apple apl2 = new Apple(10);
        Box<Apple> box1Apple = new Box<>(new ArrayList<>(10));
        Box<Orange> box1Orange = new Box<>(new ArrayList<>(10));
        
        box1Apple.addFruit(apl1);
        box1Apple.addFruit(apl2);
        box1Apple.addFruit(apl2);
        box1Apple.addFruit(apl2);
        box1Apple.addFruit(apl2);

        box1Orange.addFruit(org2);
        box1Orange.addFruit(org1);
        box1Orange.addFruit(org2);
        box1Orange.addFruit(org2);
        box1Orange.addFruit(org1);
        
        System.out.println(box1Apple.getWeight());
        System.out.println(box1Orange.getWeight());

        System.out.println(box1Orange.compare(box1Apple));


    }
    
    
}
