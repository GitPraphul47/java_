package patternsPrac;
// hour glass
// *  *  *  *  *  *  *  *  *
//    *  *  *  *  *  *  *
//       *  *  *  *  *
//          *  *  *
//             *
//          *  *  *
//       *  *  *  *  *
//    *  *  *  *  *  *  *
// *  *  *  *  *  *  *  *  *

public class Ad_pattern_06 {
    public static void main(String[] args) {
        // outer upper for looop
        for( int i = 5 ; i >= 1 ; i --  ){
            // for spaces
            for (int j = 1 ; j<= 5-i ; j ++){
                System.out.print("   ");

            }
            // for loop for pattern part
            for (int j =  1; j <= (2*i-1); j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        // lower pattern
        for(int i = 2 ; i <=5; i++){
//            for space
            for(int j = 4 ; j >= i ; j--){
                System.out.print("   ");
            }
            // for pattern
            for(int j = 1; j <= (2*i-1);j++ ){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
