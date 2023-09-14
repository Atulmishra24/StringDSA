public class StringPalindrom{
    public static boolean findPalin(String str){
        int n = str.length();
        boolean flag = true;
        for(int i = 0 ; i < n/2 ;i++){
            if(str.charAt(i) !=  str.charAt(n-1-i)){
               return false;
            }
        }
        System.out.println("yes it is Palindrome");
        return true;
    }
    public static void main(String[] args) {
        String str = "madam";
        System.out.println(findPalin(str));
    }
}
