package modifiers;

class PrivateModifier{
    private String name= "String";
    private void display(){
        System.out.println("Private Display ");
    }

    public static void main(String[] args) {

        PrivateModifier pvt = new PrivateModifier();
        System.out.println(pvt.name);// accessible with in class only
        pvt.display();
    }


}
public class PrivateTestDemo {
    public static void main (String [] args ){
        PrivateModifier pvt = new PrivateModifier();
        // pvt.// does not support because accessible within the class only
    }
}
