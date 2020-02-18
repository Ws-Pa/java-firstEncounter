import java.util.Scanner;

public class ZadDom2a {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj PESEL");
        String pesel = scanner.next();

        while (pesel.length() !=11) {
            System.out.println("Podaj PESEL");
            pesel = scanner.next();
        }
        int suma = 1*Character.getNumericValue(pesel.charAt(0))
                 + 3*Character.getNumericValue(pesel.charAt(1))
                 + 7*Character.getNumericValue(pesel.charAt(2))
                 + 9*Character.getNumericValue(pesel.charAt(3))
                 + 1*Character.getNumericValue(pesel.charAt(4))
                 + 3*Character.getNumericValue(pesel.charAt(5))
                 + 7*Character.getNumericValue(pesel.charAt(6))
                 + 9*Character.getNumericValue(pesel.charAt(7))
                 + 1*Character.getNumericValue(pesel.charAt(8))
                 + 3*Character.getNumericValue(pesel.charAt(9))
                 + 1*Character.getNumericValue(pesel.charAt(10));

        if (suma % 10 == 0) {
            System.out.println("PESEL prawidlowy");
        } else {
            System.out.println("PESEL nieprawidlowsy");
        }


    }
}
