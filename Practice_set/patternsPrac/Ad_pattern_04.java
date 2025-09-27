package patternsPrac;
// pallindromic pattern
//               1
//            2  1  2
//         3  2  1  2  3
//      4  3  2  1  2  3  4
//   5  4  3  2  1  2  3  4  5

public class Ad_pattern_04 {
    public static void main(String[] args) {
        // for loop for outer loop
        for (int i = 1 ; i <= 5 ; i++ ){
            // for loop for blank spaces
            for(int j = 4  ;j >=i ; j -- ){
                System.out.print("   ");
            }
            // for loop for pattern in left side
            for (int j = i ; j >= 1; j-- ){
                System.out.print(" " +j+" ");
            }
            for (int j = 2 ; j <= i ; j++){
                System.out.print(" "+j+" ");
            }
            System.out.println();
        }
    }
}
