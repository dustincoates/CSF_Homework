public class InternetReservation extends Reservation {

    public InternetReservation(int hourOfDay, String name, int numberOfPeople, String website){
        super(hourOfDay,name,numberOfPeople);
        this.website = website;
    }

    String website;

    @Override
    public String toString() {
        return name + " has a reservation at: " + hourOfDay + " for " + numberOfPeople + " from website: "+ website;
    }

}
