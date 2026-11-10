public class Dosen extends Pegawai implements Comparable<Dosen> {
    public String nidn;

    public Dosen() {
    }

    public Dosen(String nip, String nama, String nidn) {
        super(nip, nama);
        this.nidn = nidn;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("NIDN: " + nidn);
    }

    public void mengajar() {
        System.out.println("Membuat rencana pembelajaran");
        System.out.println("Menyusun materi");
        System.out.println("Melaksanakan PBM");
        System.out.println("Melakukan evaluasi");
    }

    @Override
    public int compareTo(Dosen otherDosen) {
        return Integer.compare(Integer.parseInt(this.nip), Integer.parseInt(otherDosen.nip));
    }
}