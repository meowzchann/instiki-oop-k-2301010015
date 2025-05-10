/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package umlkaryawanmanager;

/**
 *
 * @author Nama : Ni Putu Ayu Sri Ratnasari 
 *         NIM  : 2301010015
 *         TGL 10 Mei 2025
 */
public class Mahasiswa {
    private String nama;
    private String nim;
    protected double nilai;

    public Mahasiswa() {
        this.nama = "Belum Diisi";
        this.nim = "000000";
        this.nilai = 0.0;
    }

    public Mahasiswa(String nama, String nim, double nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getNilai() {
        return nilai;
    }

    public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Nilai: " + nilai);
    }

    public void tampilInfo(String header) {
        System.out.println(header);
        tampilInfo();
    }
}