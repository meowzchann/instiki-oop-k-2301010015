/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apliksaicatatan;

/**
 *
 * @author Nama : Ni Putu Ayu Sri Ratnasari 
 *         NIM  : 2301010015
 *         TGL 10 Mei 2025
 */
public class Catatan {
    private String[] catatan;
    private int count;

    public Catatan(int kapasitas) {
        catatan = new String[kapasitas];
        count = 0;
    }
    
    public void tambahCatatan(String catatanBaru) {
        if (count < catatan.length) {
            catatan[count] = catatanBaru;
            count++;
            System.out.println("Catatan berhasil ditambahkan.");
        } else {
            System.out.println("Tidak bisa menambah catatan, kapasitas penuh.");
        }
    }

    public void tampilkanCatatan() {
        if (count == 0) {
            System.out.println("Tidak ada data untuk ditampilkan.");
        } else {
            System.out.println("Data Catatan:");
            for (int i = 0; i < count; i++) {
                System.out.println((i + 1) + ". " + catatan[i]);
            }
        }
    }
    
    public void ubahCatatan(int nomor, String catatanBaru) {
        if (nomor > 0 && nomor <= count) {
            catatan[nomor - 1] = catatanBaru;
            System.out.println("Catatan berhasil diubah.");
        } else {
            System.out.println("Nomor catatan tidak valid.");
        }
    }

    public void hapusCatatan(int nomor) {
        if (nomor > 0 && nomor <= count) {
            for (int i = nomor - 1; i < count - 1; i++) {
                catatan[i] = catatan[i + 1];
            }
            catatan[count - 1] = null; 
            count--; 
            System.out.println("Catatan berhasil dihapus.");
        } else {
            System.out.println("Nomor catatan tidak valid.");
        }
    }

   
    public int getCount() {
        return count;
    }
}