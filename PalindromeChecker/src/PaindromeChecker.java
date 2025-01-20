import java.util.Scanner;

public class PaindromeChecker{
    public static boolean isPalindrome(String text){
        int start=0,stop=text.length()-1;
        while(start<=stop){
            if(text.charAt(start)!=text.charAt(stop)){
                return false;
            }
            start++;
            stop--;
        }
        return true;
    }

    public static void main(String[] args){
        System.out.println("Enter a text : ");
        String text=new Scanner(System.in).nextLine();
        System.out.println(isPalindrome(text) ? "Yes it is a palindrome": "No its is not a palindrome");
    }
}