public class Methods {
    // Method that accepts any number of int values and returns their sum
    public static int add(int... values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        return sum;
    }

    // Method that accepts an array of int values and returns their concatenation as a String
    public static String Add(int[] numbers) {
        StringBuilder result = new StringBuilder();
        for (int number : numbers) {
            result.append(number);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        // Invoke the add method for summing up values
        int sum = add(1, 2, 3);
        System.out.println("Sum: " + sum);

        // Invoke the add method for concatenating values
        String concatenation = Add(new int[]{1, 2, 3});
        System.out.println("Concatenation: " + concatenation);

        // Additional tests
        System.out.println("Sum of 10, 20, 30: " + add(10, 20, 30));
        System.out.println("Concatenation of 10, 20, 30: " + add(new int[]{10, 20, 30}));
        System.out.println(Student.fixedField);

        Student student = new Student(1, "Vanessa", "Thornlea");
        System.out.println(student.getSchoolNames());

    }
}

