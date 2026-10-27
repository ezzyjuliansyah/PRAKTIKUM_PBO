public class Dikichi extends Menu {
    public String varianAyam;

    public Dikichi() {
        System.out.println("Ini constructor class Dikichi (tanpa parameter)");
    }

    public Dikichi(String nama, double harga, String stok, String rating, String varianAyam) {
        super(nama, harga, stok, rating);
        this.varianAyam = varianAyam;
        System.out.println("Ini constructor class Dikichi (berparameter)");
    }

    public void gorengAyam(String varianAyam) {
        this.varianAyam = varianAyam;
        System.out.println("Menggoreng ayam varian " + varianAyam + " untuk menu " + this.nama);
    }

    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Varian Ayam : " + this.varianAyam + "\n";
        return info;
    }
}