package seminar7;

public class Program {

    /**
     * TODO: Доработать приложение, которое разрабатывалось на семинаре, поработать с шаблоном проектирования Observer,
     *  добавить новый тип соискателя.
     *  Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     *  Только после этого вы можете усложнить ваше приложение (при желании), например, добавить тип вакансии (enum),
     *  учитывать тип вакансии при отправке предложения соискателю.
     * @param args
     */
    public static void main(String[] args) {

        Publisher jobAgency = new JobAgency();
        Company google = new Company("Google", jobAgency);
        Company yandex = new Company("Yandex", jobAgency);
        Company geekBrains = new Company("GeekBrains", jobAgency);

        Student student1 = new Student("Petrov");
        Master master1 = new Master("Ivanov");
        Master master2 = new Master("Sidorov");
        HR hr1 = new HR("Volkov");

        jobAgency.registerObserver(student1);
        jobAgency.registerObserver(master1);
        jobAgency.registerObserver(master2);
        jobAgency.registerObserver(hr1);
        
        
        for (int i = 0; i < 4; i++){
            google.needEmployee();
            yandex.needEmployee();
            geekBrains.needEmployee();
            
        }

    }

}
