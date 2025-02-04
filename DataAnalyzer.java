public class DataAnalyzer{

    public int searchList(int[] numbers, int target) {
        
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

    }

}