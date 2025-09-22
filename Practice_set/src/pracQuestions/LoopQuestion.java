package pracQuestions;
import java.util.Scanner;

//Write a program that initializes an array of 5 integers and prints each element using a loop.
public class LoopQuestion {
    public int SumArr(int arr [] ){
        int total = 0 ;
        for (int i : arr ){
            total += i;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        LoopQuestion lq = new LoopQuestion();
        int  Arr[] = new int[5];
        for(int i = 0; i < Arr.length; i++){
            Arr[i] = i+8*2;
        }
        for(int i : Arr){
            System.out.println(i);
        }
        // sum of array elements
        int SumArr =  lq.SumArr(Arr);
        System.out.println("Sum of Array : " + SumArr);
    }
}
