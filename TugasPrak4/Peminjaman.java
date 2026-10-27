import java.time.LocalDate;

public class Peminjaman {
    private LocalDate tanggalPinjam;
    private LocalDate tanggalKembali;
    private Buku buku;

    public Peminjaman(LocalDate tanggalPinjam, Buku buku) {
        this.tanggalPinjam = tanggalPinjam;
        this.buku = buku;
        this.tanggalKembali = null;
        this.buku.setTersedia(false); 
    }

    public Buku getBuku() {
        return buku;
    }

    public void kembalikanBuku(LocalDate tgl) {
        this.tanggalKembali = tgl;
        this.buku.setTersedia(true);
    }

    public String getInfo() {
        String info = "";
        info += "\tTanggal Pinjam: " + tanggalPinjam;
        if (tanggalKembali != null) {
            info += ", Tanggal Kembali: " + tanggalKembali;
        } else {
            info += ", Tanggal Kembali: belum dikembalikan";
        }
        info += ", Buku: " + buku.getInfo();
        info += "\n";

        return info;
    }
}