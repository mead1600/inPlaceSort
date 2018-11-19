public class inPlaceSort {
    public static void swap(int[] arr, int a, int b)
    {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static void bubbleSort(String[] arr)
    {
        int count = 1;
        while(count != 0)
        {
            count = 0;
            for(int i = 1; i < arr.length;i++)
            {
                if(arr[i].compareTo(arr[i-1]) < 0)
                {
                    String temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    count++;
                }

            }
        }
    }
    public static void insertionSort(int[] arr)
    {
        for(int i = 0; i < arr.length;i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(arr[j-1] < arr[j])
                    swap(arr,j,j-1);
                else
                    j=0;
            }
        }
    }
    public static void selectionSort(double[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for(int c = 0; c< arr.length; c++)
            {
                if(arr[c] > arr[i])
                {
                    double temp = arr[c];
                    arr[c] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static int[] randomArray(int num)
    {
        int[] Array = new int[num];
        for(int i = 0; i < Array.length;i++)
        {
            Array[i] = (int)(Math.random()*10);
        }
        return Array;
    }
    public static double[] randomDoubleArray(int num)
    {
        double[] arr = new double[num];
        for(int i = 0; i < num; i++)
        {
            arr[i] = Math.random()*10;
        }
        return arr;
    }
    public static String[] randomStringArr(int num, int length)
    {
        String[] arr = new String[num];
        while(num > 0)
        {
            int i = 0;
            String s = "";
            while (i < length)
            {
                char c = (char)((Math.random()*26)+97);
                s = s + c;
                i++;
            }
            num--;
            arr[num] = s;
        }
        return arr;
    }
}
