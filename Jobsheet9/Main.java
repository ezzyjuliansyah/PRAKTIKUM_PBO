package Jobsheet9;

public class Main {
    public static void main(String[] args) {

        // Membuat objek Kulkas
        Kulkas kulkas = new Kulkas();

        kulkas.merk = "Samsung";
        kulkas.warna = "Silver";
        kulkas.harga = 3500000;
        kulkas.jumlahPintu = 2;

        // Membuat objek TV
        TV tv = new TV();

        tv.merk = "LG";
        tv.warna = "Hitam";
        tv.harga = 2500000;
        tv.jenisLayar = "LED";
        tv.volume = 10;

        // Menampilkan informasi Kulkas
        System.out.println("===== INFORMASI KULKAS =====");
        System.out.println(kulkas.getInfo());

        // Menampilkan informasi TV
        System.out.println("\n===== INFORMASI TV =====");
        System.out.println(tv.getInfo());
    }
}
