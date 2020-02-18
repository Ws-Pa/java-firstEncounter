public class Zagniezdzenia {
    public static void main(String[] args) {
        int[][] macierz;// tworzenie tablicy
        macierz = new int[3][3];// tworzenie rozmiaru tablicy
        macierz[0][0] = 0;
        macierz[0][1] = 1;
        macierz[0][2] = 2;
        macierz[1][0] = 1;
        macierz[1][1] = 2;
        macierz[1][2] = 3;
        macierz[2][0] = 2;
        macierz[2][1] = 3;
        macierz[2][2] = 4;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println("");
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i + j == 4 || i==0 || i==4) {
                    System.out.print("*");
                }  else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }


    }
}
