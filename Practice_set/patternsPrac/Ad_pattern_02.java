package patternsPrac;
// parrallelogram  || solid Rhombus

//             *  *  *  *  *
//          *  *  *  *  *
//       *  *  *  *  *
//    *  *  *  *  *
// *  *  *  *  *

public class Ad_pattern_02 {
    public static void main(String[] args) {
        // outer loop
//        for(int i = 5 ; i > 0 ; i--){
//            // inner left part
//            for(int j = 1; j <=5; j++ ){
//                if(i <= j) {
//                    System.out.print(" * ");
//                }
//                else {
//                    System.out.print("   ");
//                }
//            }
//            for(int j = 1 ; j < i; j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

        // other solution is :
        for(int i = 5 ; i > 0 ; i -- ){
            // left space part
            for(int j = 1; j < i; j++  ){
                System.out.print("   ");
            }
            // right star part
            for (int j = 5 ; j >0 ; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
