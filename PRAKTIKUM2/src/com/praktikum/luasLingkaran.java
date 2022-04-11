/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.praktikum;

/**
 *
 * @author FAISHAL
 */
class luasLingkaran{
        double luas;
        int jari;
        luasLingkaran(int jari){
        this.jari=jari;
        this.luas=luas;
        if(jari % 7 == 0){
        double phi = 22/7;
        luas = phi * jari * jari;  
        } else {
        double phi = 3.14;
        luas = phi * jari * jari;
        }
        }
        void outputLingkaran(){
            System.out.println((double)(int)luas);
        }  
    }