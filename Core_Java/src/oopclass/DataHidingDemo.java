package oopclass;
import java.util.Scanner;

class Car{
    private int running;
    private String model;
    private String Owner;
    public void getrunning(){
        System.out.println(running);
    }
    public void setRunning(int num){
        this.running= num;
    }public void getModel(){
        System.out.println(model);
    }
    public void setModel(String model){
        this.model= model;
    }public void getOwner(){
        System.out.println(Owner);
    }
    public void setOwner(String Name){
        this.Owner= Name;
    }
}

public class DataHidingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car obj = new Car();
        System.out.println("1 to enter the details");
        System.out.println("2 to view the details ");
        System.out.println("0 to exit ");
        while(true){
            System.out.println("enter your choice : ");
            int choice=sc.nextInt();
            switch (choice){
                case 1: System.out.println("Enter the name of Owner ");
                        String Name = sc.next();
                        System.out.println("Enter the model : ");
                        String Model = sc.next();
                        System.out.println("Enter the Running : ");
                        int running = sc.nextInt();
                        obj.setModel(Model);
                        obj.setOwner(Name);
                        obj.setRunning(running);
                        break;
                case 2:   System.out.println(" the model ,Owner, Running of the car are : " );
                    obj.getModel();
                    obj.getOwner();
                    obj.getrunning();
                break;
                    case 3 :
                        System.exit(0);
                break;
            }
        }
    }
}
