package exceptionHandling;
class ThrowException {
    public void print() throws Exception {
        print2();
    }
    public void print2() throws Exception {
        try {
            print3();
        }
        catch(Exception e ){
            System.out.println("exception handled ");
            throw new Exception("hello praphul ");
        }
    }
    public void print3() throws Exception {
        try{
            System.out.println(10/0);
        }
        catch(ArithmeticException e){
//            e.printStackTrace();
            throw new IndexOutOfBoundsException("some thing gone wrong ");
        }
        finally {
            System.out.println("hello Praphul ");
        }
    }

}

public class ExceptionThrow {
    public static void main(String[] args) throws Exception  {
        ThrowException tw = new ThrowException();
        tw.print();
    }
}
