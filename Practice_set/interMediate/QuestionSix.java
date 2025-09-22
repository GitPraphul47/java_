package interMediate;
import java.util.Scanner;

//Create a method to check whether a number is prime.
public class QuestionSix {
    public void isPrime(int num){
        if (num != 0){
            boolean isPrime = true;
            int i ;
            for(i=2; i <= Math.sqrt(num) ; i++ ){
                if(num % i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.println("number is prime ");
            }
            else {
                System.out.println("number is not prime ");
            }
        }
        else {
            System.out.println("enter valid number ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuestionSix qs = new QuestionSix();
        int num = sc.nextInt();
        qs.isPrime(num);
    }
}
