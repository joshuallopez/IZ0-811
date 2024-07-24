import java.util.ArrayList;
import java.util.Scanner;

public class commandLine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String search = scanner.nextLine();
        System.out.println("Enter term to see availability: ");
        // Create an ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add all the command line arguments to the list
        for (String arg : args) {
            list.add(arg);
        }

        // Print the list
        System.out.println("List: " + list);

        // Search for a particular argument in the list and print its index
        // replace with the term you want to search for
        int index = list.indexOf(search);
        if (index != -1) {
            System.out.println("Argument '" + search + "' found at index: " + index);
        } else {
            System.out.println("Argument '" + search + "' not found in the list.");
        }

        // Check if a particular argument is present in the list and if present, remove it
        String removeArg = "removeTerm"; // replace with the term you want to remove
        if (list.contains(removeArg)) {
            list.remove(removeArg);
            System.out.println("Argument '" + removeArg + "' was present and removed from the list.");
        } else {
            System.out.println("Argument '" + removeArg + "' not found in the list.");
        }

        // Print the updated list
        System.out.println("Updated list: " + list);
    }
}
