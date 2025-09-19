public class Mahasiswa {
    // Atribut mahasiswa
    private String namaMahasiswa = "Alda Aunillah";
    private String nim = "2403050";
    private String namaProdi = "Teknik Informatika";
    private String jenjang = "D3";
    private String kelas = "TI-2B";
    private double ipk = 3.85;
    private int semester = 3;

    // Method untuk menampilkan info lengkap mahasiswa
    public void tampilkanInfo() {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("Nama Mahasiswa : " + namaMahasiswa);
        System.out.println("NIM            : " + nim);
        System.out.println("Program Studi  : " + namaProdi);
        System.out.println("Jenjang        : " + jenjang);
        System.out.println("Kelas          : " + kelas);
        System.out.println("Semester       : " + semester);
        System.out.println("IPK            : " + ipk);
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        mhs.tampilkanInfo();
    }
}
