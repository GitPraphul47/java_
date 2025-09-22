package interMediate;

//Sort an array of integers in ascending order.
public class QuestionFour {
    public void sortArr(int[] arr){
//        int i = 0;
//        int j = 0;
        int temp =0;
        for(int i = 0;i<arr.length;i++){
            for(int j = i+1; j < arr.length;j++){
                if(arr[j]<arr[i]){
                    temp = arr[i];
                    arr[i]= arr[j];
                    arr[j]= temp ;
                }
            }
        }
        for(int i : arr){
            System.out.print(i+", ");
        }
    }
    public static void main(String[] args) {
        QuestionFour qt = new QuestionFour();
        int[] arr = {15,12,4,8,1,7,20,9};
        qt.sortArr(arr) ;

    }
}
