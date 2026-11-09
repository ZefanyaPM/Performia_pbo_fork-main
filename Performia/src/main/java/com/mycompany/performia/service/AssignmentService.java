/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performia.service;

import com.mycompany.performia.Karyawan;
import com.mycompany.performia.RiwayatPenugasan;
import com.mycompany.performia.Tugas;
import java.time.LocalDate;

/**
 *
 * @author Zefa
 */
public class AssignmentService implements AssignmentOperations {
    @Override
    public void assignTask(
            Karyawan karyawan,
            String idTugas,
            String judul,
            LocalDate tanggalBatas,
            int skorXP) {

        if (karyawan == null) {
            throw new IllegalArgumentException("Karyawan wajib dipilih");
        }
        if (idTugas == null || idTugas.isBlank()) {
            throw new IllegalArgumentException("ID tugas wajib diisi");
        }
        if (judul == null || judul.isBlank()) {
            throw new IllegalArgumentException("Judul tugas wajib diisi");
        }

        if (tanggalBatas == null) {
            throw new IllegalArgumentException("Tanggal batas wajib diisi");
        }

        if (skorXP < 0) {
            throw new IllegalArgumentException("Skor XP tidak boleh negatif");
        }

        karyawan.tambahTugas(
                new Tugas(
                        idTugas,
                        judul,
                        LocalDate.now(),
                        tanggalBatas,
                        Tugas.STATUS_ON_GOING,
                        skorXP
                )
        );
    }

    @Override
    public void submitTask(Tugas tugas) {
        if (tugas == null) {
            throw new IllegalArgumentException("Tugas tidak ditemukan");
        }
        tugas.submit();
    }

    @Override
    public void reviewTask(Karyawan karyawan, Tugas tugas) {
        if (karyawan == null) {
            throw new IllegalArgumentException("Karyawan tidak ditemukan");
        }
        if (tugas == null) {
            throw new IllegalArgumentException("Tugas tidak ditemukan");
        }
        tugas.complete();
        karyawan.tambahXP(tugas.getSkorXP());

        karyawan.setRiwayat(
                new RiwayatPenugasan(
                        LocalDate.now().toString(),
                        tugas.getJudul(),
                        tugas.getSkorXP()
                )
        );
    }
}
