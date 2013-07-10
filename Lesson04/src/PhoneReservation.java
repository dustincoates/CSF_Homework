public class PhoneReservation extends Reservation {

    public PhoneReservation(int hourOfDay, String name, int numberOfPeople, String phone){
        super(hourOfDay,name,numberOfPeople);
        this.phone = phone;

    }

    String phone;

    @Override
    public String toString() {
        return name + " has a reservation at: " + hourOfDay + " for " + numberOfPeople + " with a phone number of: " + phone;
    }


}
