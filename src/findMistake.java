public class findMistake {
    public static void main(String[] args) {
        String[] chars = new String [4] ;
        char cha = 97;
        for (int c = 0; c<chars.length; c++){
            chars [c] = ""+cha;
            cha++;
        }
        for(String s:chars){
            System.out.println(s);
        }
    }
    public static void findMis(){
        String[] chars = new String [4] ;
        char cha = 96;
        for(String s:chars){
            s = ""+cha;
            cha++;
        }
    }
}
