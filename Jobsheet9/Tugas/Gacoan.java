package Jobsheet9.Tugas;

public class Gacoan extends Menu implements DapatDisajikan {

    private String levelKepedasan;

    public Gacoan(String nama, double harga, double rating,
            int stok, String levelKepedasan) {

        super(nama, harga, rating, stok);
        this.levelKepedasan = levelKepedasan;
    }

    @Override
    public void masak(String levelKepedasan) {
        System.out.println("Memasak mie dengan level kepedasan: "
                + levelKepedasan);
    }

    @Override
    public void sajikan() {
        System.out.println("Menyajikan menu Gacoan: " + nama + "Level Kepedasan: " + levelKepedasan );
    }
}
