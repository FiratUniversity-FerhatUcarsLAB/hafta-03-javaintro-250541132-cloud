public class IsimKarti {

    public static void main(String[] args) {
      
        String ad = "Esmanur";
        String soyad = "Ulu";
        String ogrenciNo = "250541132";
        String bolum = "Yazılım Mühendisliği";
        System.out.println("===========================================");
        System.out.println("             ÖĞRENCİ İSİM KARTI            ");
        System.out.println("===========================================");

        System.out.printf("%-15s : %s %s%n", "Adı Soyadı", ad, soyad);
        System.out.printf("%-15s : %s%n", "Öğrenci No", ogrenciNo);
        System.out.printf("%-15s : %s%n", "Bölüm", bolum);

        System.out.println("===========================================");
    }
}
