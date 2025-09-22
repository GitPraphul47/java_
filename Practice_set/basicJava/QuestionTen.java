package basicJava;
//import java.util.Scanner;

//Print numbers from 1 to 100 that are divisible by 5
public class QuestionTen {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the nu")
        int num = 5;
        int j = 0;
        int[] arr = new int[100];
        for(int i = 1; i <= 100; i++){
            if(i % num == 0){
                arr[j] = i ;
                j++;
            }
        }
        System.out.println("numbers divisible by 5 are : ");
        System.out.println("");
        for(int i : arr){
            if (i==0){
                break;
            }
            System.out.print(" "+ i);
        }
    }
}
