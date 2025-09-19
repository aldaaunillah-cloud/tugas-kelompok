public class Matakuliah {
    // Atribut mata kuliah
    private String namaMatakuliah = "Pemrograman Berorientasi Objek";
    private String kodeMatakuliah = "TI234";
    private int sks = 4;
    private String namaDosen = "Raswa wadidaw, M.T.";
    private String hari = "Kamis";
    private String jam = "13.00 - 15.30";

    // Method untuk menampilkan info lengkap mata kuliah
    public void tampilkanInfo() {
        System.out.println("=== Data Mata Kuliah ===");
        System.out.println("Nama Mata Kuliah : " + namaMatakuliah);
        System.out.println("Kode Mata Kuliah : " + kodeMatakuliah);
        System.out.println("SKS              : " + sks);
        System.out.println("Nama Dosen       : " + namaDosen);
        System.out.println("Hari             : " + hari);
        System.out.println("Jam              : " + jam);
    }

    // Method main untuk menjalankan program
    public static void main(String[] args) {
        Matakuliah mk = new Matakuliah();
        mk.tampilkanInfo();
    }
}