public class Switch {
    public static void main(String[] args) {
        int i = 1;

        switch (i) {
            case 0:
                System.out.println("i = 0");
            case 1:
                System.out.println("i = 1");
                break;
            case 2:
                System.out.println("i = 2"); //Gdy nie ma break, to wykonuje wszystkie instrukcje do końca klamry (ciałą)
            default:
                System.out.println("i > 2");
        }
        System.out.println("Instrukcja po switch");
    }
}
