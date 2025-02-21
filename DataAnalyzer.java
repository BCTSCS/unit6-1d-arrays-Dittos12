import java.util.*;
import java.io.File;
import java.io.IOException;

public class DataAnalyzer{

    //linear search
    public static int searchList(int[] numbers, int target) {
        
        int index = 0;
        while(index<=numbers.length-1)
        {
            if(numbers[index]==target)
            {
                return index;
            }
            index++;
        }

        return -1;
    }

    //binary search
    public static int searchList(int target, int[] numbers) {

        

        return -1;
    }

    public static String toStringArray(int[] target){



        return "";
    }

    public static double toDoubleArray(int[] target){


        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        int[] array = new int[100];
        System.out.println(searchList(arr,50));

        try {
            File f = new File("numbers.txt");
            Scanner input = new Scanner(f);
            for(int i=0;i<100;i++)
            {
                array[i] = input.nextInt();
            }
        }
        catch(IOException e) {
            System.out.println("file not found");
        }

        System.out.println(array);
        System.out.println(searchList(array,44));
        System.out.println(searchList(44,array));
    }

}