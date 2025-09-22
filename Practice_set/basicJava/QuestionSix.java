package basicJava;
import java.util.Scanner;

//Count vowels and consonants in a given string
public class QuestionSix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String vowel = new String("aeiou");
        System.out.println("enter the string ");
        String word = sc.nextLine().toLowerCase();
//        char [] vowel = new char[]{'a', 'e', 'i', 'o', 'u'};
        int vowelNum =0;
        int constNum = 0;
        int blankSpace= 0;
 // ------- this is my solution but can be improved
        /*for(int i = 0; i< word.length(); i++){
            char ch = word.charAt(i);
            String st = String.valueOf(ch);
            if (vowel.indexOf(ch) != -1){
                vowelNum += 1;
            }else if (ch == ' '){
                blankSpace +=1;
            }
            else {
                constNum +=1;
            }
        }*/
        // here is the best solution
        for(int i = 0 ; i < word.length(); i++) {
            char ch = word.charAt(i); // to get the characters one by one
            if (Character.isLetter(ch)) { // check wether the character is letter or not , it does not count the space and special characters
                if (vowel.indexOf(ch) != -1) {
                    vowelNum += 1;

                } else {
                    constNum += 1;
                }
            }
        }
        System.out.println("the vowels are : "+vowelNum+" and constants are : " +constNum+ "blank space are "+ blankSpace);
    }
}
