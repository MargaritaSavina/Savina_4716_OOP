package seminar7;

public class HR implements Observer{

    private String name;
    private int salary = 75000;

    public HR(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(JobVacancy vacancy, String nameCompany) {
        if (this.salary <= vacancy.getSalary()){
            System.out.printf("HR %s: Мне нужна эта работа! (вакансия: %s, компания: %s; заработная плата: %d)\n",
                    name, vacancy.getVacancy(), nameCompany, vacancy.getSalary());
            this.salary = vacancy.getSalary();
        }
        else {
            System.out.printf("HR %s: Я найду работу получше! (вакансия: %s, компания: %s; заработная плата: %d)\n",
                    name, vacancy.getVacancy(), nameCompany, vacancy.getSalary());
        }
        
    }
    public int getSalary(){
        return salary;
    }
    
}
