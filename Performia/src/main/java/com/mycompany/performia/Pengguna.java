/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performia;

/**
 *
 * @author ARTHES
 */
public class Pengguna {
    private String idUser;
    private String nama;
    private String email;
    private String password;
    
    public Pengguna(String idUser, String nama, String email, String password) {
        this.idUser = idUser;
        this.nama = nama;
        this.email = email;
        this.password = password;
    }
    
    public String getNama() {
        return this.nama;
    }
    
    public String getEmail(){
        return email;
    }
    
    public String getPassword(){
        return password;
    }
}
