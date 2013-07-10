import java.util.Scanner;

public class Application {

    public static void main(String... args){

        ReservationSystem reservationSystem = new ReservationSystem();
        int i = 0;
        while(i<3){
            Scanner scanner = new Scanner(System.in);

            System.out.println("what type of reservation? phone, website or other.");

            String type = scanner.next();

            System.out.println("enter a time");

            int time = scanner.nextInt();

            System.out.println("enter a name");
            String name = scanner.next();

            System.out.println("enter number of people");
            int numberOfPeople = scanner.nextInt();

            Reservation reservation = null;

            if (type.equals("phone") || type.equals("website")){
                System.out.println("enter the " + type);
            }

            if(type.equals("phone")){
                String phone = scanner.next();
                reservation = new PhoneReservation(time,name,numberOfPeople, phone);
            } else if (type.equals("website")){
                String website = scanner.next();
                reservation = new InternetReservation(time,name,numberOfPeople, website);
            }  else {
                reservation = new Reservation(time,name,numberOfPeople);
            }

            reservationSystem.addReservation(reservation);

            i++;

        }

        reservationSystem.listReservation();
    }
}
