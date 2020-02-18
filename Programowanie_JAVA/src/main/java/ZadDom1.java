import java.util.Scanner;

public class ZadDom1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadź wartość x: ");
        int iks = scanner.nextInt();
        System.out.println("Wprowadzona wartość: " + iks);

        System.out.println("Wprowadź wartość y: ");
        int igrek = scanner.nextInt();
        System.out.println("Wprowadzona wartość: " + igrek);

        System.out.println("Wprowadź wartość a: ");
        int a = scanner.nextInt();
        System.out.println("Wprowadzona wartość: " + a);

        System.out.println("Wprowadź wartość b: ");
        int be = scanner.nextInt();
        System.out.println("Wprowadzona wartość: " + be);

        for (int i = a; i <= be; i++) {
            if (i % iks == 0 && i % igrek !=0){
                System.out.println("Liczba: " + i + " jest podzielna przez " + iks + ", i nie jest podzielna przez " + igrek);
            }
        }
    }
}
