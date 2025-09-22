package patternsPrac;
// pattern 8
//         1
//         2  3
//         4  5  6
//         7  8  9 10
//         11 12 13 14 15

public class Pattern_08 {
    public static void main(String[] args) {
        int num = 1;
        // for loop for rows
        for(int i = 0; i <5; i++){
            // inner loop for inside
            for(int j = 0 ; j <= i; j++){
                System.out.print(" "+ num+ " " );
                num ++;
            }
            System.out.println();
        }
    }
}
