public class UsluSayilarTablosu {

    public static void main(String[] args) {

        System.out.println("============== ÜSLÜ SAYILAR TABLOSU (a=1'den 5'e) ==============");
        System.out.printf("%-5s | %-10s | %-10s | %-10s%n", "a", "a^1 (a)", "a^2", "a^3");
        System.out.println("---------------------------------------------------");

        for (int a = 1; a <= 5; a++) {
            int a_kare = a * a; // a^2
            int a_kup = a * a * a;

            System.out.printf("%-5d | %-10d | %-10d | %-10d%n", a, a, a_kare, a_kup);
        }
        System.out.println("---------------------------------------------------");
    }
}
