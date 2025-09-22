package string;

public class StringMemoryTestDemo {
    public static void main(String[] args) {
        String s1 = "Praphul";
        String s2 = new String("Praphul");
        System.out.println(s1== s2);
        String s3 = "Praphul";
        System.out.println(s1==s3);
    }
}
