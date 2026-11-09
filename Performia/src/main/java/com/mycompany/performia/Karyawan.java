/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performia;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author ARTHES
 */
public class Karyawan extends Pengguna {
    private String idDivisi;
    private int totalXP;
    private ArrayList<Tugas> listTugas = new ArrayList<>();
    private ArrayList<RiwayatPenugasan> listRiwayat = new ArrayList<>();
  
    public Karyawan(String idUser, String nama, String email, String password, String idDivisi, int totalXP) {
        super(idUser, nama, email, password);
        this.idDivisi = idDivisi;
        this.totalXP = totalXP;        
    }

    public void tambahXP(int poin) {
        this.totalXP += poin;
    }

    public int getTotalXP() {
        return this.totalXP;
    }
    
    public Tugas getListTugas(int index){
        return listTugas.get(index);
    }

    public void tambahTugas(Tugas tugas) {
        if (tugas == null) {
            throw new IllegalArgumentException("Tugas tidak boleh null");
        }
        listTugas.add(tugas);
    }
    
    public void setTugas(String idTugas, String judulTugas, LocalDate tanggalBatas, int skorXP){
        Tugas tugas = new Tugas(idTugas, judulTugas, LocalDate.now(), tanggalBatas, "On-Going", skorXP);
        tambahTugas(tugas);
    }
    
    public int getTotalTugas(){
        return listTugas.size();
    }
    
    public RiwayatPenugasan getListRiwayatPenugasan(int index){
        return listRiwayat.get(index);
    }
    
    public void setRiwayat(RiwayatPenugasan riwayatBaru){
        listRiwayat.add(riwayatBaru);
    }
    
    public int getTotalRiwayat(){
        return listRiwayat.size();
    }
}
