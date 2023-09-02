package seminar2;

public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
    
    public int getFood() {
        return food;
    }

    public int setFood(int food) {
        if (food < 0) {
            System.out.println("В тарелке недостаточно еды.");
        }
        else { this.food = food; }
        return food;
    }

    public int addFood(int food) {
        this.food = this.food + food;
        return food;
    }

}
