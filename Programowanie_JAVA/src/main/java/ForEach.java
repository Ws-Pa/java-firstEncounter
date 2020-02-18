public class ForEach {
    public static void main(String[] args) {

        int[] tablica = {2, 8, -3, 5, 0, 4, 9};
//        for (int i = 0; i < tablica.length; i++) {
//            System.out.println(tablica[i]);
//        }

        int maxymalny = tablica[0], minimalny=tablica[0];
        double srAr, sum = 0;
        for (int wartoscPobranegoElementu : tablica) {
            System.out.println(wartoscPobranegoElementu);
            sum += wartoscPobranegoElementu;
            if (maxymalny<wartoscPobranegoElementu) maxymalny = wartoscPobranegoElementu;
            if (minimalny>wartoscPobranegoElementu) minimalny = wartoscPobranegoElementu;
        }
        System.out.println("Suma - " + sum);
        srAr = sum/tablica.length;
        System.out.println("Minimum = " + minimalny);
        System.out.println("Maximum = " + maxymalny);
        System.out.println("Średnia arytmetyczna = " + srAr);
    }
}
