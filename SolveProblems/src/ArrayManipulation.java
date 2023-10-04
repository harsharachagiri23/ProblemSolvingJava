//Array Manipulation:Write a Java function to find the sum of all elements in an
// integer array and calculate the average.
import java.util.Scanner;
public class ArrayManipulation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");

        for(int i =0; i<size;i++){
            System.out.print("Element " + (i+1) +" of the array: " );
            arr[i] = scanner.nextInt();

        }
        double average = calculateAvg(arr);
        System.out.println("Sum of array elements: " + calculateSum(arr));
        System.out.println("Average of array elements: " + average);

    }

    public static int calculateSum(int[] arr){
    int sum = 0;
    for(int num : arr){
        sum +=num;
    }
    return sum;
    }

    public static double  calculateAvg(int[] arr){
        int sum = calculateSum(arr);
        return (double) sum / arr.length;
    }
}
