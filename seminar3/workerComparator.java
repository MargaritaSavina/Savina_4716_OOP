package seminar3;

import java.util.Comparator;

public class workerComparator implements Comparator<Employee>{

    public int compare (Employee o1, Employee o2) {
        int res =  o1.getTypeWorker().compareTo(o2.getTypeWorker());
        if (res == 0) {
            return Double.compare(o1.calculateSalary(), o2.calculateSalary());
        }
        return res;
    }
    
    
}
