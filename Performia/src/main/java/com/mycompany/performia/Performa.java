/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performia;
import java.util.Random;

/**
 *
 * @author Zefa
 */
public class Performa {
    private Kriteria onTimeCriteria;
    private Kriteria overdueCriteria;
    private String idPerforma;
    private float onTimeRate;
    private int tugasSelesai;
    private int tugasProgres;
    private int totalTugas;
    private int skorPerforma;
    private int totalXP;
    
    Random rand = new Random();
    private static int randomGenTemp = 0;

    public Performa() {
        this.onTimeCriteria = new Kriteria("KR-OT", "On-Time", 0.5f);
        this.overdueCriteria = new Kriteria("KR-OD", "Overdue", 0.5f);
    }
    
    public Performa(String idKriteria, String namaKriteria, float bobot, String idPerforma, float onTimeRate){
        this.onTimeCriteria = new Kriteria(idKriteria, namaKriteria, bobot);
        this.overdueCriteria = new Kriteria("KR-OD", "Overdue", 0.5f);
        this.idPerforma = idPerforma;
        this.onTimeRate = onTimeRate;
    }

    public Performa(String idKriteria, String namaKriteria, float bobot, String idPerforma, float onTimeRate,
                    int tugasSelesai, int tugasProgres, int totalTugas, int skorPerforma, int totalXP) {
        this.onTimeCriteria = new Kriteria(idKriteria, namaKriteria, bobot);
        this.overdueCriteria = new Kriteria("KR-OD", "Overdue", 0.5f);
        this.idPerforma = idPerforma;
        this.onTimeRate = onTimeRate;
        this.tugasSelesai = tugasSelesai;
        this.tugasProgres = tugasProgres;
        this.totalTugas = totalTugas;
        this.skorPerforma = skorPerforma;
        this.totalXP = totalXP;
    }
    
//    public int generateXP(){ //untuk generate penambahan XP
//        int random = rand.nextInt(1, 21) * 5;
//        randomGenTemp = random;
//        return random;
//    }
    
    //utk Riwayat Penambahan XP pake ini
//    public static int getRecentTaskXP(){ //untuk ambil nilai penambahan XP terbaru (untuk ambil data XP task terbaru)
//        return randomGenTemp;
//    }
        
    public String getIdPerforma(){
        return idPerforma;
    }

    public Kriteria getOnTimeCriteria() {
        return onTimeCriteria;
    }

    public void setOnTimeCriteria(Kriteria onTimeCriteria) {
        this.onTimeCriteria = onTimeCriteria;
    }

    public Kriteria getOverdueCriteria() {
        return overdueCriteria;
    }

    public void setOverdueCriteria(Kriteria overdueCriteria) {
        this.overdueCriteria = overdueCriteria;
    }
    
    public float getOnTimeRate(){
        return onTimeRate;
    }

    public int getTugasSelesai() {
        return tugasSelesai;
    }

    public void setTugasSelesai(int tugasSelesai) {
        this.tugasSelesai = tugasSelesai;
    }

    public int getTugasProgres() {
        return tugasProgres;
    }

    public void setTugasProgres(int tugasProgres) {
        this.tugasProgres = tugasProgres;
    }

    public int getTotalTugas() {
        return totalTugas;
    }

    public void setTotalTugas(int totalTugas) {
        this.totalTugas = totalTugas;
    }

    public int getSkorPerforma() {
        return skorPerforma;
    }

    public void setSkorPerforma(int skorPerforma) {
        this.skorPerforma = skorPerforma;
    }

    public int getTotalXP() {
        return totalXP;
    }

    public void setTotalXP(int totalXP) {
        this.totalXP = totalXP;
    }
}