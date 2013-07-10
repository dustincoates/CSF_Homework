import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class ReservationSystem {
    private List<Reservation> reservationList = new ArrayList<Reservation>();
    private HashMap<Integer, Integer> reservationMap = new HashMap<Integer, Integer>();

    public ReservationSystem(){
        for(int i = 0; i < 24; i++){
            reservationMap.put(i, 50);
        }
    };

    public void listReservation(){
        Collections.sort(reservationList);

        for(Reservation reservation:reservationList){
            System.out.println(reservation);
        }
    }

    public void addReservation(Reservation reservation){
        if(reservation.numberOfPeople < reservationMap.get(reservation.hourOfDay)){
            System.out.println("Sorry, we don't have enough seats for you.");
            // If I wanted to print the next available time I'd look at 1 up and 1 down, then 2 up and 2 down
            // etc. until I found the available time.
        }
        else {
            removeSeatsFromCirculation(reservation);
            reservationList.add(reservation);
        }
    }

    private void removeSeatsFromCirculation(Reservation reservation){
       int numberOfSeats = reservationMap.get(reservation.hourOfDay);
       numberOfSeats -= reservation.numberOfPeople;
       reservationMap.put(reservation.hourOfDay, numberOfSeats);
    };
}