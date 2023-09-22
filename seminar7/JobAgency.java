package seminar7;

import java.util.ArrayList;
import java.util.List;

public class JobAgency implements Publisher {

    List<Observer> observers = new ArrayList<>();

    @Override
    public void sendOffer(JobVacancy vacancy, String companyName) {
        for (Observer observer : observers){
            observer.receiveOffer(vacancy, companyName);
            
        }
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }



    public List<Observer> getObservers(){
        return observers;
    }
}
