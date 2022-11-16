import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double a,b,c, Toplam, Armut=2.14, Elma=3.67, Muz=0.95;

        System.out.print("Armut Kaç Kilo = ");
        a = input.nextDouble();

        System.out.print("Elma Kaç Kilo = ");
        b = input.nextDouble();

        System.out.print("Muz Kaç Kilo = ");
        c =input.nextDouble();

        Toplam = ((a*Armut)+(b*Elma)+(c*Muz));

        System.out.println("Toplam Tutar = "+ Toplam);



    }
}