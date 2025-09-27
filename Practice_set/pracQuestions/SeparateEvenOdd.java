package pracQuestions;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//Write a program that asks the user for 10 numbers and stores them in an array. Then, print the even and odd numbers separately
public class SeparateEvenOdd {
    static int i = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        List<Integer> evenlist = new ArrayList<>();
        List<Integer> oddlist = new ArrayList<>();
        System.out.println("enter the numbers ");
        for (int i = 0; i < 10; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        // now print even odd separately
        for (int i : arr) {
            if (i % 2 == 0) {
                evenlist.add(i);
            } else {
                oddlist.add(i);
            }
        }
        // print the lists
        System.out.println("Even numbers : " + evenlist);
        System.out.println("Odds numbers : " + oddlist);


    }
}
