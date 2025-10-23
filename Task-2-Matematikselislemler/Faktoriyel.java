
public class FaktoriyelHesaplayici {

    public static void main(String[] args) {
        int sayi = 5;
        long faktoriyelSonuc = 1;

        System.out.println("Faktöriyel: " + sayi + "! hesaplama");
        System.out.print(sayi + "! = ");
        for (int i = sayi; i >= 1; i--) {
            faktoriyelSonuc *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print(" × ");
            }
        }

        System.out.println();
        System.out.println("\n--- Ara Adımlar ---");
        long araSonuc = 1;

        for (int i = sayi; i >= 1; i--) {
            if (i == sayi) {
                araSonuc = i;
                System.out.println(i + " = " + araSonuc);
            } else {
                System.out.print(araSonuc + " × " + i);
                araSonuc *= i;
                System.out.println(" = " + araSonuc);
            }
        }

        System.out.println("\nNihai Sonuç: " + sayi + "! = " + faktoriyelSonuc);
    }
}
