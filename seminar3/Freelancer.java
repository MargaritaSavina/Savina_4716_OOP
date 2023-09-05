package seminar3;

import java.util.Random;

/**
 * TODO: Доработать в рамках домашнего задания
 */
public class Freelancer extends Employee{
    private static Random random = new Random();

    int hoursWorked = random.nextInt(1,150);

    public Freelancer(String name, String surName, double salary) {
        super(name, surName, salary);
        this.name = name;
        this.surName = surName;
        this.salary = salary * hoursWorked;
                
    }

    public double calculateSalary() {
        return salary;
    }


    public String toString() {
        return String.format("%s %s; Фрилансер; Заработная плата (почасовая) %.2f,  Отработанные часы: %s",
        surName, name, salary, hoursWorked);
    }

    public String getTypeWorker() {
        return String.format("Фрилансер");
     }

}
