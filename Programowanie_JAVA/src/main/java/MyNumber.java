public class MyNumber {
    private int number;

    public MyNumber(int number) {
        this.number = number;
    }

    boolean isOdd() {
        if (number % 2 == 1 || number % 2 == -1) return true;
        else return false;
    }

    boolean isEven() {
        if (number % 2 == 0) return true;
        else return false;
    }

    int add(int x) {
        return this.number += x;
    }

    int subtract(int x) {
        return  this.number -= x;
    }

}
