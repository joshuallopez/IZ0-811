import java.util.Scanner;

public class LoopTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number N: ");
        int N = scanner.nextInt();

        System.out.println("Prime numbers from 2 to " + N + " are: ");

        for (int potentialPrime = 2; potentialPrime <= N; potentialPrime++) {
            int divisorCount = 0;

            for (int i = 1; i <= potentialPrime; i++) {
                if (potentialPrime % i == 0) {
                    divisorCount++;
                }
            }

            if (divisorCount == 2) {
                System.out.println(potentialPrime);
            }
        }
    }
}
