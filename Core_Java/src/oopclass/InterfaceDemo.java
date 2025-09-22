package oopclass;
// multiple inheritance is not possible in java thus use interface
interface  FatherOne {
    public abstract void show();
}
interface Uncle{
    public abstract void display();
}
//class FatherOnetw extends FatherOne{
//    public void show(){
//        System.out.println("this is fathers property ");
//    }
//}

class ChildofFather implements FatherOne{
//    @override
    public void show(){
        System.out.println("this is default of fathers property ");
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        ChildofFather ch = new ChildofFather();
        ch.show();
    }
}
