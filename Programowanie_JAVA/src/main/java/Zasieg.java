import java.sql.SQLOutput;

public class Zasieg {
    public static void main(String[] args) {
        int x = 10;

        if (x == 10){
            int y = 20;
            System.out.println("x i y = "+ x + " " + y);
            x = y * 2;
        }
//        y = 100; //zmienna skasowana poza if
        System.out.println(x);

    }


}
