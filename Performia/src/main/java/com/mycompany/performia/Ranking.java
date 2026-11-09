/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performia;

/**
 *
 * @author ARTHES
 */
public class Ranking {
    private String periode;
    private String namaKaryawan;
    private int skorAkhir;
    private Reward rewardYangDidapat;

    public Ranking(String periode, String namaKaryawan, int skorAkhir, Reward rewardYangDidapat) {
        this.periode = periode;
        this.namaKaryawan = namaKaryawan;
        this.skorAkhir = skorAkhir;
        this.rewardYangDidapat = rewardYangDidapat;
    }

    public String getNamaKaryawan() {
        return namaKaryawan;
    }

    public String getPeriode() {
        return periode;
    }

    public int getSkorAkhir() {
        return skorAkhir;
    }

    public Reward getRewardYangDidapat() {
        return rewardYangDidapat;
    }

    public void setNamaKaryawan(String namaKaryawan) {
        this.namaKaryawan = namaKaryawan;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }

    public void setSkorAkhir(int skorAkhir) {
        this.skorAkhir = skorAkhir;
    }

    public void setRewardYangDidapat(Reward rewardYangDidapat) {
        this.rewardYangDidapat = rewardYangDidapat;
    }
}
