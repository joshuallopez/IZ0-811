public class charArrayAssignment {
    public static void main(String[] args){
        char[] characters = {'a', 'b', 'c', 'd'};

        characters[0] = characters[1];
        characters[1] = characters[2];
        characters[2] = characters[3];

        System.out.println(characters);

    }
}
