package seminar5.models;

import seminar5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Optional;

public class TableModel implements Model {

    private Collection<Table> tables;
    private Reservation reservation;
    /**
     * Получить список всех столиков
     * @return коллекция столиков
     */
    public Collection<Table> loadTables(){

        if (tables == null){
            tables = new ArrayList<>();
            for (int i = 0; i < 10; i++){
                tables.add(new Table());
            }
            
        }

        return tables;
    }


     


    /**
     * Бронирование столика
     * @param reservationDate дата
     * @param tableNo номер столика
     * @param name имя клиента
     * @return номер брони
     */
    public int reservationTable(Date reservationDate, int tableNo, String name){
        for (Table table : loadTables()) {
            if (table.getNo() == tableNo){
                this.reservation = new Reservation(reservationDate, tableNo, name);
                table.getReservations().add(reservation);
                return reservation.getId();
            }
        }
        return -1;
        //throw new RuntimeException("Некорректный номер столика");
    }

    /**
     * TODO: Разработать самостоятельно
     * Поменять бронь столика
     * @param oldReservation номер старого резерва (для снятия)
     * @param reservationDate дата резерва столика
     * @param tableNo номер столика
     * @param name Имя
     */
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        for (Table table : tables){
            if (reservation.getId() == oldReservation) {
                reservation = new Reservation(reservationDate, tableNo, name);
                return reservation.getId();
            }
            
        }
        
        return  -1;
    }


}
