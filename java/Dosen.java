public class Dosen { // 
    // Atribut dosen
    private String namaDosen;
    private String nip;
    private String bidangKeahlian;
    private String prodi;
    private String email;

    // Konstruktor untuk inisialisasi objek Dosen
    public Dosen(String namaDosen, String nip, String bidangKeahlian, String prodi, String email) {
        this.namaDosen = namaDosen;
        this.nip = nip;
        this.bidangKeahlian = bidangKeahlian;
        this.prodi = prodi;
        this.email = email;
    }

    // Method untuk menampilkan info lengkap dosen
    public void tampilkanInfo() {
        System.out.println("Nama Dosen       : " + namaDosen);
        System.out.println("NIP              : " + nip);
        System.out.println("Bidang Keahlian  : " + bidangKeahlian);
        System.out.println("Program Studi    : " + prodi);
        System.out.println("Email            : " + email);
    }
    
    // Metode main untuk menjalankan program dan menampilkan semua data dosen
    public static void main(String[] args) {
        System.out.println("=== DAFTAR DOSEN ===");
        
        // Dosen 1
        Dosen dosen1 = new Dosen("Raswa, M.T.", "198005122005011002", "Jaringan Komputer", "Teknik Informatika", "asep.surasep@polman-babel.ac.id");
        dosen1.tampilkanInfo();
        System.out.println("--------------------");
        
        // Dosen 2
        Dosen dosen2 = new Dosen("muhammad mustamiin, Ph.D.", "197509212000031005", "Kecerdasan Buatan", "Teknik Elektro", "budi.santoso@polman-babel.ac.id");
        dosen2.tampilkanInfo();
        System.out.println("--------------------");
        
        // Dosen 3
        Dosen dosen3 = new Dosen("Citra Lestari, M.Kom.", "198811032015092001", "Rekayasa Perangkat Lunak", "Sistem Informasi", "citra.lestari@polman-babel.ac.id");
        dosen3.tampilkanInfo();
        System.out.println("--------------------");
        
        // Dosen 4
        Dosen dosen4 = new Dosen("Dewi Anggraini, S.T., M.Eng.", "199002152018022003", "Grafika Komputer", "Teknik Informatika", "dewi.anggraini@polman-babel.ac.id");
        dosen4.tampilkanInfo();
        System.out.println("--------------------");
        
        // Dosen 5
        Dosen dosen5 = new Dosen("Eko Prasetyo, M.T.", "198307292010041007", "Keamanan Siber", "Teknik Informatika", "eko.prasetyo@polman-babel.ac.id");
        dosen5.tampilkanInfo();
        System.out.println("--------------------");
    }
}