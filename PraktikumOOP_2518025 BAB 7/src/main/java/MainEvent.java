/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Nadya
 */
public class MainEvent {

    public static void main(String[] args) {

        // UPCASTING
        Tiket tiket = new TiketVIP();

        tiket.setHarga(100000);
        tiket.setJumlah(2);

        // DOWNCASTING
        TiketVIP vip = (TiketVIP) tiket;

        vip.setDiskon(20000);

        System.out.println("Total Bayar : " + vip.total());
    }
}