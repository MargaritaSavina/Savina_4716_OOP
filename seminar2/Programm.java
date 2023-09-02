package seminar2;
import java.util.Scanner;


public class Programm {
    public static void main(String[] args) {
        
        Cat cat = new Cat("Barsik", 105);
        Plate plate = new Plate(100);
        plate.info();
        cat.eat();
        plate.setFood(plate.getFood() - cat.getAppetite());
        plate.info();
        Scanner scanner = new Scanner(System.in);

        Cat[] cats = new Cat[5];
        for (int i=0;i<cats.length;i++){
            String nameCat;
            System.out.println("Введите имя кота:");
            nameCat = scanner.nextLine();
            System.out.println("Введите аппетит кота:");
            int appetite = Integer.parseInt(scanner.nextLine());
            cats[i] = new Cat(nameCat, appetite);
            
        }
        
        for (int i=0;i<cats.length;i++){
                int res = plate.setFood(plate.getFood() - cats[i].getAppetite());
        if (res > 0) { 
            cats[i].setSatiety(true);
        }
        cats[i].info();
        }
        
        plate.info();
        plate.addFood(25);
        plate.info();




    }
}
