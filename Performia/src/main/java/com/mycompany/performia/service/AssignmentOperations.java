package com.mycompany.performia.service;

import com.mycompany.performia.Karyawan;
import com.mycompany.performia.Tugas;
import java.time.LocalDate;

public interface AssignmentOperations {

    void assignTask(
            Karyawan karyawan,
            String idTugas,
            String judul,
            LocalDate tanggalBatas,
            int skorXP);

    void submitTask(Tugas tugas);

    void reviewTask(Karyawan karyawan, Tugas tugas);
}
