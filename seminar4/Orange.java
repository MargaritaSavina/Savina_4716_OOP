package seminar4;

public class Orange extends Fruit implements Weight{
    
    public  Orange(double weight) {
        this.weight = weight;
    }

    public double getWeight(){
        return weight;
    }

}
