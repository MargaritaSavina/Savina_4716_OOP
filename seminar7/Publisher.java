package seminar7;

import java.util.List;

public interface Publisher {

    void sendOffer(JobVacancy vacancy, String companyName);
    List<Observer> getObservers();

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);

}
