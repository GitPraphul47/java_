package collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
* create the list
* read index
* if index is valid - remove the element from list
* if the index is not valid display error
 */

public class ListDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(); // genaric - mention the datatype
        for (int i = 0 ; i < 5 ; i++){
            list.add(i+10);
        }
        System.out.println("list : "+ list);
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //list.contains(element) to find the element in the list sssss
        if(num < list.size()-1){
            list.remove(num);
            System.out.println(list);
        }
        else {
            System.out.println("Error");
        }
    }
}
