public class Zadanie1 {
    public static void main(String[] args) {

        int n=10;
        while (n<=20) {
            System.out.println(n);
            n++;
        }
        System.out.println("----------------------------");

        for (int i=-10;i<=40;i++) {
//            if (i<=0) {
//                if (-i%2==1){
//                    System.out.println(i);
//                }
//            } else if (i%2==1) {
//                    System.out.println(i);
//                }

            if (i%2==1 || i%2==-1) {
                System.out.println(i);
            }
        }
    }
}

