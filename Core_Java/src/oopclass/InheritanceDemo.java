package oopclass;
// inheritance : procedure in which class inherits the behavior and properties of base class

class Father {
    public void area(){
        System.out.println(" fateher's property is 1000 gaj");
    }
}
class son1 extends Father{
    public void area(){
        System.out.println(" this is ths son 1 with 600 gaj ");
    }
}
class son2 extends Father {
    public void area(){
        System.out.println("this is son2 with 400 gaj ");
    }
}
public class InheritanceDemo {
    public static void main(String[] args) {
    Father father = new Father();
    son1 s1 = new son1();
    son2 s2 = new son2();
    father.area();
     s1.area();
     s2.area();
    }
}
