package multiThreading;
class SavingsAccount{
    private int bankBalance = 0;
    public synchronized void setBankBalance(String Name){
        bankBalance ++;
        System.out.println("Balance : "+ bankBalance + " User "+ Name);

    }
    public int getBankBalance(){
        return bankBalance;
    }
}
class ClientSide extends Thread {
    SavingsAccount acount;
    ClientSide(SavingsAccount account){
        this.acount= account;
    }

    @Override
    public void run(){
        for(int i = 0; i <15 ; i++){
            String Name = Thread.currentThread().getName();
            acount.setBankBalance(Name);
//            try {
//                Thread.sleep(1000);
//            }catch (Exception e){
//                System.out.println("Something Wrong ");
//            }
        }
    }
}

public class ThreadSynchronization2 {
    public static void main(String[] args)  throws InterruptedException {
        SavingsAccount account = new SavingsAccount();
        Thread user1 =new ClientSide(account);
        Thread user2 =new ClientSide(account);

        user1.start();
        user2.start();
        user1.join();
        user2.join();
        System.out.println(" final Baank Balance : " + account.getBankBalance());
        System.out.println(" final 2 Baank Balance : " + account.getBankBalance());

    }
}
