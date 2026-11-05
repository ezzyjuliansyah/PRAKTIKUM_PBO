package Jobsheet9.Tugas;

public class Main {
    public static void main(String[] args) {

        Gacoan gacoan = new Gacoan(
                "Mie Gacoan", 15000, 4.8, 20, "Level 5");

        Dikichi dikichi = new Dikichi(
                "Ayam Dikichi", 20000, 4.7, 15, "Ayam Crispy");

        System.out.println("=== MENU GACOAN ===");
        gacoan.masak("Level 5");
        gacoan.cetakHarga();
        gacoan.tampilkanInfo();
        gacoan.sajikan();

        System.out.println();

        System.out.println("=== MENU DIKICHI ===");
        dikichi.masak("Ayam Crispy");
        dikichi.cetakHarga();
        dikichi.tampilkanInfo();
        dikichi.sajikan();
    }
}
