package basicJava;
import java.util.Scanner;


//Print the largest of three numbers entered by the user
public class QuestionFour {
    public int LargeNum(int a, int b, int c){
        if(a > b && a >c){
            return a;
        }
        else if (b>a && b>c){
            return b;
        }
        else {
            return c;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers : ");
        int num1= sc.nextInt();
        int num2= sc.nextInt();
        int num3= sc.nextInt() ;
        QuestionFour ln = new QuestionFour();
        int largeNum = ln.LargeNum(num1 , num2, num3);
        System.out.println("the largest number is : " + largeNum);

    }
}
