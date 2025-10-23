public class CarpimTablosu {

    public static void main(String[] args) {
        System.out.println("- Çarpım Tablosu:");
        System.out.println("2'nin çarpım tablosu 1'den 10'a kadar\n");
        int carpan = 2;
        for (int i = 1; i <= 10; i++) {
            int sonuc = carpan * i;
            System.out.println(carpan + " x " + i + " = " + sonuc);
        }
    }
}
