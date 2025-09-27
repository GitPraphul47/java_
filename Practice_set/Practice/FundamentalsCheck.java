package Practice;
import java.util.Scanner;

public class FundamentalsCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(name);
        System.out.println(name.substring(0,1).toUpperCase()+name.substring(1));
    }
}
