package seminar7;


import java.util.Random;

public class Company {

    private Random random = new Random();
    private String name;
    private Publisher jobAgency;
    private JobVacancy vacancy;

    public Company(String name, Publisher jobAgency) {
        this.name = name;
        this.jobAgency = jobAgency;
        
    }

    public void needEmployee(){
        vacancy = new JobVacancy();
        jobAgency.sendOffer(vacancy, name);
    }


}
