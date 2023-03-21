import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double price;
        Scanner input = new Scanner(System.in);
        System.out.print("Ücret tutarını girin : ");
        price = input.nextDouble();
        double kdv = (price >= 0 && price <= 1000) ? 18 : 8;

        double result = (price * kdv) / 100;
        result += price;
        System.out.println("KDV'siz fiyat = " + price);
        System.out.println("KDV'li fiyat = " + result);
        System.out.println("KDV tutarı = " + kdv);

    }
}