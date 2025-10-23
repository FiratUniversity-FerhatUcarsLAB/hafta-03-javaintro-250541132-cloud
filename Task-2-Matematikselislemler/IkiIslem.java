
public class IkiIslemHesaplayici {

    public static void main(String[] args) {

        // 1. Pay (Numerator) hesaplaması: 9.5 * 4.5 - 2.5 * 3
        double payCarpim1 = 9.5 * 4.5;
        double payCarpim2 = 2.5 * 3;
        double pay = payCarpim1 - payCarpim2;
        // pay = 42.75 - 7.5 = 35.25

        // 2. Payda (Denominator) hesaplaması: 45.5 - 3.5
        double payda = 45.5 - 3.5;
        // payda = 42.0

        // 3. Kesirli İşlem Sonucu
        double sonuc = pay / payda;
        // sonuc = 35.25 / 42.0 ≈ 0.8392857...

        // 4. Sonucu 4 ondalık basamak hassasiyetle formatlama
        // %.4f formatı ile ondalık kısmı 4 basamak ile sınırlar.
        String formatliSonuc = String.format("%.4f", sonuc);

        System.out.println("--- İki İşlem Sonucu ---");
        System.out.println("Pay: " + pay);
        System.out.println("Payda: " + payda);
        System.out.println("Hesaplanan Sonuç: " + sonuc);

        System.out.println("\nSonuç (4 ondalık basamak ile): " + formatliSonuc);
    }
}
