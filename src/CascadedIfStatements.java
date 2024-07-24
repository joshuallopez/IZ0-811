import java.util.Scanner;

public class CascadedIfStatements {
    public static void main(String[] args){
        int input = userInput();

        if(input % 2 == 0 && input % 3 == 0 && input % 5 ==0){
            System.out.println(235);
        }
        else if(input % 2 == 0 && input % 3 == 0){
            System.out.println(23);
        }
        else if(input % 2 == 0){
            System.out.println("Even");
        }
        else if(input % 3 == 0){
            System.out.println("Three");
        }
        else if(input % 5 == 0){
            System.out.println("Five");
        }
        else{
            System.out.println("Unknown");
        }
    }
    public static int userInput(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");

        int number = scanner.nextInt();
        scanner.close();

        return number;
    }
}
