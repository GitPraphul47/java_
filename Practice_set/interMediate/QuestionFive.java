package interMediate;
//Find the second largest element in an array.
public class QuestionFive {
    public void findSecondLargeNum(int arr[]){
        int secLargeNum = Integer.MIN_VALUE;
        int LargestNum = Integer.MIN_VALUE;
        for (int num : arr){
            if(num > LargestNum){
                secLargeNum = LargestNum;
                LargestNum = num;
            }else if (secLargeNum < num && LargestNum != num ){
                secLargeNum = num ;
            }
        }
        System.out.println("second Largest number is : "+ secLargeNum);
    }
    public static void main(String[] args) {
        QuestionFive qt = new QuestionFive();
        int[] arr = {15,12,4,8,1,7,20,9};
        qt.findSecondLargeNum(arr);
    }
}
