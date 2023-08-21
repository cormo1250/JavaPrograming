public class CiagHarmoniczny {
    public static void main(String[] args) {
        double n=150;
        double b=0;
        b=n;
        for (double a=0; a<=n; a++){
            System.out.println(b);
            b=(b+1/n);
        }
    }
}
