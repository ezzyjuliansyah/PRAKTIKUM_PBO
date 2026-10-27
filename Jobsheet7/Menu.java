public class Menu {
    public String stok;
    public double harga;
    public String rating;
    public String nama;

    public Menu() {
        System.out.println("Ini constructor class Menu (tanpa parameter)");
    }
    
    public Menu(String nama, double harga, String stok, String rating) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.rating = rating;
        System.out.println("Ini constructor class Menu (berparameter)");
    }

    
    public double cetakHarga() {
        return this.harga;
    }

    public String getInfo() {
        String info = "";
        info += "Nama   : " + this.nama + "\n";
        info += "Stok   : " + this.stok + "\n";
        info += "Rating : " + this.rating + "\n";
        info += "Harga  : " + this.cetakHarga() + "\n";
        return info;
    }
}
