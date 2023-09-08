package seminar4;

import java.util.ArrayList;
import java.util.Comparator;

public class Box <T extends Fruit>   {
    
    private ArrayList<T> arrayBox;

    public Box(ArrayList<T> arrayBox) {
        this.arrayBox = arrayBox;
    }

    public double getWeight(){
        double res = 0;
        for(T fruit: arrayBox) {
            res += fruit.getWeight();
        }
        return res;
    }
  
    public void addFruit(T fr) {
        arrayBox.add(fr);
    }

    public boolean compare(Box<T> box){
       if ( this.getWeight() > box.getWeight()) return true;
       return false;
    }
    
    public ArrayList<T> sprinkleBox(ArrayList<T> arr) {
        ArrayList<T> newArr = new ArrayList<T>(arr);
        arr.clear();
        return newArr;
    }

}
