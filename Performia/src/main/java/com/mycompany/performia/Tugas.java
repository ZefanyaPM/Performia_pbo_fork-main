/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performia;

/**
 *
 * @author MSI Gaming
 */
import java.time.LocalDate;

public class Tugas {

    public static final String STATUS_ON_GOING = "On-Going";
    public static final String STATUS_WAITING_FOR_REVIEW = "Waiting for Review";
    public static final String STATUS_DONE = "Done";

    private String idTugas;
    private String judul;
    private LocalDate tanggalDibuat;
    private LocalDate tanggalBatas;
    private LocalDate tanggalDikumpulkan;
    private String status;
    private int skorXP;

    public Tugas() {

    }

    public Tugas(
            String idTugas,
            String judul,
            LocalDate tanggalDibuat,
            LocalDate tanggalBatas,
            String status, int skorXP) {

        this.idTugas = idTugas;
        this.judul = judul;
        this.tanggalDibuat = tanggalDibuat;
        this.tanggalBatas = tanggalBatas;
        this.status = status;
        this.skorXP = skorXP;
    }

    public String getIdTugas() {
        return idTugas;
    }
    
    public String getJudul() {
        return judul;
    }

    public LocalDate getTanggalDibuat() {
        return tanggalDibuat;
    }

    public LocalDate getTanggalBatas() {
        return tanggalBatas;
    }

    public String getStatus() {
        return status;
    }

    public void submit() {
        if (!STATUS_ON_GOING.equals(status)) {
            throw new IllegalStateException("Tugas hanya dapat disubmit saat sedang berjalan");
        }
        this.tanggalDikumpulkan = LocalDate.now();
        this.status = STATUS_WAITING_FOR_REVIEW;
    }

    public void complete() {
        if (!STATUS_WAITING_FOR_REVIEW.equals(status)) {
            throw new IllegalStateException("Tugas belum menunggu review");
        }
        this.status = STATUS_DONE;
    }

    public LocalDate getTanggalDikumpulkan() {
        return tanggalDikumpulkan;
    }

    public int getSkorXP() {
        return skorXP;
    }
     
}