public class continuedBreak {
    public static void doIt(int h){
        int x = 1;
        LOOP1: do{
            LOOP2: for(int y = 1; y <= h; y++){
                if(x == 1)continue;

                if(x*x + y*y == h*h){
                    System.out.println("Found " + x +"+y");
                    break LOOP1;
                }
            }
            x++;
        }while(x<h);
    }
    public static void main(String[] args){
        doIt(6);
    }
}
