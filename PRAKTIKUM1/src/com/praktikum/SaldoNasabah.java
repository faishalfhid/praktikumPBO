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
public class SaldoNasabah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldoAwal = scan.nextDouble();
        double saldoSetor = scan.nextDouble();
        System.out.println(saldoT(saldoAwal, saldoSetor));
    }
    static double biayaAdmin(double saldoAwal, double saldoSetor){
        
        double saldoSekarang = saldoAwal + saldoSetor;
        double admin = saldoSekarang - 7000;
        return admin;
    }
    
    static double saldoT(double saldoAwal, double saldoSetor){
        double bonus = 0.0005;
        double saldoAkhir = biayaAdmin(saldoAwal,saldoSetor) * bonus;
        double saldoTotal = biayaAdmin(saldoAwal,saldoSetor) + saldoAkhir;
        return saldoTotal;
    }
}