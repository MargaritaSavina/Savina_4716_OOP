package seminar2;


public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;
    public Cat(String name, int appetite) {         //new Random().nextInt(50)
        this.name = name;
        this.appetite = appetite;
    }
    public void eat() { 
        
    }

    public void info() {
        System.out.println("имя котика:   "+ name + "  Сколько ест:   " + appetite + "  Сытость:   " + satiety);
    }

    public String getName() {
        return name;
    }
    public int getAppetite() {
        return appetite;
    }
    public boolean getSatiety() {
        return satiety;
    }
    public boolean setSatiety(boolean satiety) {
        this.satiety = satiety;
        return satiety;
    }
    public int setAppetite(int appetite) {
        this.appetite = appetite;
        return appetite;
    }


}
