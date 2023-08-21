import java.util.Scanner;

public class NowyProgram001 {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj wartość gotówki w PLN");
        double amount = scan1.nextDouble();
        double coverterEUR = 4.42;
        double coverterUSD = 4.01;
        double coverterYEN = 0.028;
        //String currency1 = ("Eur");
        //String currency2 = ("USD");
        //String currency3 = ("YEN");

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Podaj walute EUR / USD / YEN");
        String currency = scan2.nextLine();

        switch (currency) {
            case "EUR":
                System.out.println(amount / coverterEUR);
                break;
            case "USD":
                System.out.println(amount / coverterUSD);
                break;
            case "YEN":
                System.out.println(amount / coverterYEN);
                break;

            default:
                System.out.println("Nie rozpoznano waluty");

        }
    }
}
