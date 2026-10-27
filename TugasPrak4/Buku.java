public class Buku {
    private String kodeBuku;
    private String judul;
    private String pengarang;
    private boolean tersedia;

    public Buku(String kodeBuku, String judul, String pengarang) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.pengarang = pengarang;
        this.tersedia = true; 
    }

    public String getJudul() {
        return judul;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public String getInfo() {
        return kodeBuku + " - " + judul + " oleh " + pengarang
                + " (" + (tersedia ? "Tersedia" : "Dipinjam") + ")";
    }
}