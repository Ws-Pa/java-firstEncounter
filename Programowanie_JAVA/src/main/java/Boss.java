public class Boss extends Pracownik {
    double premia;

    public Boss(String imie, String nazwisko, double wynagrodzenie, double premia) {
        super(imie, nazwisko, wynagrodzenie);
        this.premia = premia;
    }
}
