import java.util.Arrays;

public class moreArrayLoopStuff {
    public static void main(String[] args){
        //boolean[] exerciseOne = new boolean[3];
        //System.out.println(Arrays.toString(exerciseOne));
        int[] first = new int[3];
        int[] second = {};
        int[] third = null;

        printArrayDetails("first", first);
        printArrayDetails("second", second);
        printArrayDetails("third", third);


    }

    public static void printArrayDetails(String arrayName, int[] array){
        if(array != null){
            System.out.println("Length of " + arrayName + " equals: " + array.length);
            System.out.println("Elements of " + arrayName + "array: ");
            for (int element : array){
                System.out.print(element + " ");
            }
            System.out.println();
        }else{
            System.out.println("Array is null");
        }
    }
}
