import java.util.*;
public class Main {
    public static void main(String[] args) {
        int day;
        String month;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the birth month: ");
        month = input.nextLine();

        System.out.print("Enter the birth day: ");
        day = input.nextInt();

        if(month.equals("March") && day >= 21){
            System.out.print("You're an Aries.");
        }else if(month.equals("April") && day <= 20){
            System.out.print("You're an Aries.");
        }

        if(month.equals("April") && day >= 21){
            System.out.print("You're a Taurus.");
        }else if(month.equals("May") && day <= 21){
            System.out.print("You're a Taurus.");
        }

        if(month.equals("May") && day >= 22){
            System.out.print("You're a Gemini.");
        }else if(month.equals("June") && day <= 22){
            System.out.print("You're a Gemini.");
        }

        if(month.equals("June") && day >=23){
            System.out.print("You're a Cancer.");
        }else if(month.equals("July") && day <= 22){
            System.out.print("You're a Cancer.");
        }

        if(month.equals("July") && day >= 23){
            System.out.print("You're a Leo.");
        }else if(month.equals("August") && day <= 22){
            System.out.print("You're a Leo.");
        }

        if(month.equals("August") && day >= 23){
            System.out.print("You're a Virgo.");
        }else if(month.equals("September") && day <=22){
            System.out.print("You're a Virgo.");
        }

        if(month.equals("September") && day >=23){
            System.out.print("You're a Libra.");
        }else if(month.equals("October") && day <= 22){
            System.out.print("You're a Libra.");
        }

        if(month.equals("October") && day >= 23){
            System.out.print("You're a Scorpio.");
        }else if(month.equals("November") && day <= 21){
            System.out.print("You're a Scorpio.");
        }

        if(month.equals("November") && day >= 22){
            System.out.print("You're Sagittarius.");
        }else if(month.equals("December") && day <= 21){
            System.out.print("You're Sagittarius.");
        }

        if(month.equals("December") && day >= 22){
            System.out.print("You are Capricorn.");
        }else if(month.equals("January") && day <= 21){
            System.out.print("You are Capricorn.");
        }

        if(month.equals("January") && day >= 22){
            System.out.print("You're Aquarius.");
        }else if(month.equals("February") && day <= 19){
            System.out.print("You're Aquarius.");
        }

        if(month.equals("February") && day >= 20){
            System.out.print("You're Aquarius.");
        }else if(month.equals("March") && day <= 20){
            System.out.print("You're Aquarius.");
        }
    }
}