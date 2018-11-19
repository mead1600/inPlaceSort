import java.util.Arrays;

public class Runner {
    public static void main(String[] args) {
        int[] intArray = inPlaceSort.randomArray(10);
        double[] doubleArray = inPlaceSort.randomDoubleArray(10);
        String[] StringArray = inPlaceSort.randomStringArr(10,10);

        System.out.println(Arrays.toString(intArray));
        System.out.println(Arrays.toString(doubleArray));
        System.out.println(Arrays.toString(StringArray));

        System.out.println();

        inPlaceSort.insertionSort(intArray);
        inPlaceSort.selectionSort(doubleArray);
        inPlaceSort.bubbleSort(StringArray);

        System.out.println("Insertion sorted array: "+Arrays.toString(intArray));
        System.out.println("Selection sorted array: "+Arrays.toString(doubleArray));
        System.out.println("Bubble soted array: "+Arrays.toString(StringArray));
    }
}
