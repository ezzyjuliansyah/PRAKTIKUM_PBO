package Jobsheet9.Tugas;

public class Dikichi extends Menu implements DapatDisajikan {

    private String varianAyam;

    public Dikichi(String nama, double harga, double rating,
            int stok, String varianAyam) {

        super(nama, harga, rating, stok);
        this.varianAyam = varianAyam;
    }

    @Override
    public void masak(String varianAyam) {
        System.out.println("Memasak ayam dengan varian: "
                + varianAyam);
    }

    @Override
    public void sajikan() {
        System.out.println("Menyajikan menu Dikichi: " + nama + "Varian ayam: " + varianAyam);
    }
}
