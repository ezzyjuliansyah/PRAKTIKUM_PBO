package Jobsheet9;

public abstract class AlatElektronik {
    public double harga;
    public String merk;
    public String warna;

    public String getInfo() {
        return "Merk: " + merk +
                "\nWarna: " + warna +
                "\nHarga: Rp" + harga;
    }
}
