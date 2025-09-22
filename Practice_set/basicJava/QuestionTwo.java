package basicJava;
import java.util.Scanner;

//Take two numbers as input and print their sum.
public class QuestionTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("the sum is : "+ (num1+num2));
    }
}
