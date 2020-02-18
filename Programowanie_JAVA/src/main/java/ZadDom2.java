import java.util.Scanner;

public class ZadDom2 {
    public static void main(String[] args) {
        int[] pesel;
        pesel = new int[11];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < pesel.length; i++) {
            System.out.println("Wprowadź " + (i+1) + " cyfrę PESEL.");
            int iks = scanner.nextInt();
            pesel[i] = iks;
        }
        int sumKontrol = pesel[0] + 3 * pesel[1] + 7 * pesel[2] + 9 * pesel[3] + pesel[4] + 3 * pesel[5] + 7 * pesel[6] + 9 * pesel[7] + pesel[8] + 3 * pesel[9] + pesel[10];

        if (sumKontrol % 10 == 0) {
            System.out.println("Dziękujemy za wprowadzenie poprawnych danych.");
        } else
            System.out.println("Wprowadzono nieprawidłowy PESEL.");
    }
}