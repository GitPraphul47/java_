package userinput;
import java.util.Scanner ;
public class UserInputDemo {
    public static void main(String[] args) {
        // user input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int data = sc.nextInt();

        System.out.println("your number is :  " + data);

    }
}
