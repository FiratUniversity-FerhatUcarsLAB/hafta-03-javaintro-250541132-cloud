public class MilKilometreDonusumu {

    public static void main(String[] args) {
        // Dönüşüm Sabiti
        final double DONUSUM_ORANI = 1.609; // 1 mil = 1.609 km

        // Hesaplama yapılacak Mil değerleri
        int[] milDegerleri = {1, 5, 10, 20, 50};

        System.out.println("============== MESAFE DÖNÜŞÜM TABLOSU ==============");
        System.out.printf("%-10s | %-15s%n", "Mil", "Kilometre (km)");
        System.out.println("------------------------------------");

        // Mil değerleri üzerinde döngü kurma
        for (int mil : milDegerleri) {
            // Kilometre hesaplaması
            double kilometre = mil * DONUSUM_ORANI;

            // Tablo formatında yazdırma
            // %-10d: Sol hizalı 10 karakter (int)
            // %-15.3f: Sol hizalı 15 karakter (3 ondalık hassasiyetli double)
            System.out.printf("%-10d | %-15.3f%n", mil, kilometre);
        }
        System.out.println("------------------------------------");
    }
}
