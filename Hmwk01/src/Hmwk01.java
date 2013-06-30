import java.util.ArrayList;
import java.util.Random;

public class Hmwk01 {
    public static void main(String args[]){
        ArrayList<String> students = new ArrayList<String>();
        students.add("Dustin");
        students.add("Chris");
        students.add("Adrian");
        students.add("Eddie");
        students.add("Derrick");
        assignPartners(students);
    }

    public static void assignPartners(ArrayList<String> students){
        Random random = new Random();
        int index = 0;
        int groupNumber = 0;
//      There's an embarrassing amount of repetition happening below.
        if(students.size()%2 != 0){
            System.out.println("Group " + groupNumber);
            groupNumber++;
            index = random.nextInt(students.size());
            System.out.println(students.get(index));
            students.remove(index);
            index = random.nextInt(students.size());
            System.out.println(students.get(index));
            students.remove(index);
            index = random.nextInt(students.size());
            System.out.println(students.get(index));
            students.remove(index);
        }
        while(students.size() > 0){
            System.out.println("Group " + groupNumber);
            groupNumber++;
            index = random.nextInt(students.size());
            System.out.println(students.get(index));
            students.remove(index);
            index = random.nextInt(students.size());
            System.out.println(students.get(index));
            students.remove(index);
        }
    }
}
