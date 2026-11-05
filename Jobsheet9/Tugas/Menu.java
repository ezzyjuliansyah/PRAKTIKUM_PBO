package Jobsheet9.Tugas;

public abstract class Menu {
    public String nama;
    public double harga;
    public double rating;
    public int stok;

    public Menu(String nama, double harga, double rating, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.rating = rating;
        this.stok = stok;
    }

    public abstract void masak(String pilihan);

    public void cetakHarga() {
        System.out.println("Harga: Rp" + harga);

    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Harga: Rp" + harga);
        System.out.println("Rating: " + rating);
        System.out.println("Stok: " + stok);
    }
}
