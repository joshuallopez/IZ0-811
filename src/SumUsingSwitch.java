import java.util.Scanner;

public class SumUsingSwitch{
    public static void main(String[] args){
        int userInput = userInput();
        if(userInput < 0 || userInput > 5){
            System.out.println("Invalid number, try again.");
            return;
        }

        System.out.println("The sum of the numbers to input number is " + calculateSum(userInput));
    }
    public static int userInput(){
        System.out.println("Enter a number from 0 to 5: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
        return input;
    }
    public static int calculateSum(int userInput){
        int sum = 0;
        switch(userInput){
            case 5: sum += 5;
            case 4: sum += 4;
            case 3: sum += 3;
            case 2: sum += 2;
            case 1: sum += 1;
            case 0:
                break;
            default: System.out.println("Invalid number");
        }
        return sum;
    }
}