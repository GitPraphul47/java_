package patternsPrac;

// number pyramid

public class Ad_pattern_03 {
    public static void main(String[] args) {
        // outer loop
        for(int i = 1;i <= 5 ;i++){
            // spaces in the start
            for (int j = 1; j <= 5 -i; j++){
                System.out.print("   ");
            }
            for (int j = 1 ; j <= i ; j++  ){
                //if ((i +j)%2 ==0 )
                System.out.print( " "+i+" " + "   ");
            }
            System.out.println();
        }
    }
}
