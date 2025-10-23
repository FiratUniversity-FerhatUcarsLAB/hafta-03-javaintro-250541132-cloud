
public class DaireHesaplayici {

    public static void main(String[] args) {
        double yaricap = 5.5; // r = 5.5
        final double PI = Math.PI;
        double alan = PI * yaricap * yaricap;
        double cevre = 2 * PI * yaricap;

        System.out.println("--- Daire Hesaplamaları ---");
        System.out.println("Yarıçap (r): " + yaricap);
        System.out.println("PI Değeri: " + PI);
        System.out.println("--------------------------");
        System.out.printf("Dairenin Alanı (πr²): %.4f%n", alan);
        System.out.printf("Dairenin Çevresi (2πr): %.4f%n", cevre);
    }
}
