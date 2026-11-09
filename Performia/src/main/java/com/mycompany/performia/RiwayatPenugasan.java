/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performia;
import java.util.ArrayList;
/**
 *
 * @author ARTHES
 */
public class RiwayatPenugasan {
    private String tanggal;
    private String namaTugas;
    private int skorXP;

public RiwayatPenugasan(String tanggal, String namaTugas, int skorXP) {
    this.tanggal = tanggal;
    this.namaTugas = namaTugas;
    this.skorXP = skorXP;
}

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getNamaTugas() {
        return namaTugas;
    }

    public void setNamaTugas(String namaTugas) {
        this.namaTugas = namaTugas;
    }

    public int getSkorXP() {
        return skorXP;
    }

    public void setSkorXP(int skorXP) {
        this.skorXP = skorXP;
    }

}
