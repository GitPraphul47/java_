package interMediate;
import java.util.Scanner;

//Implement a simple calculator using switch-case.
public class QuestionThree {
    public void calc(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1 for add 2 for substraction 3 for multiplication 4 for division ");
        int choice = sc.nextInt();
        System.out.println("enter the  number : ");
        int num1 = sc.nextInt();
        System.out.println("enter the number : ");
        int num2 = sc.nextInt();
        int result =0;
        switch(choice){
            case 1 :System.out.println("sum of numbers ");
                result = num1 + num2;
                System.out.println(result);
                break;

            case 2 : System.out.println("the substraction of number is : ");
                    result = num1 - num2;
                    System.out.println(result);
             break;
            case 3:
                System.out.println(" multiply  of numbers : ");
                result = num1 * num2;
                System.out.println(result);
                break;
            case 4:
                System.out.println("division of numbers :  ");
                if (num2 != 0 ){
                    result = num1 / num2;
                    System.out.println(result);
                }else{
                    System.out.println("can not be devided by zero ");
                }

                break;

            default: System.out.println("invalid input :( ");
        }
    }
    public static void main(String[] args) {
        QuestionThree three = new QuestionThree();
        three.calc();
    }
}
