package Jobsheet8;

public class Gacoan extends Menu {
    public int levelKepedesan;

    public Gacoan() {
        super();
    }

    public Gacoan(String nama, String rating, double harga, String stok, int levelKepedesan) {
        super(nama, rating, harga, stok);
        this.levelKepedesan = levelKepedesan;
    }

    public void buatMie(int levelKepedesan) {
        System.out.println("Pesanan diproses: Membuat Mie Dengan Level Kepedesan " + levelKepedesan);
    }

    @Override
    public void masak() {
        System.out.println("1. Merebus Mie");
        System.out.println("2. Menambahkan Bumbu");
        System.out.println("3. Menambahkan Level Kepedesan ");
        System.out.println("4. Menyajikan Mie");
    }

    @Override
    public double cetakHarga() {
        return super.harga + (this.levelKepedesan * 1000);
    }
}