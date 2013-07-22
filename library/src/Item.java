import java.util.Calendar;
import java.util.Date;

public class Item {
    public String title;
    private Long dateItemIsDue = System.currentTimeMillis() + (86400 * 14 * 1000);
    public boolean canBeCheckedOut = true;
    public boolean isCheckedOut = false;

    Item(String title){
        title = title;
    }

    public Date getDueDate() {
        Date dueDate = new Date(dateItemIsDue);
        return dueDate;
    }
}
