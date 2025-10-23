public class UcgenHeronHesaplayici {

    public static void main(String[] args) {

        double a = 3.0;
        double b = 4.0;
        double c = 5.0;
        double s = (a + b + c) / 2.0;

        double kokIciIfade = s * (s - a) * (s - b) * (s - c);

        double alan = Math.sqrt(kokIciIfade);
        System.out.println("--- Üçgen Alanı (Heron) Hesaplama ---");
        System.out.println("Kenarlar (a, b, c): " + a + ", " + b + ", " + c);
        System.out.println("-------------------------------------");

        System.out.println("Yarı Çevre (s): " + s);
        System.out.println("Karekök İçi İfade: " + kokIciIfade);
        System.out.printf("\nÜçgenin Alanı (A): %.2f%n", alan);
    }
}
