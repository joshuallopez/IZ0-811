public class CopyLoop {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        int[] arrayCopy = new int[array.length];

        for(int i = 0; i < array.length; i++){
            arrayCopy[i] = array[array.length - 1 - i];
        }
        for(int i : arrayCopy){
            System.out.print(i + ", ");
        }
    }
}
