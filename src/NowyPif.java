public class NowyPif {
    public static void main(String[] args) {

        for (int shot = 0; shot <= 60; shot = shot + 1) {
            if (shot % 5 == 0 && shot % 3 == 0) {
                System.out.println("Pif Paf");
            } else if (shot % 3 == 0) {
                System.out.println("Pif");
            } else if (shot % 5 == 0) {
                System.out.println("Paf");
            } else {
                System.out.println(shot);
            }
        }
    }
}