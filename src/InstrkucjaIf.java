public class InstrkucjaIf {
    public static void main(String[] args) {
        //przyklady warunkow
//        boolean warunekFalse = (10 == 12);
//        boolean warukenTrue = true;
//
//        System.out.println(warunekFalse);
//        System.out.println(warukenTrue);
        // instrukcja if
        int x = 30;
        if (x % 2 == 0) {
            System.out.println("Liczba x jest parzysta");

        } else if (x % 3 == 0) {
            System.out.println("Liczba x jest podzielna przez 3");
        } else {
            System.out.println("Liczba x nie jest parzysta i nie podzielna przez 3");
        }
        //operatory logiczne
        // && - AND || - OR

        if (x % 2 == 0 && x % 3 == 0 && x % 5 == 0) {
            System.out.println("Liczba jest podzielna przez 2, 3 i 5");
        }
    }
}