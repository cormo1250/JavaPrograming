import java.util.Random;
import java.util.Scanner;


public class PifPaf {
    public static void main(String[] args) {
        //int c = 15;; stare bez randomu

        String P1 = ("Pif Pong ");
        String P2 = ("Paf Daf ");
        int P1Dlugosc = P1.length();
        int P2Dlugosc = P2.length();
        int P1P2Dlugosc = P1Dlugosc + P2Dlugosc;
        Random losowa = new Random(); //random 1
        int c = losowa.nextInt(11); //random 2
      //  System.out.println(c); //wyswietlenie randomu

//skan
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj liczbe");
        int liczba = scan1.nextInt();
        System.out.println("Podana liczba to " + liczba);


        {
            if (liczba == c)
            {
                System.out.println("Podana liczba jest taka sama jak wylosowana");
           } else{
           System.out.println("Podana liczba jest inna niż wylosowana, wylosowana liczba to " + c);
        }
        }
        //skan


        if (c % 3 == 0 && c % 5 == 0) {
            System.out.println(P1 + P2 + P1P2Dlugosc);
        } else if (c % 3 == 0) {
            System.out.println(P1 + P1Dlugosc);
        } else if (c % 5 == 0) {
            System.out.println(P2 + P2Dlugosc);
        } else {
            System.out.println(c);
        }
    }
}
