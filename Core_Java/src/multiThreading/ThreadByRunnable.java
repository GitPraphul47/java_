package multiThreading;

class ThreadClass implements Runnable{
    @Override
    public void run(){

        for(int i = 0 ; i < 56 ; i++){
//            System.out.println(Thread.currentThread());
            System.out.println("hello thread class by runnable ");
        }
    }
}
public class ThreadByRunnable {
    public static void main(String[] args) {
        ThreadClass t = new ThreadClass();
        Thread t1 = new Thread(t);
        t1.start();
        for(int i = 0 ; i < 56 ; i++){
//            System.out.println(Thread.currentThread());
            System.out.println("this is main thread ");
        }
    }
}
