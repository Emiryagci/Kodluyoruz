import java.util.*;
public class Main {
    public static void main(String[] args) {
        int math, turkish, music, physic, chemistry;
        int numberOfPoint = 5;
        Scanner input = new Scanner(System.in);

        System.out.print("Math point: ");
        math = input.nextInt();
        if (math > 100 || math < 0) {
            math = 0;
            numberOfPoint--;
        }

        System.out.print("Turkish point: ");
        turkish = input.nextInt();
        if (turkish > 100 || turkish < 0) {
            turkish = 0;
            numberOfPoint--;
        }

        System.out.print("Music point: ");
        music = input.nextInt();
        if (music > 100 || music < 0) {
            music = 0;
            numberOfPoint--;
        }

        System.out.print("Physic point: ");
        physic = input.nextInt();
        if (physic > 100 || physic < 0) {
            physic = 0;
            numberOfPoint--;
        }

        System.out.print("Chemistry point: ");
        chemistry = input.nextInt();
        if (chemistry > 100 || chemistry < 0) {
            chemistry = 0;
            numberOfPoint--;
        }
        int average = (math + physic + music + turkish + chemistry) / numberOfPoint;
        if(average >= 55){
            System.out.println("Congratulations!!");
        }else{
            System.out.println("Unfortunately. You couldn't pass.");
        }

    }
}