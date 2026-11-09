/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performia;

/**
 *
 * @author Zefa
 */
public class Kriteria {
    protected String idKriteria;
    protected String namaKriteria;
    protected float bobot;

    public Kriteria() {
        this("", "", 0f);
    }
    
    public Kriteria(String idKriteria, String namaKriteria, float bobot){
        this.idKriteria = idKriteria;
        this.namaKriteria = namaKriteria;
        this.bobot = bobot;
    }
    
    public String getIdKriteria(){
        return idKriteria;
    }
    
    public String getNamaKriteria(){
        return namaKriteria;
    }

    public void setIdKriteria(String idKriteria) {
        this.idKriteria = idKriteria;
    }

    public void setNamaKriteria(String namaKriteria) {
        this.namaKriteria = namaKriteria;
    }
    
    public float getBobot(){
        return bobot;
    }
    
    public void setBobot(float bobot){
        this.bobot = bobot;
    }
}
