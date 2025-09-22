package exceptionHandling;
class ExceptionTest {
    void print1(){
        print2();
    }
    void print2(){
        print3();
    }
    void print3(){
        try{print4();}
        catch (Exception e){
            System.out.println("handled 4 ");
        }


    }
    void print4() throws Exception{
        try{
        print5();}
        catch(ArithmeticException e){
            System.out.println(e);
            System.out.println(1);

            throw new Exception("Some technical issue");
        } catch (Exception e){
            System.out.println(e);
            System.out.println("handled");
        }
    }
    void print5(){

        System.out.println(10/0);
    }
}
public class ExceptionWorking {
    public static void main(String[] args) {
        ExceptionTest tst = new ExceptionTest();
        tst.print1();
    }
}
