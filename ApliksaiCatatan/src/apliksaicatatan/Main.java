/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apliksaicatatan;
import java.util.Scanner;

/**
 *
 * @author Nama : Ni Putu Ayu Sri Ratnasari 
 *         NIM  : 2301010015
 *         TGL 10 Mei 2025
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Catatan catatan = new Catatan(10); 
        int pilihan;

        do {
            System.out.println("====================================");
            System.out.println("1. Pencatatan");
            System.out.println("2. Menampilkan Data");
            System.out.println("3. Mengubah Data");
            System.out.println("4. Menghapus Data");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    pencatatan(scanner, catatan);
                    break;
                case 2:
                    menampilkanData(catatan);
                    break;
                case 3:
                    mengubahData(scanner, catatan);
                    break;
                case 4:
                    menghapusData(scanner, catatan);
                    break;
                case 5:
                    System.out.println("Terima kasih, aplikasi selesai!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
                    break;
            }
        } while (pilihan != 5);
    }

    public static void pencatatan(Scanner scanner, Catatan catatan) {
        if (catatan.getCount() < 10) {
            System.out.print("Masukkan catatan baru: ");
            String catatanBaru = scanner.nextLine();
            catatan.tambahCatatan(catatanBaru);
        } else {
            System.out.println("Tidak bisa menambah catatan, kapasitas penuh.");
        }
    }

    public static void menampilkanData(Catatan catatan) {
        catatan.tampilkanCatatan();
    }

    public static void mengubahData(Scanner scanner, Catatan catatan) {
        if (catatan.getCount() == 0) {
            System.out.println("Tidak ada data untuk diubah.");
        } else {
            System.out.print("Masukkan nomor catatan yang ingin diubah (1-" + catatan.getCount() + "): ");
            int nomor = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Masukkan catatan baru: ");
            String catatanBaru = scanner.nextLine();
            catatan.ubahCatatan(nomor, catatanBaru);
        }
    }

    public static void menghapusData(Scanner scanner, Catatan catatan) {
        if (catatan.getCount() == 0) {
            System.out.println("Tidak ada data untuk dihapus.");
        } else {
            System.out.print("Masukkan nomor catatan yang ingin dihapus (1-" + catatan.getCount() + "): ");
            int nomor = scanner.nextInt();
            scanner.nextLine();
            catatan.hapusCatatan(nomor);
        }
    }
}
