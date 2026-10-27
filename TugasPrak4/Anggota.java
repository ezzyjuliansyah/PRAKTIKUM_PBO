import java.time.LocalDate;
import java.util.ArrayList;

public class Anggota {
    private String idAnggota;
    private String nama;
    private ArrayList<Peminjaman> riwayatPeminjaman;

    public Anggota(String idAnggota, String nama) {
        this.idAnggota = idAnggota;
        this.nama = nama;
        this.riwayatPeminjaman = new ArrayList<Peminjaman>();
    }

    public String getIdAnggota() {
        return idAnggota;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public ArrayList<Peminjaman> getRiwayatPeminjaman() {
        return riwayatPeminjaman;
    }

    public void tambahPeminjaman(LocalDate tgl, Buku buku) {
        if (buku.isTersedia()) {
            Peminjaman peminjaman = new Peminjaman(tgl, buku);
            riwayatPeminjaman.add(peminjaman);
        } else {
            System.out.println("Buku \"" + buku.getJudul() + "\" sedang dipinjam, "
                    + nama + " tidak dapat meminjamnya.");
        }
    }

    public String getInfo() {
        String info = "";
        info += "ID Anggota        : " + this.idAnggota + "\n";
        info += "Nama              : " + this.nama + "\n";

        if (!riwayatPeminjaman.isEmpty()) {
            info += "Riwayat Peminjaman:\n";

            for (Peminjaman peminjaman : riwayatPeminjaman) {
                info += peminjaman.getInfo();
            }
        } else {
            info += "Belum ada riwayat peminjaman";
        }

        info += "\n";

        return info;
    }
}