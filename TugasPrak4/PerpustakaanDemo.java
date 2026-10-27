import java.time.LocalDate;

public class PerpustakaanDemo {
    public static void main(String[] args) {
        Buku buku1 = new Buku("B001", "Pemrograman Java", "Budi");
        Buku buku2 = new Buku("B002", "Basis Data", "Ezzy");

        Anggota anggota1 = new Anggota("A001", "Zasky");
        anggota1.tambahPeminjaman(LocalDate.of(2026, 9, 1), buku1);
        anggota1.tambahPeminjaman(LocalDate.of(2026, 9, 5), buku2);

        Anggota anggota2 = new Anggota("A002", "Ahmad");
        anggota2.tambahPeminjaman(LocalDate.of(2026, 9, 6), buku1);

        System.out.println("=== Sebelum pengembalian ===");
        System.out.println(anggota1.getInfo());
        System.out.println(anggota2.getInfo());

        Peminjaman peminjamanPertama = anggota1.getRiwayatPeminjaman().get(0);
        peminjamanPertama.kembalikanBuku(LocalDate.of(2026, 9, 10));

        anggota2.tambahPeminjaman(LocalDate.of(2026, 9, 11), buku1);

        System.out.println("=== Setelah pengembalian ===");
        System.out.println(anggota1.getInfo());
        System.out.println(anggota2.getInfo());
    }
}