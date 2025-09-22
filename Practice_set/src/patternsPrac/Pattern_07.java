package patternsPrac;
// pattern 7
//         1  2  3  4  5
//         1  2  3  4
//         1  2  3
//         1  2
//         1
public class Pattern_07 {
    public static void main(String[] args) {
        for(int i = 1 ; i < 6 ; i++){
            for(int j = 1; j <=6-i; j++){
                System.out.print(" "+ j + " ");
            }
            System.out.println();
        }
    }
}
