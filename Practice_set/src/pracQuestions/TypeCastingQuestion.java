package pracQuestions;
import java.util.Scanner;

//.Write a program that converts a double value to an integer and prints both the original and converted values.
public class TypeCastingQuestion {
    public int convetInt(double num ){
        return  (int) num;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TypeCastingQuestion tc = new TypeCastingQuestion();
        System.out.println("Enter the number : ");
        double num = sc.nextDouble();
        int  intNum = tc.convetInt(num);
        System.out.println("the integer value is  : " + intNum);
    }
}
