package seminar4;

public class Apple extends Fruit implements Weight{

    public Apple(double weight) {
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }
    
}
