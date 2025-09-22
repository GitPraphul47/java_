package interMediate;
import basicJava.QuestionNine;

import java.util.Scanner;

//Write a program to find the sum and average of numbers in an array
public class QuestionTwo {
    public void sumAvg(int arr[]){
        int sum =0;
        double avg = 0 ;
        for(int i = 0 ; i< arr.length; i++){
            sum += arr[i];
        }
        avg = (double) sum/ arr.length;
        System.out.println("sum is : "+ sum +", average is : "+ avg);

    }

    public static void main(String[] args) {
        QuestionTwo qt = new QuestionTwo();
        Scanner sc = new Scanner(System.in);
        int arr [] = new int[6];
        for(int t = 0 ; t <6 ; t++){
            System.out.println("enter the"+t+" th index number : ");
            int num = sc.nextInt();
            arr[t] = num;
        }
        qt.sumAvg(arr);
    }
}
