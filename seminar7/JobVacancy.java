package seminar7;

import java.util.Random;

public class JobVacancy {
    private TypeVacancy vacancy;
    private int salary;
    private TypeVacancy[] typeVacancy = TypeVacancy.values();
    private Random random = new Random();

    public  JobVacancy(TypeVacancy vacancy,int salary){
        this.vacancy = vacancy;
        this.salary = salary;
    }

    public  JobVacancy(int salary){
        int fl = random.nextInt(typeVacancy.length);
        this.vacancy = typeVacancy[fl];
        this.salary = salary;
    }
    public  JobVacancy(){
        int fl = random.nextInt(typeVacancy.length);
        this.vacancy = typeVacancy[fl];
        this.salary = random.nextInt(1000,100000);
    }
    public String getVacancy(){
        return vacancy.name();
    }

    public int getSalary(){
        return salary;
    }


}


