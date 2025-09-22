package oopclass;
abstract class Money{
    abstract void account1();
    abstract void account2();
    void account3(){
        System.out.println("this is account 3 withh 15 M");
    }
}
class Cash extends Money{
    void  account1(){
        System.out.println("ths is account 1 ");
    }
    void account2(){
        System.out.println("this is account 2 ");
    }
}

public class AbstractionDemo {
    public static void main(String[] args) {
    Money m =new Cash();
    m.account1();
    m.account2();
    m.account3();
    }
}
