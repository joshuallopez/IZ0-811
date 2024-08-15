import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

//Generate 10 random double values between 5 and 15(excluding) using Math. random()
public class RandomNumbers {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            double randomValue = 5 + (Math.random() * (15 - 5));
            System.out.println("Random value " + (i + 1) + ": " + randomValue);
        }
    }

    //Generate 10 random double values between 1 and 10 (both including) using Math. random () and the Random class
    public static class RandomNumbersUsingMathRandom {
        public static void main(String[] args) {
            for (int i = 0; i < 10; i++) {
                double randomValue = 1 + (Math.random() * 9); // (Math.random() * (10 - 1 + 1)) + 1
                System.out.println("Random value using Math.random(): " + randomValue);
            }
        }
    }
    public static class RandomNumbersUsingRandomClass {
        public static void main(String[] args) {
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                double randomValue = 1 + (random.nextDouble() * 9); // (random.nextDouble() * (10 - 1 + 1)) + 1
                System.out.println("Random value using Random class: " + randomValue);
            }
        }
    }

    //Create a array with a few elements. Shuffle the elements of the array in a random fashion.
    public class ArrayShuffle {
        public static void main(String[] args) {
            // Create an array with a few elements
            String[] array = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};

            // Convert the array to a list
            List<String> list = Arrays.asList(array);

            // Shuffle the list
            Collections.shuffle(list);

            // Convert the list back to an array if needed (optional)
            String[] shuffledArray = list.toArray(new String[0]);

            // Print the shuffled array
            System.out.println("Shuffled array: " + Arrays.toString(shuffledArray));
        }
    }


}