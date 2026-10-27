package Jobsheet8;

public class Dikichi extends Menu {
    public String varianAyam;

    public Dikichi() {
        super();
    }

    public Dikichi(String nama, String rating, double harga, String stok, String varianAyam) {
        super(nama, rating, harga, stok);
        this.varianAyam = varianAyam;
    }

    public void gorengAyam(String varianAyam) {
        System.out.println("Pesanan diproses: Menggoreng Ayam Varian " + varianAyam);
    }

    @Override
    public void masak() {
        System.out.println("1. Membersihkan Ayam"); 
        System.out.println("2. Membumbui Ayam");
        System.out.println("3. Menggoreng Ayam");
        System.out.println("4. Menyajikan Ayam");
    }

    @Override
    public double cetakHarga() {
        return super.harga;
    }
}