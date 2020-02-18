public class RownKwad {
    public static void main(String[] args) {
/*
        int a,b,c;
        double delta,x, x1, x2;

        a=0;
        b=3;
        c=1;

        if (a != 0) {
            delta = b*b - 4*a*c;
            if (delta == 0) {
                x = -b/(2*a);
                System.out.println("Wynikiem jest pierwiastek podwójny x = " + x);
            } else {
                if (delta < 0) {
                    System.out.println("Równanie nie posiada pierwiastków.");
                } else {
                    x1 = (-b - Math.sqrt(delta))/2*a;
                    x2 = (b - Math.sqrt(delta))/2*a;
                    System.out.println("Równianie posiada pierwiastki x1 = " + x1 + " i x2 = " + x2);
                }
            }

        } else {
            System.out.println("To nie jest równanie kwadratowe.");
        }
*/

        double a=4, b=5, c=1;

        if(a==0) {
            System.out.println("To nie jest równanie kwadratowe.");
        } else {
            double delta = b*b - 4*a*c;
            if (delta ==0) {
                double pierwiastek = -b/(2*a);
                System.out.println("Wynikiem jest pierwiastek podwójny = " + pierwiastek);
            } else if (delta >0) {
                double pierwiastek1 = (-b - Math.sqrt(delta))/(2*a);
                double pierwiastek2 = (b - Math.sqrt(delta))/(2*a);
                System.out.println("Równianie posiada pierwiastki x1 = " + pierwiastek1 + " i x2 = " + pierwiastek2);
            } else {
                System.out.println("Równanie nie posiada pierwiastków.");
            }
        }








    }
}
