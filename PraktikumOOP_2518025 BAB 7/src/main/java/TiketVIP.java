/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nadya
 */
public class TiketVIP extends Tiket {

    private int diskon;

    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }

    @Override
    public int total() {
        return (harga * jumlah) - diskon;
    }
}