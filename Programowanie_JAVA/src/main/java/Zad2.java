import java.util.Scanner;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź wartość towaru: ");
        double cena = scanner.nextDouble();
        System.out.println("Wprowadź ilość rat: ");
        double dlugosc = scanner.nextDouble();

        if (dlugosc<6) System.out.println("Sprzedaż ratalna nie jest dostępna.");
        else if (dlugosc<=12) {
            double rata = ((cena+(cena*0.025/12*dlugosc))/dlugosc);
            System.out.println("Kwota raty wynosi: " + rata);
        } else if (dlugosc<=24) {
            double rata = ((cena+(cena*0.05/12*dlugosc))/dlugosc);
            System.out.println("Kwota raty wynosi: " + rata);
        } else if (dlugosc<=48) {
            double rata = ((cena+(cena*0.1/12*dlugosc))/dlugosc);
            System.out.println("Kwota raty wynosi: " + rata);
        } else System.out.println("Sprzedaż ratalna nie jest dostępna.");

    }
}
