public class Magazine extends Item {
    public boolean canBeCheckedOut = false;
    String issueNumber;
    Magazine(String title, String issueNumber){
        super(title);
        issueNumber = issueNumber;
    }
}
