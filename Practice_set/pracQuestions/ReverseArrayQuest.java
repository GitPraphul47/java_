package pracQuestions;

public class ReverseArrayQuest {
    public static void main(String[] args) {
        ReverseArrayQuest ra = new ReverseArrayQuest();
        int arr[]= { 1,2,3,4,5,6};
        System.out.println("the array before the reverse : { ");
        for(int i : arr ){
            System.out.print(i + " ");
        }
        System.out.print(" }");
         ra.revArray(arr);
    }
    public void revArray(int arr[]){
        // code to revers an array :
        int temp ;
        int x = arr.length;
        for (int i = 0 ;  i < x /2; i ++ ){
            temp = arr[i];
            arr[i]= arr[x-1-i];
            arr[x-1-i]= temp;
        }
        //printing the reversed array :
        System.out.println("\n the array before the reverse : { ");
        for(int i : arr ){
            System.out.print(i+" ");
        }
        System.out.print("}");
    }
}
