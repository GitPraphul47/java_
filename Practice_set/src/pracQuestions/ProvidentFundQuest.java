//Write a java program to read person basic salary and calculate Provident Fund
//amount from the basic salary Formula: Provident Fund is 12 % of Basic Salar
package pracQuestions;
import java.util.Scanner;

public class ProvidentFundQuest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProvidentFundQuest pf = new ProvidentFundQuest();
        System.out.println(" Enter the salary : ");
        int salary = sc.nextInt();
        System.out.println("the provident Fund is : " + pf.CalcPF(salary) );
    }
    public double CalcPF(int salary){
        double ProvidentFund = salary * 0.12;

        return ProvidentFund;
    }
}
