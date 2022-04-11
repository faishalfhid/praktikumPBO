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
            System.out.println(luasPersegi(sisi));
            break;
        case 2 :
            int alas = scan.nextInt();
            int tinggi = scan.nextInt();
            System.out.println(luasSegitiga(alas, tinggi));
            break;
        case 3 :
            int jari = scan.nextInt();
            System.out.println(luasLingkaran(jari));
            break;
        default :
            System.out.println("Input yang anda masukan tidak sesuai");
            break;
    }
 }
    
    static int luasPersegi(int sisi){
        int luas = sisi * sisi;
        return luas;
    }
    static int luasSegitiga(int alas, int tinggi){
        int luas = alas * tinggi / 2;
        return luas;
    }
    static double luasLingkaran(int jari){
        if(jari % 7 == 0){
        double phi = 22/7;
        double luas = phi * jari * jari;
        return (double)(int)luas;  
        } else {
        double phi = 3.14;
        double luas = phi * jari * jari;
        return (double)(int)luas;  
        }
        
    }
}
