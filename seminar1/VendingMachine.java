package seminar1;

import java.util.List;

public class VendingMachine {

    private List<Product> products;

    public VendingMachine(List<Product> products) {
        this.products = products;
    }

    public BottleOfWater getBottleOfWater(String name, double volume){
        for (Product product : products) {
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater)product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume){
                    return bottleOfWater;
                }
            
            }
        }
        return null;
    }
    public BottleOfMilk getBottleOfMilk(String name, double volume){
        for (Product product : products) {
            if (product instanceof BottleOfMilk){
                            BottleOfMilk bottleOfMilk = (BottleOfMilk)product;
                            if (bottleOfMilk.getName().equals(name) && bottleOfMilk.getVolume() == volume){
                                return bottleOfMilk;
                            }
                        }
        }
        return null;
    }
       
    
    public Cookies getCookies(String name, String taste){
        for (Product product : products) {
            if (product instanceof Cookies){
                            Cookies cookies = (Cookies)product;
                            if (cookies.getName().equals(name) && cookies.getTaste() == taste){
                                return cookies;
                            }
                        }
        }
        return null;
    }
}
