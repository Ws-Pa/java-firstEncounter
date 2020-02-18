import java.util.*;

public class Smieci
{
    public static void main(String[] args)
    {
        Double d;
        String dane = "10,4 2,22  3,14 11,9956";
        Scanner skaner = new Scanner(dane);
        /* W tym wypadku wykonujemy tak długo pętlę dopóki będzie trafiać na wartości Double ze skanera */
        while(skaner.hasNextDouble()) {
            d = skaner.nextDouble();
            System.out.println(d + " ");
        }
    }
}