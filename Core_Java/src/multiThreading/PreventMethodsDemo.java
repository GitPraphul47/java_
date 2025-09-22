package multiThreading;

class ThreadDemo2 implements Runnable{
    @Override
    public void run(){
        for(int i = 0 ; i<5 ; i++) {
            System.out.println(Thread.currentThread());
//              Thread.yield();
            try {
                Thread.sleep(2000);
            }
            catch(Exception e ){
//                System.out.println("exception Found ");
                throw new RuntimeException(e);
            }
        }
    }
}
public class PreventMethodsDemo {
    public static void main(String[] args) {
        ThreadDemo2 r = new ThreadDemo2() ;
        Thread t1 = new Thread(r, "pehla");
        Thread t2 = new Thread(r, "dusra");
        t1.setPriority(2);
        t1.start();
        t2.setPriority(Thread.MAX_PRIORITY);
        t2.start();
        for(int i = 0 ; i<5 ; i++){
            System.out.println(Thread.currentThread());
        }
    }
}
