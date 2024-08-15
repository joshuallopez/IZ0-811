import java.io.IOException;

public class Vowels {

    public static void main(String[] args)throws IOException {
        for(String arg: args){
            try {
                int vowelCount = countVowels(arg.toCharArray());
                System.out.println("Vowel count in '" + arg + "': " + vowelCount);
            }
            catch(Exception e){
                System.err.println("Wrong argument: " + arg +e.getMessage());
            }
        }
        int [] values = {1,2,3,4,5,6};
        try{
            int result = sum(values, 2,3);
            System.out.println(result);
        }catch(IllegalArgumentException | NullPointerException | ArrayIndexOutOfBoundsException e){
            if (e instanceof IllegalArgumentException) {
                System.out.println("IllegalArgumentException: " + e.getMessage());
            } else if (e instanceof NullPointerException) {
                System.out.println("NullPointerException: " + e.getMessage());
            } else if (e instanceof ArrayIndexOutOfBoundsException) {
                System.out.println("ArrayIndexOutOfBoundsException: " + e.getMessage());
            } else {
                System.out.println("Unexpected exception: " + e.getMessage());
            }
        }
    }

    public static int countVowels(char[] array)throws IOException {
        if (array == null) {
            return 0; // Or throw a custom exception for clarity
        }
        int vowelCount = 0;
        for(int i=0; i<array.length; i++){
            if(array[i]=='a' || array[i]=='e' || array[i]=='i' || array[i]=='o' || array[i]=='u'){
                vowelCount++;
            }
            else if(array[i]=='x'){
                throw new IOException("Array contains an x.");
            }
        }
        return vowelCount;
    }

    public static int sum(int[] values, int start, int end)throws IOException{
        if(values == null){
            throw new IOException("Array cannot be null");
        }
        if (values.length == 0) {
            throw new IllegalArgumentException("Array length cannot be zero");
        }
        if (start < 0 || end >= values.length || start > end) {
            throw new ArrayIndexOutOfBoundsException("Invalid start or end index");
        }
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += values[i];
        }

        if (sum == 0) {
            throw new IllegalArgumentException("Sum cannot be zero");
        }

        return sum;
    }
}
