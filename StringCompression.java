public class StringCompression{




    //optimize approach using String builder O(n)


    public static void findCompressStrOptimized(String str){
        StringBuilder newStr = new StringBuilder("");

        for( int i = 0 ; i < str.length() ; i++){
            Integer count = 1;
            while( i < str.length() - 1 && str.charAt(i) == str.charAt(i+1) ){
                    count++;
                    i++;
            }
          newStr.append(str.charAt(i));
          if(count>1){
            newStr.append(count.toString());
          }
        }


        System.out.println(newStr);
    }



    //Brute force String Compression o(n^2)

    public static void findCompressStrBruteForce(String str){
      
        String newStr = "";
        for(int i = 0 ; i< str.length();i++){
            int count = 1;
          while( i < str.length() - 1 && str.charAt(i) == str.charAt(i+1) ){
             count++;
             i++;
          }
          newStr = newStr+str.charAt(i);


          if(count>1){
            newStr = newStr + count ; 
          }
          
        }

      System.out.println(newStr);
    }




    public static void main(String[] args){
     
      String unCompress = "aaaabbbcccccdddddddeee";
      findCompressStrBruteForce(unCompress);
  findCompressStrOptimized(unCompress);


    }
}