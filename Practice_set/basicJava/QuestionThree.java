package basicJava;
import java.util.Scanner;

//Check if an input number is even or odd.
public class QuestionThree {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number : ");
    int num = sc.nextInt();
    if(num <= 0){
        System.out.println("please enter the valid number ");
    } else if (num % 2==1 ) {
        System.out.println(num + " is odd number ");
    }
    else if (num%2 == 0){
        System.out.println(" the "+ num + "is even number ");
    }
    }
}
