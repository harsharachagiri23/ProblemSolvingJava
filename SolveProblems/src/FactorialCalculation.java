//Factorial Calculation:Implement a Java function to calculate the factorial of a given non-negative integer.
//4!= 4*3*2*1
// n! = n*n-1*n-2*n-3
import java.util.Scanner;

public class FactorialCalculation {
    public static void main(String[] args){
        Scanner val = new Scanner(System.in);
        System.out.print("Enter a factorial value: " );
        int n = val.nextInt();
        int factorialresult = factorial(n);
        System.out.println("The factorial value of " + n + " is: " + factorialresult);

    }

    public static int factorial(int n) {

        if(n<1){
            throw new  IllegalArgumentException("If the given number is non-integer value");
        }

        int result=1;
        for(int i =1; i<=n ;i++){
            result *=i;
        }
        return result;
    }
}
