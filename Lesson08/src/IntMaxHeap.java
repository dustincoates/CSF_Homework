import java.util.ArrayList;

public class IntMaxHeap {
    private ArrayList<Integer> array;

    public IntMaxHeap() {
        array = new ArrayList<Integer>();
    }

    public void insertValue(int value) {
        // When you want to test this method, remove the 'throw' line below
//        throw new UnsupportedOperationException("Not implemented!");

        // Add to the end of the array
        array.add(new Integer(value));

        if (array.size() > 1)
        {
            int childIndex = array.size() - 1;
            int parentIndex = (childIndex - 1)/2;
            int parentValue = array.get(parentIndex);
            while(value > parentValue){
                array.set(parentIndex, value);
                array.set(childIndex, parentValue);

                childIndex = parentIndex;
                parentIndex = (childIndex - 1)/2;
                parentValue = array.get(parentIndex);
            }

        }
    }

    public void printTopValue() {
        System.out.println("Top value in MaxHeap: " + array.get(0));
        System.out.println("Entire array representing MaxHeap: ");
        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i).intValue() + " ");
        }
    }
}