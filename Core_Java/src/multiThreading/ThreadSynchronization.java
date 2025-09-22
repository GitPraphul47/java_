package multiThreading;

class ThreadDemo3{
    private int sum =0;
    public synchronized void incre(){
        sum++;
    }

    public int getSum() {
        return sum;
    }
}
class threadclass extends Thread{
    private  ThreadDemo3 thread3 ;

    threadclass(ThreadDemo3 thread3){
        this.thread3= thread3;
    }
    @Override
    public  void run(){
        for(int i = 0; i<15 ; i++){
            thread3.incre();
        }
    }
}

public class ThreadSynchronization  {
    public static void main(String[] args) throws InterruptedException {
        ThreadDemo3 r = new ThreadDemo3();
        Thread t1 = new threadclass(r);
        Thread t2 = new threadclass(r);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("final Value : "+ r.getSum());
    }
}
