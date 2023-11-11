import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double armut = 2.14, elma = 3.67, domates = 1.11, muz = 0.95, patlican = 5.0;


        System.out.println("Armut Kaç Kilo? :");
        double armutKilo = input.nextDouble();

        System.out.println("elma Kaç Kilo? :");
        double elmaKilo = input.nextDouble();

        System.out.println("domates Kaç Kilo? :");
        double domatesKilo = input.nextDouble();

        System.out.println("muz Kaç Kilo? :");
        double muzKilo = input.nextDouble();

        System.out.println("Patlıcan Kaç Kilo? :");
        double patlicanKilo = input.nextDouble();
        double toplamTutar = (armutKilo * armut) + (elmaKilo * elma) + (domatesKilo * domates) + (muzKilo * muz) + (patlicanKilo * patlican);
        System.out.println("Toplam Tutar: " + toplamTutar + " TL");


    }
}