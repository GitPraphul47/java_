package patternsPrac;
// pattern 2 // beginner
//         *  *  *  *  *
//         *           *
//         *           *
//         *  *  *  *  *

public class Pattern_02 {
    public static void main(String[] args) {
        for(int i = 0 ; i < 4 ; i++ ){
            for(int j = 0 ; j<5 ; j++){
                //mine :  this works fine
//                if((i == 1 || i == 2) && (j > 0 && j<4)) {
//                    System.out.print("   ");
//                }
//                else {
//                    System.out.print(" * ");
//                }
                // here done one video
                if(i == 0 || j == 0 || i ==3 || j == 4 ){
                    System.out.print(" * ");
                }else{
                    System.out.print("   ");
                }
            }
            System.out.println("");
        }
    }
}
