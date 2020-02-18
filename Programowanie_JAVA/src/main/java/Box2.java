public class Box2 {
    private String nazwa;
    private double szerokosc;
    private double wysokosc;
    private double dlugosc;

    public Box2(String nazwa, double szerokosc, double wysokosc, double dlugosc) {
        this.nazwa = nazwa;
        this.szerokosc = szerokosc;
        this.wysokosc = wysokosc;
        this.dlugosc = dlugosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public double getSzerokosc() {
        return szerokosc;
    }

    public void setSzerokosc(double szerokosc) {
        this.szerokosc = szerokosc;
    }

    public double getWysokosc() {
        return wysokosc;
    }

    public void setWysokosc(double wysokosc) {
        this.wysokosc = wysokosc;
    }

    public double getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(double dlugosc) {
        this.dlugosc = dlugosc;
    }
}
