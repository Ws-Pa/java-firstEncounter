public class If {
    public static void main(String[] args) {
/*
        int a = 1;
        int b = 2;

        if (a == 1) {
            System.out.println("A jest równe 1");
        } else {
            System.out.println("A jest różne od 1");
        }

        if ((a == 1) && (b == 2)) {
            System.out.println("A jest równe 1 i B jest równe 2");
        } else if (b == 2) {
            System.out.println("B jest równe 2, ale A jest różne od 1");
        }
*/
        int liczba = 3;
        if ((liczba >= -1 && liczba <= 1) || (liczba > 2 && liczba <= 3)) {
            System.out.println("Liczba " + liczba + " mieści się w przedziale");
        } else {
            System.out.println("Liczba " + liczba + " nie mieści się w podanym przedziale");
        }


    }
}
