

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FileOperator {
    private String filename;

    public FileOperator(String fn) {
        this.filename = fn;
    }

    public double[] toDoubleArray(int arraySize) {
        double[] arr = new double[arraySize];
        try {
            File myObj = new File(filename);
            Scanner myReader = new Scanner(myObj);
            int i = 0;
            while (myReader.hasNextDouble() && i < arraySize) {
                arr[i] = myReader.nextDouble();
                i++;
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred: " + e.getMessage());
            return new double[0]; // Return empty array in case of error
        }
        return arr;
    }

    public static double findMin(double[] arr) {
        return Arrays.stream(arr).min().orElse(Double.NaN);
    }

    public static double findMax(double[] arr) {
        return Arrays.stream(arr).max().orElse(Double.NaN);
    }

    public static double findAverage(double[] arr) {
        return Arrays.stream(arr).average().orElse(Double.NaN);
    }

    public static double findMedian(double[] arr) {
        Arrays.sort(arr);
        int length = arr.length;
        if (length % 2 == 0) {
            return (arr[length / 2 - 1] + arr[length / 2]) / 2.0;
        } else {
            return arr[length / 2];
        }
    }

    public static double findMode(double[] arr) {
        Map<Double, Integer> freqMap = new HashMap<>();
        for (double num : arr) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        double mode = arr[0];
        int maxCount = 0;
        for (Map.Entry<Double, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mode = entry.getKey();
            }
        }
        return mode;
    }

    public static void main(String[] args) {
        FileOperator fileOp = new FileOperator("array.txt");
        double[] internetUsage = fileOp.toDoubleArray(20);
        
        System.out.println("Min: " + findMin(internetUsage));
        System.out.println("Max: " + findMax(internetUsage));
        System.out.println("Average: " + findAverage(internetUsage));
        System.out.println("Median: " + findMedian(internetUsage));
        System.out.println("Mode: " + findMode(internetUsage));
    }
}