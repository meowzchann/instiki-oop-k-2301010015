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
public class MahasiswaAktif extends Mahasiswa {
    private int semester;

    public MahasiswaAktif() {
        super();
        this.semester = 1;
    }

    public MahasiswaAktif(String nama, String nim, double nilai, int semester) {
        super(nama, nim, nilai);
        this.semester = semester;
    }
    
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Semester: " + semester);
    }
}
