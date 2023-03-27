import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature: ");
        int heat = input.nextInt();

        if(heat < 5){
            System.out.println("You can go to ski.");
        }else if(heat > 25){
            System.out.println("You can go to the swimming.");
        }
        if(heat > 5 && heat < 15){
            System.out.println("You can go to the cinema.");
        }
        if(heat > 10 && heat < 25){
            System.out.println("You can go to the picnic.");
        }
    }
}