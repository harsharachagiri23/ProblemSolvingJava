//Fibonacci Series: Write a Java program to generate the Fibonacci series up to a given number of terms.
//output: 0 1 1 2 3 5 8 13 21 34
import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args){

        Scanner val = new Scanner(System.in);
        System.out.print("Enter a series length: " );
        int n = val.nextInt();


        long[] fibo_series = new long[n];
        fibo_series[0] = 0;
        fibo_series[1] = 1;
        System.out.print(fibo_series[0] + " ");
        System.out.print(fibo_series[1] + " ");

        for(int i=2; i<n ; i++){
            fibo_series[i] =  fibo_series[i-1] +  fibo_series[i-2];
            System.out.print(fibo_series[i] + " ");
        }

    }
}
