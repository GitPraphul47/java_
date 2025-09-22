package interMediate;
import java.util.Scanner;
//Create a class Student with fields name, age, and grade. Take input and display the details
class Student{
    String Name;
    int Age;
    String Grade ;
    public void inputDetails(String name, int age, String Grade){
        this.Name = name;
        this.Age = age;
        this.Grade = Grade.toUpperCase();
    }
    public void display(){
        System.out.println("Name : "+ Name);
        System.out.println("Age : "+ Age);
        System.out.println("Grade : "+ Grade );
    }
}
public class QuestionFirst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student st = new Student();
        System.out.print("Enter the name : ");
        String name = sc.nextLine();
        System.out.println("enter the age : ");
        int age = sc.nextInt();
        sc.nextLine();// after the next line program automatically reades the next line as remainder of that so it is a dummy
        System.out.println("Enter the Grade : ");
        String Grade = sc.nextLine();
//        char grade = sc.next().charAt(0);
//        char Grade = Character.toUpperCase(grade);
        st.inputDetails(name, age, Grade);
        st.display();
    }
}
