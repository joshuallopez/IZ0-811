public class ExerciseThree {
    public static void main(String[] args){

        String[][] exerciseThree =  {
                {"One", "Two"},
                {"Three", "Four", "Five"},
                {"Six", "Seven", "Eight"}
        };

        System.out.println("Length of String array: " + exerciseThree.length);

        for(int i = 0; i<exerciseThree.length;i++){
            System.out.println("Length of inner array: " + (i + 1) + ": "+ exerciseThree[i].length);
        }
    }

}
