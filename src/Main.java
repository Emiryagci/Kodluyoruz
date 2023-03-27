import java.util.*;
public class Main {

    static double normalCost(int distance){
        double cost = distance * 0.10;

        return cost;
    }
    static double ageDiscount(int age, double distanceCost){

        double discountCost = 0;
        if(age < 12) {
            discountCost = distanceCost * 0.5;

        }else if(age >= 12 || age <= 24){
            discountCost = distanceCost * 0.1;

        }
        else if(age > 65){
            discountCost = distanceCost * 0.3;

        }
        return discountCost;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age, distance, kindOfFly;
        double distanceCost = 0;
        double ageCost = 0;
        double flyCost = 0;
        double ticketDiscount = 0;

        System.out.print("Enter the distance: ");
        distance = input.nextInt();
        distanceCost = normalCost(distance);

        System.out.print("Enter the age: ");
        age = input.nextInt();
        ageCost = ageDiscount(age, distanceCost);

        System.out.print("1 => One way. 2 => Go-Back.");
        System.out.print("Enter the kind of fly: ");
        kindOfFly = input.nextInt();
        if(age < 0 || distance < 0){
            kindOfFly = -1;
        }

        switch(kindOfFly){
            case 1:
                flyCost = distanceCost - ageCost;
                System.out.print(" " + flyCost + "TL");
                break;
            case 2:
                ticketDiscount = distanceCost * 0.2;
                flyCost = (distanceCost - ageCost - ticketDiscount) * 2;
                System.out.print(" " + flyCost + "TL");
                break;
            default:
                System.out.print("Hatalı Veri Girdiniz !");


        }
    }
}