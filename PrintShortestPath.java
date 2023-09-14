public class PrintShortPath{

    public static void findShortestPath(String str)
    {
        int x =0 , y=0;
        for(int i =0; i< str.length(); i++){
            
            char dir = str.charAt(i);
            if(dir=='S'){
                y--;
            }
            else if(dir=='N'){
                y++;
            }
            else if (dir=='E'){
                x++;
            }
            else if (dir=='W'){
                x--;
            }
            else{
                System.out.println("At "+ i + " index you have put wrong Direction");
                break;
            }
        }

        int X2 = x*x;
        int Y2 = y*y;
        System.out.println("The Shortest Path is : "+ Math.sqrt(X2+Y2));
    }
    public static void main(String[] args) {
        String path = "WNEWSEEWSSN";
        findShortestPath(path);
    }
}