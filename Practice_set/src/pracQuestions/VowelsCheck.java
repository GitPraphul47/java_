package pracQuestions;
import java.util.Scanner;

public class VowelsCheck {
    public int VowelCount(String St ){
        int vowelsCount = 0;
        String vowels = new String("aeiou");
        String lowerLetter = St.toLowerCase();
        for(int i = 0; i < lowerLetter.length(); i++){
            char ch = lowerLetter.charAt(i);
            if(Character.isLetter(ch)){
                if (vowels.indexOf(ch)!= -1){
                    vowelsCount ++;
                }
            }
        }
        return vowelsCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        VowelsCheck vc = new VowelsCheck();
        System.out.println(" Enter the string : ");
        String st = sc.nextLine();
        int VowelCount = vc.VowelCount(st);
        System.out.println(" the numeber of vowels in String ( "+ st + " ) are : "+ VowelCount);
    }
}
