package basicJava;
import java.util.Scanner;

//Find the factorial of a number using a loop

public class QuestionFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int fact = 1 ;
        for (int i = 1; i <= num ; i++ ){
            fact = fact * i;
        }
        System.out.println("the factorial is : "+ fact);
    }
}
