import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź wartość stopni w Celcjuszach: ");
        double stopnieCelcjusza = scanner.nextDouble();
        System.out.println("Wprowadzona wartość: " + stopnieCelcjusza);

        double stopnieFahrenheita = 1.8 * stopnieCelcjusza + 32;
        System.out.println("Wartość w stopniach Fahrenheita: " + stopnieFahrenheita);

    }
}
