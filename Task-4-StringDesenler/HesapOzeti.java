public class HesapOzeti {

    public static void main(String[] args) {
        String urun1 = "Patates";
        double fiyat1 = 15.00; // TL/kg
        double miktar1 = 5.0;  // kg
        double toplam1 = fiyat1 * miktar1;
        String urun2 = "Soğan";
        double fiyat2 = 20.00; // TL/kg
        double miktar2 = 3.0;  // kg
        double toplam2 = fiyat2 * miktar2;
        String urun3 = "Elma";
        double fiyat3 = 35.00; // TL/kg
        double miktar3 = 3.0;  // kg
        double toplam3 = fiyat3 * miktar3;
        double genelToplam = toplam1 + toplam2 + toplam3;
        String cizgi = "------------------------------------------------";

        System.out.println("============== HESAP ÖZETİ ===============");
        System.out.println(cizgi);
        System.out.printf("%-15s | %-10s | %-10s | %-10s%n", "ÜRÜN", "MİKTAR (kg)", "BİRİM FİYAT", "TOPLAM (TL)");
        System.out.println(cizgi);

        // 1. Ürün
        System.out.printf("%-15s | %-10.1f | %-10.2f | %-10.2f%n", urun1, miktar1, fiyat1, toplam1);

        // 2. Ürün
        System.out.printf("%-15s | %-10.1f | %-10.2f | %-10.2f%n", urun2, miktar2, fiyat2, toplam2);

        // 3. Ürün
        System.out.printf("%-15s | %-10.1f | %-10.2f | %-10.2f%n", urun3, miktar3, fiyat3, toplam3);

        System.out.println(cizgi);

        // Genel Toplam Satırı
        System.out.printf("%-38s %-10.2f TL%n", "GENEL TOPLAM:", genelToplam);
        System.out.println(cizgi);
    }
}
