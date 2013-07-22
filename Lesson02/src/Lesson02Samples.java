import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Lesson02Samples {

    public static void main(String[] args) {
        // Call various other methods from here to run them
        //weirdLoop();
        sort();
//        allAs();
//        reverseNumbers();
//        reverseArray();
//        isGeneticSequence();
//        inputAndSearch();
//        calculator();
    }


    public static void sort() {
        int[] unsortedArray = {4,2,9,8,1,3,6,5, 25, 35, 10, 8};
        IntArraySorter sorter = new IntArraySorter();
        System.out.println("Unsorted: " + Arrays.toString(unsortedArray));
        System.out.println("Sorted: " + Arrays.toString(sorter.sortArray(unsortedArray)));
    }

    public static void weirdLoop() {
        for (int i = -8123; i < 3243*31; i += (2351%923)) {
            System.out.println("i: " + i);
        }
    }

    public static void allAs() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a string: ");
            String s = scanner.next();
            System.out.println("The string only contains the letter 'a': " + stringIsAllAs(s));
        }
    }

    public static boolean stringIsAllAs(String s) {
<<<<<<< HEAD
        int i = 0;
        while (i < s.length()) {
=======
        int i = -1;
        while (i < s.length() - 1) {
            i++;
>>>>>>> 36711eca12ec6b9e678bac043bdcab80496249a5
            char character = s.charAt(i);
            if (character != 'a' && character != 'A') {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void reverseNumbers() {
        // 1) Ask the user for how many numbers they want to enter
        // 2) Let them enter that many numbers
        // 3) Print them out in reverse
<<<<<<< HEAD
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers would you like to enter?");
        int count = scanner.nextInt();
        int[] numbers = new int[count];
        for(;count > 0;count--){
            System.out.println("Number please.");
            int num = scanner.nextInt();
            numbers[count-1] = num;
        }
        System.out.println(Arrays.toString(numbers));
=======
        System.out.print("The amount of numbers you'd like to enter: ");
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();

        // Assumes input must be an integer >= 0
        int[] userInput = null;
        if (count > 0)
            userInput = new int[count];

        for(int i = 0; i < userInput.length; i++) {
            System.out.print("\nEnter a number: ");
            userInput[i] = scanner.nextInt();
        }

        System.out.println("Reverse order: ");
        for (int i = userInput.length - 1; i >= 0; i--) {
            System.out.print(userInput[i] + " ");
        }
>>>>>>> 36711eca12ec6b9e678bac043bdcab80496249a5
    }

    public static void reverseArray() {
        int[] array = {12, 320, 231, 0214, 12312, 41024, 124, 12, 4123, 123, 1234, 634, 85, 685, 68};
        // 1) Reverse the above array above without creating a new array, then print it out
<<<<<<< HEAD
        int arrayLength = array.length;
        for(int i = 0; i < arrayLength/2; i++){
            int holderFront = array[i];
            int holderBack = array[arrayLength - (1 +i)];
            array[i] = holderBack;
            array[arrayLength - 1] = holderFront;
        }
        System.out.println(Arrays.toString(array));
=======

        System.out.println("Original array: " + Arrays.toString(array));

        for (int i = 0; i < array.length/2; i++) {
            int indexToSwap = array.length - i - 1;
            int swap = array[i];
            array[i] = array[indexToSwap];
            array[indexToSwap] = swap;
        }

        System.out.println("Reversed Array: " + Arrays.toString(array));
>>>>>>> 36711eca12ec6b9e678bac043bdcab80496249a5
    }

    public static void isGeneticSequence() {
        // 1) Ask the user for a string
        // 2) If the string contains only the characters 'G', 'A', 'T', or 'C' (case-sensitive) print true
        // 3) Otherwise, print false
<<<<<<< HEAD
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string.");
        String s = scanner.next();
        int i = 0;
        while (i < s.length()) {
            char character = s.charAt(i);
            if (character != 'G' && character != 'A' && character != 'T' && character != 'C') {
                System.out.println(false);
                return;
            }
            i++;
        }
        System.out.println(true);
=======
        System.out.print("Enter a string: ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("It is "
                + stringIsGeneticSequence(scanner.next())
                + " that the string is a valid genetic sequence");
    }

    public static boolean stringIsGeneticSequence(String sequence) {
        Character[] validCharacters = {
                new Character('G'),
                new Character('A'),
                new Character('T'),
                new Character('C')
        };

        for (int i = 0; i < sequence.length(); i++) {
            Character examinedCharacter = sequence.charAt(i);
            if (!Arrays.asList(validCharacters).contains(examinedCharacter))
                return false;
        }
        return true;
>>>>>>> 36711eca12ec6b9e678bac043bdcab80496249a5
    }

    public static void inputAndSearch() {
        // 1) Ask the user to input 10 words
        // 2) Then ask the user to input a search word
        // 3) If the word exists in the first 10 words, print true, otherwise print false
        // 4) Return to step 2
<<<<<<< HEAD
        while (true){
            Scanner scanner = new Scanner(System.in);
            ArrayList<String> words = new ArrayList<String>();
            System.out.println("Give me 10 words, one at a time.");
            for(int i = 10; i > 0; i--){
                words.add(scanner.next());
            }
            System.out.println("Enter a search word.");
            String searchWord = scanner.next();
            for(int i = 9; i >= 0; i--){
                if(words.get(i).equals(searchWord)){
                    System.out.println(true);
                    return;
                }
            }
            System.out.println(false);
=======
        final int NUMBER_WORDS = 10;
        ArrayList<String> words = new ArrayList<String>(NUMBER_WORDS);
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < NUMBER_WORDS; i++) {
            System.out.print("\nEnter a word: ");
            words.add(scanner.next());
        }

        while(true) {
            System.out.print("\nEnter a search term: ");
            System.out.println(words.contains(scanner.next()) + " that you entered that word");
>>>>>>> 36711eca12ec6b9e678bac043bdcab80496249a5
        }
    }

    public static void calculator() {
        // Below is a very simple calculator
        // 1) Modify it to support both addition, subtraction and multiplication operations
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter a statement in the format x + y: ");
            Integer leftOperand = scanner.nextInt();
<<<<<<< HEAD
            String operation = scanner.next(); // The "+" sign, just ignore this
            Integer rightOperand = scanner.nextInt();
            int result = 0;
            if (operation.equals("+")){
                result = leftOperand + rightOperand;
            }
            else if (operation.equals("-")){
                result = leftOperand - rightOperand;
            }
            else if (operation.equals("*")){
                result = leftOperand * rightOperand;
            }
            else if (operation.equals("/")){
                result = leftOperand / rightOperand;
=======
            String operator = scanner.next(); // The "+" sign, just ignore this
            Integer rightOperand = scanner.nextInt();

            int result = 0;
            if (operator.equals("+")){
                result = (leftOperand.intValue() + rightOperand.intValue());
            }
            else if (operator.equals("-")) {
                result = (leftOperand.intValue() - rightOperand.intValue());
            }
            else if (operator.equals("*")) {
                result = (leftOperand.intValue() * rightOperand.intValue());
            }
            else if (operator.equals("/")) {
                result = (leftOperand.intValue() / rightOperand.intValue());
>>>>>>> 36711eca12ec6b9e678bac043bdcab80496249a5
            }

            System.out.println("Resulting value is: " + result);
        }
    }
}
