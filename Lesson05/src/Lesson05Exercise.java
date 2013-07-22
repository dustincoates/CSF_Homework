import java.util.Scanner;
//TODO: Implement choosing btwn LinkedList and Stack
public class Lesson05Exercise {
    public static void main(String[] args){
        IntLinkedList linkedList = new IntLinkedList();
        IntStack stack = new IntStack();
        while(true){
            Scanner scanner = new Scanner(System.in);
            System.out.println("What'll you have?");
            System.out.println("LinkedList or Stack?");
            String choice = scanner.next();
            if (choice.equals("LinkedList")){
                System.out.println("Add or Remove?");
                choice = scanner.next();
                int command;

                if(choice.equals("Add")){
                    System.out.print("Add: ");
                    command = scanner.nextInt();
                    linkedList.insert(command);
                    linkedList.print();
                }
                else if(choice.equals("Remove")){
                    System.out.print("Remove: ");
                    command = scanner.nextInt();
                    linkedList.remove(command);
                    linkedList.print();
                }
            }
            else if(choice.equals("Stack")){
                System.out.println("Pop or Push");
                choice = scanner.next();
                if(choice.equals("Pop")){
                    System.out.println("POP POP!");
                    System.out.println("(Community reference)");
                    System.out.println("   ");
                    System.out.println("   ");
                    System.out.println("   ");
                    System.out.println("   ");
                    System.out.println("   ");
                    System.out.println("(Streets Ahead)");

                    stack.pop();
                    System.out.println("Popped");
                }
                else if (choice.equals("Push")){
                    System.out.println("Pushing");
                    System.out.print("Add what?: ");
                    int command = scanner.nextInt();
                    stack.push(command);
                    System.out.println("Pushed");
                }
            }


        }

    }
}
