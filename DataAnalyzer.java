public class DataAnalyzer{

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



    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50};
        System.out.println(searchList(arr,50));
    }

}