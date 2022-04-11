/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.praktikum;

import java.util.Scanner;

/**
 *
 * @author FAISHAL
 */
public class MenghitungLuas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);
    int pilihan = scan.nextInt();    
    switch (pilihan){
        case 1 :
            int sisi = scan.nextInt();
            luasPersegi luasPersegi = new luasPersegi(sisi);
            luasPersegi.outputPersegi();
            break;
        case 2 :
            int alas = scan.nextInt();
            int tinggi = scan.nextInt();
            luasSegitiga luasSegitiga = new luasSegitiga(alas,tinggi);
            luasSegitiga.outputSegitiga();
        case 3 :
            int jari = scan.nextInt();
            luasLingkaran luasLingkaran = new luasLingkaran(jari);
            luasLingkaran.outputLingkaran();
            break;
        default :
            System.out.println("Input yang anda masukan tidak sesuai");
            break;
    }
 }
}