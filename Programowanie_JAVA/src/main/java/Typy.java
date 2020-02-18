public class Typy {
    public static void main(String[] args) {
        byte days;
        int lightSpeed = 299792;
        long distance;

        char znak = 'a';
            znak = 252; //litery przechowywane jako Unicode

        days = 100;
        distance = days * lightSpeed * 24 * 3600;
        System.out.println("Distance = " + distance);

        System.out.println(days + " " + distance); //wyświetlanie dwóch liczb bez dodawania - trzeba wstawić stringa
        System.out.println("a = " + znak);
        System.out.println("Wartość 10 > 9 to " + (10 > 9));






    }

}
