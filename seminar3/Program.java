package seminar3;

import java.util.Arrays;
import java.util.Random;

public class Program {

    private static Random random = new Random();

    /**
     * TODO: Переработать метод generateWorker. Метод должен возвращать случайного
     *  сотрудника (Freelancer или Worker)
     * @return
     */
    public static Employee generateEmployee(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salaryIndex = random.nextInt(200, 500);
        int flag = random.nextInt(2);
        if (flag == 1) {
            return new Worker(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], 100 * salaryIndex);
        }
        else {
        return new Freelancer(names[random.nextInt(names.length)], surNames[random.nextInt(surNames.length)], 150);
        }
    }

    public static Employee[] generateWorkers(int count){
        Employee[] workers = new Employee[count];
        for (int i = 0; i < count; i++){
            workers[i] = generateEmployee();
        }
        return workers;
    }

    public static void main(String[] args) {
        System.out.println();
        Employee[] workers = generateWorkers(12);

        for (Employee worker: workers) {
            System.out.println(worker);
        }


        Arrays.sort(workers, new workerComparator()); //сортировка по типу работника и по ЗП
        //Arrays.sort(workers, new SalaryComparator());

        System.out.println();

        for (Employee worker: workers) {
            System.out.println(worker);
        }

    }

}
