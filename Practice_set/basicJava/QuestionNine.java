package basicJava;
import java.util.Scanner;

//Check whether a given string is a palindrome
public class QuestionNine {
    public Boolean isPalindrome(String Str){
        int left = 0;
        int right = Str.length() -1;
        while(left < right){
            if(Str.charAt(left)!= Str.charAt(right)){
                return false;
            }
            left ++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuestionNine qn = new QuestionNine();
        System.out.println("Enter the string : ");
        String str = sc.nextLine();
        if(qn.isPalindrome(str)){
            System.out.println("is Palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
