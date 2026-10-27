package Jobsheet8;

public class MainTugas {
    public static void main(String[] args) {

        Gacoan pesanan1 = new Gacoan("Mie Gacoan", "Bintang 5", 10000, "Tersedia", 3);

        Dikichi pesanan2 = new Dikichi("Dikichi Crispy", "Bintang 4.5", 15000, "Tersedia", "Spicy");

        System.out.println("=== INFO PESANAN 1 ===");
        System.out.println("Nama Menu  : " + pesanan1.nama);
        System.out.println("Stok       : " + pesanan1.stok);
        System.out.println("Harga Awal : Rp " + pesanan1.harga);
        System.out.println("Level Pedas: " + pesanan1.levelKepedesan);
        pesanan1.masak();
        System.out.println("Total Harga: Rp " + pesanan1.cetakHarga());
        pesanan1.buatMie(pesanan1.levelKepedesan);

        System.out.println("\n=== INFO PESANAN 2 ===");
        System.out.println("Nama Menu  : " + pesanan2.nama);
        System.out.println("Stok       : " + pesanan2.stok);
        System.out.println("Varian Ayam: " + pesanan2.varianAyam);
        pesanan2.masak();
        System.out.println("Total Harga: Rp " + pesanan2.cetakHarga());
        pesanan2.gorengAyam(pesanan2.varianAyam);
    }
}