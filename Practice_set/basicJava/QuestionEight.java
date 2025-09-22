package basicJava;
import java.util.Scanner;

//Write a program to reverse a string.
public class QuestionEight {
    public String RevString(String word){
            StringBuilder temp = new StringBuilder();// string builder for better string concatenation to work
            for (int i = word.length()-1; i >= 0 ; i --){
                temp.append(word.charAt(i));
            }
            return  temp.toString() ;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the string to reverse : ");
        String word = sc.nextLine();
        QuestionEight qe = new QuestionEight();
        System.out.println("the reverse of the string is : "+qe.RevString(word));
    }
}
