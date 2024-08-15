public class SpecialCharacterStrings {
    public static void main(String[] args) {
        String stringWithNewLine = "This is a string\nwith a new line LENGTH: ";
        String stringWithBacklash = "This is a string with a backlash \\ LENGTH: ";

        int indexStringone = stringWithNewLine.indexOf("\n");
        int indexStringtwo = stringWithBacklash.indexOf("\\");

        System.out.println("String 1: " + stringWithNewLine + stringWithNewLine.length() + " INDEX: " + indexStringone);
        System.out.println("String 2: " + stringWithBacklash + stringWithBacklash.length() + " INDEX: " + indexStringtwo);

        spaceNumber("Extraordinary");
        spaceNumber("Nothing found");
        transformation("234567890");
        System.out.println(transformation2("123456789"));

        String [] fruits = {"Apple", "Banana", "Orange", "Strawberry"};
        System.out.println(concatenation(fruits));
        confusion();

    }
    public static void spaceNumber(String string){
        int counter = 0;
        boolean foundX = false;

        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == 'x') {
                foundX = true;
                break;
            } else if(string.charAt(i) == ' '){
                counter++;            }
        }
        if (foundX) {
            System.out.println("The number of spaces until x: " + counter);
        } else {
            System.out.println("Number of spaces without an x found: " + counter);
        }
    }

    public static void transformation(String transformation){
        int length = transformation.length();
        StringBuilder result = new StringBuilder(length);

        for(int i = 0; i < length - 4; i++){
            result.append('X');
        }
        result.append(transformation.substring(length - 4));
        System.out.println(result);
    }
    public static String transformation2(String transformation){
        char [] charArray = transformation.toCharArray();
        for(int i = 0; i < charArray.length - 4; i++){
            charArray[i] = 'X';
        }
        return new String(charArray);
    }

    public static String concatenation(String[] string){
        if(string == null){
            return "";
        }
        StringBuilder results = new StringBuilder();
        for(String str: string){
            results.append(str);
        }
        return results.toString();
    }
    public static void confusion(){
        String s = "a";
        String [] sa = {"a", s, s. substring(0, 1), new String("a"), ""+'a' };
        for (int i=0; i< sa.length; i++){
            System.out.println (i) ;
            System.out.println(s == sa [i]) ;
            System.out.println(s.equals(sa[i])) ;
            }
    }
}
