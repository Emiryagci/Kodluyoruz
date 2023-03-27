import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2, number3;

        System.out.print("Enter first number: ");
        number1 = input.nextInt();

        System.out.print("Enter second number: ");
        number2 = input.nextInt();

        System.out.print("Enter third number: ");
        number3 = input.nextInt();

        if(number1 > number2 && number1 > number3){
            if(number2 > number3){
                System.out.println(" " + number3 + " " + number2 + " " + number1);
            }else{
                System.out.print(" " + number2 + " " + number3 + " " + number1);
            }
        }
        if(number2 > number1 && number2 > number3){
            if(number1 > number3){
                System.out.print(" " + number3 + " " +number1 + " " + number2);
            }else{
                System.out.print(" " + number1 + " " + number3 + " " +number2);
            }
        }
        if(number3 > number1 && number3 > number2){
            if(number1 > number2){
                System.out.print(" " + number2 + " " + number1 + " " + number3);
            }else{
                System.out.print(" " + number1 + " " + number2 + " " + number3);
            }
        }
    }
}