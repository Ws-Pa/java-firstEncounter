import java.util.Scanner;

public class Zad4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź wysokość choinki: ");
        int wysokosc = scanner.nextInt(), wiersz, gwiazdki = 1, i;
        for (wiersz = 0; wiersz < wysokosc; wiersz++) {

            for (i = wiersz; i < wysokosc; i++) {
                System.out.print(" ");
            }

            for (i = 0; i < gwiazdki; i++) {
                System.out.print("*");
            }
            gwiazdki += 2;
            System.out.println("");
        }
    }
}
