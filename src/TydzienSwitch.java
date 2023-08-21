import java.util.Scanner;

public class TydzienSwitch {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Podaj liczbe od 1 do 12");
        int liczba = scan1.nextInt();
        //System.out.println("Podana liczba to " + liczba);

        switch (liczba) {
            case 1:
                System.out.println("styczeń");
                break;
            case 2:
                System.out.println("luty");
                break;
            case 3:
                System.out.println("marzec");
                break;
            case 4:
                System.out.println("kwiecien");
                break;
            case 5:
                System.out.println("maj");
                break;
            case 6:
                System.out.println("czerwiec");
                break;
            case 7:
                System.out.println("lipiec");
                break;
            case 8:
                System.out.println("sierpien");
                break;
            case 9:
                System.out.println("wrzesien");
                break;
            case 10:
                System.out.println("pazdziernik");
                break;
            case 11:
                System.out.println("listopad");
                break;
            case 12:
                System.out.println("grudzien");
                break;
            case 69:
                System.out.println("Ty Niegrzeczny dziadzie");
                break;
            default:
                System.out.println("Nie rozpoznano miesiaca");
        }
    }
}
