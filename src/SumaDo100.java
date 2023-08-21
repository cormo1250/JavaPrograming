public class SumaDo100 {
    public static void main(String[] args) {

        //Napisać program, który sumuje wartości od 0 do 100, które są podzielne przez 3, 7

        int a = 0;

        for (int i = 0 ; i <101 ; i++) {
            if (i % 3 == 0) {
               a = a + i;
                System.out.println(a);
            }else if (i % 7 == 0) {
               a = a + i;
                System.out.println(a);
            }
        }

    }

}
