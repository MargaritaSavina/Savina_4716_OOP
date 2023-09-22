package seminar7;

public class Master implements Observer {

    private String name;
    private int salary = 80000;

    public Master(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(JobVacancy vacancy, String nameCompany) {
        if (this.salary <= vacancy.getSalary()){
            System.out.printf("Специалист %s: Мне нужна эта работа! (вакансия: %s, компания: %s; заработная плата: %d)\n",
                    name, vacancy.getVacancy(), nameCompany, vacancy.getSalary());
         
        }
        else {
            System.out.printf("Специалист %s: Я найду работу получше! (вакансия: %s, компания: %s; заработная плата: %d)\n",
                    name, vacancy.getVacancy(), nameCompany, vacancy.getSalary());
        }
    }

    public int getSalary(){
        return salary;
    }



}
