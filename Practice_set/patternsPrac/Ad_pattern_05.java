package patternsPrac;
// diamond pattern :
//             *
//          *  *  *
//       *  *  *  *  *
//    *  *  *  *  *  *  *
// *  *  *  *  *  *  *  *  *
//    *  *  *  *  *  *  *
//       *  *  *  *  *
//          *  *  *
//             *
public class Ad_pattern_05 {
    public static void main(String[] args) {
    // outer for loop for upper part
        for(int i = 1 ; i <= 5 ; i ++){
            //  for loop for space left side
            for (int j = 4 ; j >= i; j-- ){
                System.out.print("   ");
            }
//             for loop for middle part
            for(int j = 1 ; j <= (2*i)-1 ;j++ ){
                System.out.print(" * ");
            }
             System.out.println();
        }
        // loop for lower part
        for(int i = 4 ; i >0 ; i--){
            // for blank spaces
            for (int j = 0 ; j <= 4-i ; j++){
                System.out.print("   ");
            }
            // for loop for middle part of lower part
            for(int j = 1 ; j <= 2*i-1; j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
