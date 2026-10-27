public class Gacoan extends Menu {
    public String levelKepedesan;

    public Gacoan() {
        System.out.println("Ini constructor class Gacoan (tanpa parameter)");
    }

    public Gacoan(String nama, double harga, String stok, String rating, String levelKepedesan) {
        super(nama, harga, stok, rating);
        this.levelKepedesan = levelKepedesan;
        System.out.println("Ini constructor class Gacoan (berparameter)");
    }

    public void buatMie(String levelKepedesan) {
        this.levelKepedesan = levelKepedesan;
        System.out.println("Membuat mie " + this.nama + " dengan level kepedasan " + levelKepedesan);
    }

    @Override
    public double cetakHarga() {
        return this.harga + Integer.parseInt(this.levelKepedesan) * 1000;
    }

    @Override
    public String getInfo() {
        String info = super.getInfo();
        info += "Level Kepedesan : " + this.levelKepedesan + "\n";
        return info;
    }
}
