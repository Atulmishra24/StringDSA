
import java.util.*;
public class AssAnsLowerVowel{

    public static void findLowerVowelCount(String str){
         int count = 0;
         for(int i =0;i<str.length;i++){
            char c =str.charAt(i);
            if(c=='a' || c=='e' || c=="i" || c=='o' || c=='u'){
               count++;
            }

         }
       System.out.println("The Number of lower count vowel is  : " + count);



    }

    public static void main(String [] args){
       Scanner sc = new Scanner(System.in);
      String input = sc.nextLine();


      findLowerVowelCount(input);

    }
}