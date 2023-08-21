import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class PracaNaZmiennych {
    public static void main(String[] args) {
        String txt = "KOMPUSZKYYY";
        System.out.println(txt);
        System.out.println(txt);
        System.out.println(txt);
        System.out.println(txt);


        // operacje na zmiennych
        int x = 10;
        int y = 12;
        int result = x - y;
        System.out.println(result);
        System.out.println(x + 5);

        // operator modulo
        int z = 10 % 3;
        System.out.println(z);

        //
        int a = 10;
        a = a -2;
        a -=2; // to samo co a = a -2
        System.out.println(a);

        //inkrementacja
        int i = 10;
        i++; // i+=1 ; i = i + 1;
        System.out.println(i);

        // liczbyzmiennoprzecinkowe
        double d = 10.25;
        d = d - 0.25;
        System.out.println(d);



    }
}
