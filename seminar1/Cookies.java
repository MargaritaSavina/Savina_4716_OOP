package seminar1;

public class Cookies extends Product{
    private double weight;
    private String taste;
    private int calories;

public Cookies(String name, String brand, double price, double weight, String taste, int calories){
    super(name, brand, price);
    this.weight = weight;
    this.taste = taste;
    this.calories = calories;
}
    public double getWeihgt(){
        return weight;
    }

    public String getTaste(){
        return taste;
    }
    
    public int getCalories(){
            return calories;
        }


    @Override
    public String displayInfo() {
        return String.format("[Печенье] %s - %s - %.2f -  %s - %s - %s", name, brand, price, weight, taste,calories);
    }
}
