/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.performia;

/**
 *
 * @author ASUS
 */
public class Reward {
    private String idReward;
    private String namaReward;

    public Reward(String idReward, String namaReward) {
        this.idReward = idReward;
        this.namaReward = namaReward;
    }

    public String getIdReward() { return idReward; }
    public String getNamaReward() { return namaReward; }
}