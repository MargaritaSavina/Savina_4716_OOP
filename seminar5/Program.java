package seminar5;

import seminar5.models.TableModel;
import seminar5.presenters.BookingPresenter;
import seminar5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     * Метод changeReservationTable должен ЗАРАБОТАТЬ!
     *
     * @param args аргументы командной строки
     */
    public static void main(String[] args) {
        TableModel model = new TableModel();
        BookingView view = new BookingView();
        BookingPresenter bookingPresenter = new BookingPresenter(model, view);
        bookingPresenter.updateTablesUI();


        model.reservationTable(new Date(), 3, "Станислав");
        model.reservationTable(new Date(), 5, "Иван");
        view.reservationTable(new Date(), 3, "Станислав");
        view.reservationTable(new Date(), 5, "Иван");
        
        
    
       // bookingPresenter.updateReservationResultUI(101);


        view.changeReservationTable(101, new Date(), 1, "Станислав");
    }

}
