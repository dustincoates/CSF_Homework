import java.util.Arrays;

public class IntArraySorter {
    public int[] sortArray(int[] array){
        for (int x = 0;x < array.length;x++){
            for(int y = x+1; y < array.length;y++){
                if (array[y] < array[x]){
                    int yHolder = array[x];
                    int xHolder = array[y];
                    array[x] = xHolder;
                    array[y] = yHolder;
                }
            }
        }
        return array;
    }
}
