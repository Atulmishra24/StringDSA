import java.util.Arrays;

public class AssAnsStringAnagram{

  public static void findAnagram(String s1 , String s2){
      s1= s1.toLowerCase();
      s2= s2.toLowerCase();
     if(s1.length()==s2.length()){
       char arr1 []  = s1.toCharArray();
       char arr2 []  = s2.toCharArray();
       Arrays.sort(arr1);
       Arrays.sort(arr2);
      boolean result = Arrays.equals(arr1,arr2);
      if(result){
        System.out.println("Both String are Anagram");
      }
      else{
        System.out.println("Both String are not Anagram");
      }
    }
    else{
      System.out.println("Both String are not Anagram");
     }
}

  public static void main(String[] args) {
  
      String str1 = "Rache";
      String str2 ="Carjj";
 
     findAnagram(str1,str2);     
  }

}