package exceptionHandling;

public class TestException {
    public void show(){
        try{
            System.out.println("this is try block first line");
//            System.out.println("this is try block second linr"+ (10/0));
            int []arr = new int[4];// for index out of boud exception
            arr[4]= 50;
        }
        catch (Exception e){
            System.out.println("this is the block on catch when exception found");
            System.out.println(e);
        }
        System.out.println("this is afer the catch block 0");
    }
    public static void main(String[] args) {
            TestException tst = new TestException();
            tst.show();
    }
}
