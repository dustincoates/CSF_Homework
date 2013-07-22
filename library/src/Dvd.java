public class Dvd extends Item {
    private Long dateItemIsDue = System.currentTimeMillis() + (86400 * 1 * 1000);
    Dvd(String title){
        super(title);
    }
}
