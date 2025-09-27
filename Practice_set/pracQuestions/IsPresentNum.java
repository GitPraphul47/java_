package pracQuestions;
import java.util.Scanner;

//.Write a program that asks the user to enter a number and checks if that number is present in an array
public class IsPresentNum {
    public static void main(String[] args) {
        IsPresentNum ip = new IsPresentNum();
        Scanner sc = new Scanner(System.in);
        int arr[] = {25, 14, 45, 78,54, 62,85};
        System.out.println("enter the numer  between 0 to 100  : ");
        int num = sc.nextInt();
        if (ip.isPresent(num, arr)){
            System.out.println("number exixts in array ");
        }
        else {
            System.out.println("Number Does not exist in array ");
        }

    }
    public boolean isPresent(int num, int arr[] ){
        for(int i : arr){
            if (i == num){
                return true;
            }
        }
        return false ;
    }
}
