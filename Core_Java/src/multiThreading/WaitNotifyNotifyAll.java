package multiThreading;
class ThreadB extends Thread{
    int total = 0;
    @Override
    public void run(){
        synchronized (this){
            System.out.println("Calc Start  : ");
            for(int i = 0; i<5; i++){
                total = total +i;
            }
            this.notify();
            System.out.println("notification sent");
        }
    }
}

public class WaitNotifyNotifyAll {
    public static void main(String[] args) throws InterruptedException {
        ThreadB t = new ThreadB();
        t.start();
        synchronized (t){
            System.out.println("waiting ");
            t.wait();
            System.out.println("got notified");
            System.out.println("total  : "+ t.total);
        }
    }
}
