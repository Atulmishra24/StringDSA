public class largestString{
    public static void main(String[] args){
        String fruit[]= {"apple" , "banana" , "mango" , "orange" , "Nashpati"};
        String largest  = fruit[0];

        for(int i = 1 ; i< fruit.length ; i++){
            if(largest.compairTo(fruit[i]) < 0){
                 largest = fruit[i];
            }
        }

       System.out.println(largest);
    }

}