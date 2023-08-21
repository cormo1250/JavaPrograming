public class WhileZadania {
    public static void main(String[] args) {

        int n = 0;
//1
        System.out.println("zadanie pierwsze");
        System.out.println(" ");
        while (n <= 60) {
            if (n % 3 == 0) {
                System.out.println(n);
            }
            n++;
        }
        System.out.println(" ");
        System.out.println("zadanie drugie");
        System.out.println(" ");
        //2
        int b = 0;
        int c = 1;
        while (b <= 10) {
            if (b != 0) {
                c = c * 3;

            }
            b++;
            System.out.println(c);
        }
        System.out.println(" ");
        System.out.println("zadanie trzecie");
        System.out.println(" ");


//3

        int z = 3;
        int ww = 1;
        while (z > 1) {
            ww = ww * z;
            z = z - 1;
        }
        System.out.println("Silnia:" + ww);

        }



    }

