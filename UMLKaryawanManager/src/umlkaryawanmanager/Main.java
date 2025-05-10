package umlkaryawanmanager;

/**
 *
 * @author Nama : Ni Putu Ayu Sri Ratnasari 
 *         NIM  : 2301010015
 *         TGL  : 10 Mei 2025
 */
public class Main {
    public static void main(String[] args) {
        // Ubah ukuran array menjadi 8 untuk menampung 8 data
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[8];

        // Isi array
        daftarMahasiswa[0] = new Mahasiswa("Ayu Sri Ratnasari", "22001", 85.5);
        daftarMahasiswa[1] = new MahasiswaAktif("Agus Febri Sedana Putra", "22002", 90.0, 4);
        daftarMahasiswa[2] = new MahasiswaAktif("Rui Nia Kirana", "22003", 78.0, 2);
        daftarMahasiswa[3] = new MahasiswaAktif("Rai", "22004", 75.0, 6);
        daftarMahasiswa[4] = new MahasiswaAktif("Yuni Nia Kirana", "22005", 90.0, 8);
        daftarMahasiswa[5] = new MahasiswaAktif("Arya", "22006", 95.0, 6);
        daftarMahasiswa[6] = new MahasiswaAktif("Kania", "22007", 100.0, 8);
        daftarMahasiswa[7] = new MahasiswaAktif("Dewi Lestari", "22008", 82.5, 3);

        // Tampilkan semua data
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("== Mahasiswa ke-" + (i + 1) + " ==");
            if (daftarMahasiswa[i] != null) {
                daftarMahasiswa[i].tampilInfo();
                System.out.println();
            }
        }
    }
}