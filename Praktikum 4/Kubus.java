/**
* Kubus.java 01/04/2023
* Penulis : Vanesya F. W.
* Deskripsi : representasi dari objek kubus 
*/

/* package org.bangunruang;

import org.bangundatar.BujurSangkar;

*/

public class Kubus{
    private BujurSangkar permukaan;

    public Kubus(BujurSangkar permukaan){
        this.permukaan = permukaan;
    }

    public double hitungVolume(){
        double sisi = permukaan.doubleSisi();
        return panjangSisi = sisi * sisi * sisi;
    }

    /* public double hitungLuasAlas(){
        double panjangSisi = permukaan.getPanjangSisi();
        return panjangSisi * panjangSisi;
    } */
}
