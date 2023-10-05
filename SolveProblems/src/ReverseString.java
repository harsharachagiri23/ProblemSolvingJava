// Harsha --> ahsrah --> arr[0]= H --> arr[5] = a
//
public class ReverseString {
    public static void main(String[] args){
        String main = " hello, how are you?";
        String reverse = reverseString(main);
        System.out.println(reverse);
    }
public static String reverseString(String str){
        char[] ch = str.toCharArray();
        int left = 0;
        int right = ch.length - 1;

        while(left<right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;

            left++;
            right--;

        }
    return new String(ch);
}
}
