package functions;
import java.util.Scanner;
class AdditionNum{
    int sum(int a, int b){
        int c = a +b;
        return c;
    }
}

public class FunctionDemo {
    public int publictest = 10;
    public String publicTestString = new String("Praphul");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" enter the first number : ");
        int num1 = sc.nextInt();
        System.out.println(" enter the second number : ");
        int num2 = sc.nextInt();
        AdditionNum summ = new AdditionNum();
        int add = summ.sum(num1 , num2);
        System.out.println("the sum of numbers is : "+ add);
    }
}
