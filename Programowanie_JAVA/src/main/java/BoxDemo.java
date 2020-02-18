public class BoxDemo {
    public static void main(String[] args) {
        Box pudelko1 = new Box(); // tworzymy nowy obiekt klasy Box
        pudelko1.setWysokosc(20);
        pudelko1.setDlugosc(10);
        pudelko1.setSzerokosc(5);
        System.out.println(pudelko1.objetosc());

        Box pudelko2 = new Box(); // tworzymy nowy obiekt klasy Box
        pudelko2.setWysokosc(2);
        pudelko2.setSzerokosc(1);
        pudelko2.setDlugosc(1);
        System.out.println(pudelko2.objetosc());

        Box pudelko3 = new Box();
        System.out.println(pudelko3.getSzerokosc());

        Box pudelko4 = new Box(4.,6,8);

    }
}
