import java.util.Scanner;

public class Conditions {
    public static void main(String[] args){
       int userInput = userInput();

        methodOne(userInput);
        methodTwo(userInput);
        methodThree(userInput);
    }

    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any number: ");
        int value = scanner.nextInt();
        scanner.close();

        return value;
    }

    public static void methodOne(int number){
        if(number % 2 == 0){
            System.out.println("Your number: " + number + " is Even");
        }
        else{
            System.out.println("Your number: " + number + " is Odd");
        }
    }

    public static void methodTwo(int number){
        String value = number % 2 == 0 ? "Even" : "Odd";
        System.out.println("Your number: " + number + " is " + value);
    }

    public static void methodThree(int number){
        switch(number % 2){
            case 0: System.out.println("Your number: " + number + " is Even");
                break;
            case 1: System.out.println("Your number: " + number + " is Odd");
                break;
        }
    }
}
