public class DikdortgenHesaplayici {

    public static void main(String[] args) {
        // Verilen Dikdörtgen boyutları
        double en = 4.5;
        double boy = 7.9;

        double alan = en * boy;

        double cevre = 2 * (en + boy);
        System.out.println("--- Dikdörtgen Hesaplamaları ---");
        System.out.println("En Değeri: " + en);
        System.out.println("Boy Değeri: " + boy);
        System.out.println("--------------------------------");
        System.out.printf("Dikdörtgenin Alanı: %.2f%n", alan);
        System.out.printf("Dikdörtgenin Çevresi: %.2f%n", cevre);
    }
}
