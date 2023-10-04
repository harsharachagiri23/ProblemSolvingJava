import java.util.Scanner;

// Palindrome Check:Create a Java function to determine whether a given string is a palindrome
// (reads the same forwards and backwards).
//
public class PalindromeCheck {
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the string: ");
    String pali = sc.nextLine();
    if(isPalindrome(pali)){
        System.out.println(pali + " is a palindrome");
    }
    else {
        System.out.println(pali + " is a not palindrome");
    }
}
public static boolean isPalindrome(String pali){
    int left = 0;
    int right = pali.length() - 1;

    while(left<right){
        if(pali.charAt(left)!=pali.charAt(right)){
            return false;
        }
        left++;
        right--;
    }
    return true;

}
}
