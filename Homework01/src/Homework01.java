import java.util.Arrays;

public class Homework01 {
    public static void main(String args[]){
        String[] students = {"Dustin", "Chris", "Adrian", "Eddie", "Derrick", "Kevin", "Jesse"};
        assignPartners(students);
    }

    public static void assignPartners(String[] students){
        int index = 0;
        int groupNumber = 0;
        if(students.length%2 != 0){
            System.out.println("Group " + groupNumber);
            groupNumber++;
            System.out.println(students[index]);
            index++;
            System.out.println(students[index]);
            index++;
            System.out.println(students[index]);
            index++;
        }
        for (;index < students.length;){
            System.out.println("Group " + groupNumber);
            groupNumber++;
            System.out.println(students[index]);
            index++;
            System.out.println(students[index]);
            index++;
        }
    }
}
