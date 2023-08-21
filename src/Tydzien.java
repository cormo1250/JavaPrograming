import java.util.Scanner;

public class Tydzien {
    public static void main(String[] args) {

        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj liczbe od 1 do 7");
        int liczba = scan1.nextInt();
        System.out.println("Podana liczba to " + liczba);
        String poniedzialek = ("poniedzialek");
        String wtorek = ("wtorek");


        if (liczba == 1)
            System.out.println(poniedzialek);
        else if (liczba == 2)
            System.out.println("wtorek");
        else if (liczba == 3)
            System.out.println("środa");
        else if (liczba == 4)
            System.out.println("czwartek");
        else if (liczba == 5)
            System.out.println("piątek");
        else if (liczba == 6)
            System.out.println("sobota");
        else if (liczba == 7)
            System.out.println("niedziela");
        else
            System.out.println("nie rozpoznano dnia tygodnia");
    }

}
