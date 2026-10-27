package Jobsheet8;

public abstract class Menu {
    public String nama;
    public String rating;
    public double harga;
    public String stok;

    public Menu() {
    }

    public Menu(String nama, String rating, double harga, String stok) {
        this.nama = nama;
        this.rating = rating;
        this.harga = harga;
        this.stok = stok;
    }

    public abstract void masak();

    public double cetakHarga() {
        return this.harga;
    }
}