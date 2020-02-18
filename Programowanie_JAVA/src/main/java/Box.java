public class Box {
    private double dlugosc; // ustawiamy nasze zmienne jako prywatne, aby nie można było ich zmieniać z innych klas
    private double wysokosc;
    private double szerokosc;

    Box () { // to jest konstruktor, tworzy domyślny obiekt
        dlugosc = 5;
        this.szerokosc = 5;
        this. wysokosc = 5;
    }

    Box ( double dlugosc, double wysokosc, double szerokosc) { // nie można takiego samego konstruktowa tworzyć,
        // chyba,że różni się lością lub rodzajem parametrów
        this.dlugosc = dlugosc;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
    }

    double objetosc() { // to jest nasza nowa metoda, typ oznaczamy od razu
       return dlugosc * wysokosc * szerokosc; //zwraca obliczenie poza metode
    }

    public void setDlugosc(double dlugosc) { // settery to metody wprawadzania danych do obiektów
        this.dlugosc = dlugosc;
    }

    public void setWysokosc(double wysokosc) { // settery też możemy ustawić jako prywatne
        this.wysokosc = wysokosc;
    }

    void setSzerokosc(double szerokosc) { // gdy nie podamy rodzaju metody to jest z automatu publiczna
        this.szerokosc = szerokosc;
    }

    public double getDlugosc() { // tzw. getter, mtoda, która zwraca wartosc
        return this.dlugosc; // this wskazuje na zmienna, ktora definiowalismy
    }

    public double getSzerokosc() {
        return this.szerokosc;
    }

    public double getWysokosc() {
        return this.wysokosc;
    }

}
