package patternsPrac;
// pattern 9 :
//        1
//        01
//        101
//        0101
//        10101
public class Pattern_09 {
    public static void main(String[] args) {
//        int arr [] = {1,0};
//        int index = 0;
        for(int i = 0 ; i < 5; i++){
            for(int j = 0; j < i +1; j++){
//                index = index % arr.length;
//                System.out.print(arr[index]);
//                index ++;
                if((i+j)%2==0){
                    System.out.print(" 1 ");
                }
                else{
                    System.out.print(" 0 ");
                }
            }
            System.out.println();
        }
    }
}
