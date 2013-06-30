import java.util.Arrays;
public class Lesson03Samples {
 
    public static void main(String args[]) {
        int[] array1 = {1, 3, 5, 11, 43, 67};
        int[] array2 = {2, 4, 6, 12, 40};
        int[] arrayToMergeInPlace = {1, 3, 5, 6, 9, 2, 4, 7, 8, 11};
        int[] arrayToSort = {10, 400, 12, 57, 2, 5, 8, -10, 58, 3};
        System.out.println(Arrays.toString(merge(array1, array2)));
        //mergeInPlace(arrayToMergeInPlace, 0, 5, 10);
        //mergeSort(arrayToSort);
    }
 
    public static int[] merge(int[] array1, int[] array2) {
        // Given two sorted arrays, combine them into a merged array which has all the elements of both in sorted order.
        int placeholderIn2ndArray = 0;
        int placeholderIn1stArray = 0;
        int indexForMergedArray = 0;
        int [] mergedArray = new int[array1.length + array2.length];

        for (int i = 0; i < array1.length; i++){
            for (; placeholderIn2ndArray < array2.length; placeholderIn2ndArray++){
                if (array1[i] > array2[placeholderIn2ndArray]){
                   mergedArray[indexForMergedArray] = array2[placeholderIn2ndArray];
                   placeholderIn1stArray = i;
                   indexForMergedArray++;
                }
                else{
                    mergedArray[indexForMergedArray] = array1[i];
                    indexForMergedArray++;
                    break;
                }
            }
        }

        if (array1.length >= array2.length ){
           while (placeholderIn1stArray < array1.length){
               mergedArray[indexForMergedArray] = array1[placeholderIn1stArray];
               indexForMergedArray++;
               placeholderIn1stArray++;
           }
        }
        else {
            while (placeholderIn2ndArray < array2.length){
                mergedArray[indexForMergedArray] = array2[placeholderIn2ndArray];
                indexForMergedArray++;
                placeholderIn2ndArray++;
            }
        }

        return mergedArray;
    }
 
    public static void mergeInPlace(int[] array, int i, int j, int k) {
        // Assuming that the elements of array are in sorted order between array[i] and array[j-1],
        // and between array[j] and array[k-1], rearrange the array to put the elements between array[i] and
        // array[k-1] in sorted order.
        int [] newArray = new int[k - i];
        int [] firstArray = new int[j-i];
        int [] secondArray = new int[k-j];
        return;
    }
//
//    public static int[] mergeSort(int[] arrayToSort) {
//        // Using the mergeInPlace method you just wrote, write a function to sort a given array. Remember to make a
//        // copy of the original array first to avoid overwriting the original. Hint: start by sorting the smallest
//        // possible subsections of the array, and combine them with mergeInPlace until the whole array is sorted.
////        return sortedArray;
//    }
//
//    public static int[] bubbleSortWithComparisonCounter(int[] arrayToSort) {
//        // Write an implementation of the bubble sort algorithm that keeps a count of how many times you compare
//        // elements of the array (eg. array[i]<array[j]). Before returning the sorted array print the numbers of
//        // comparisons used to the console.
////        return sortedArray;
//    }
//
//    public static int[] mergeSortWithComparisonCounter(int[] arrayToSort) {
//        // Update your implementation of merge sort above to keep a count of comparisons. Try merge sort and bubble
//        // sort with different arrays and look at the number of comparisons used. Why is merge sort more efficient?
////        return sortedArray;
//    }
}
