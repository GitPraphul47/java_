package modifiers;
import functions.ProtectedTestDemoOther;
// importing from functions package to test wether the protected can be used in other packages

class TestProtected extends ProtectedTestDemoOther{
//    public void callDisplay(){
//        display();
//    }
public static void main(String[] args) {

    TestProtected pvt = new TestProtected();
    pvt.display();

}
}
public class ProtectedTestDemo {
//    public static void main(String[] args) {
//
//        TestProtected pvt = new TestProtected();
//        pvt.callDisplay();
//
//    }
}
