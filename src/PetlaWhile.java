public class PetlaWhile {

    public static void main(String[] args) {

//        int n = 0;
//
//        while (n <=10) {
//            System.out.println(n);
//            n++;
//        }
//
//        int i = 100;
//        int j = 10;
//
//        while (i <= 50 && j <50){
//            if (j % 5 ==0){
//                i = i - 5;
//            }else if (i % 10 == 0){
//                    j = j + 2;
//            }
//            System.out.println(i + " " + j);
//        }
 // auklides - nawjwiekszy wpolny dzielnik
    int a = 99;
    int b = 36;
    while (a!=b) {
        if (a >b) {
            a = a -b;
        }else {
            b= b - a;
        }
    }
        System.out.println(a);


    }
}
