package modifiers;
class Modifiers{
    String name  = new String("Praphul");
    void display(){
        System.out.println("hello "+ name);
    }

}

public class AccessModifierDemo {
    public static void main(String[] args) {
    Modifiers mdf = new Modifiers();
    mdf.display();// default mod accessible within package
    }
}
/* Method :
    accessMethod   returnType  methodName(){
    }
    1 . Default :
    if no access modifier is used it is by default modifier.
    Accessibility : it is restricted with same package.

    2. private : most restricted
    within the class
    why we need private : to  hide the data so we need getter and setter
    3. protected : with in the same subclass And package
    4. public : available everywhere 
*/