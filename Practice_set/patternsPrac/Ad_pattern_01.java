package patternsPrac;
// butterfly pattern
//         *                    *
//         *  *              *  *
//         *  *  *        *  *  *
//         *  *  *  *  *  *  *  *
//         *  *  *  *  *  *  *  *
//         *  *  *        *  *  *
//         *  *              *  *
//         *                    *
public class Ad_pattern_01 {
    public static void main(String[] args) {
        // upper outer loop
        for(int i = 0 ; i <4 ; i++){
            // left inner part
            for(int j = 0 ; j<i+1; j++ ){
                System.out.print(" * ");
            }
            // printing spaces
            for(int j = 0 ; j < 2*(3-i); j ++){
                System.out.print("   ");
            }
            // right inner part
            for(int j = 0 ;j < i+1 ; j++ ){
                System.out.print(" * ");
            }
            System.out.println("");
        }
        // lower outer loop
        for(int i =0 ; i < 4; i++){
            // left inner part of lower loop
            for(int j = 4 ; j >i; j--){
                System.out.print(" * ");
            }
            // loop for spaces
            for (int j = 0 ; j < 2*i; j++){
                System.out.print("   ");
            }
            // right inner part of lower loop
            for(int j = 4 ; j >i; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
