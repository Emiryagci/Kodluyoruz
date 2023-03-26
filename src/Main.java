import java.util.*;
public class Main {
    public static void main(String[] args) {
        int number1, number2, choice;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first value: ");
        number1 = input.nextInt();

        System.out.print("Enter second value: ");
        number2 = input.nextInt();

        System.out.println("The operations:");
        System.out.println("1 : Sum");
        System.out.println("2 : Substraction");
        System.out.println("3 : Multiplication");
        System.out.println("4 : Division");
        System.out.print("Which operation do you want to do: ");

        choice = input.nextInt();

        switch(choice){
            case 1:
                System.out.println("Result: " + (number1 + number2));
                break;
            case 2:
                System.out.println("Result: " + (number1 - number2));
                break;
            case 3:
                System.out.println("Result: " + (number1 * number2));
                break;
            case 4:
                System.out.println("Result: " + (number1 / number2));
                break;
            default:
                System.out.println("Value is invalid.");
                break;
        }
    }
}