public class Tablice {
    public static void main(String[] args) {
        //int[] miesiace; //tworzenie tablicy, w której zmienne są liczbami całkowitymi
        String[] miesiace;
        miesiace = new String[12];

        miesiace[0] = "styczen";
        miesiace[1] = "luty";

        System.out.println(miesiace[1]);
        System.out.println(miesiace[2]);

        String[] miesiace2 = {"styczen", "luty","marzec"};

        //System.out.println(miesiace2[3]);

        int[][] macierz; //tworzenie tablicy dwuwymiarowej (macierzy)
        macierz = new int[2][2];
        macierz[0][0] = 1;
        System.out.println(macierz[0][0]);


        final int a; // tworzy zmienną nie naruszalną, nie można jej zmienić
        a = 6; // można ją później zainicjować za to

        String lancuch = "Wprowadzony tekst";
        System.out.println(lancuch.length());

    }
}
