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
class luasSegitiga{
        int luas;
        int tinggi;
        int alas;
        luasSegitiga(int tinggi, int alas){
        this.tinggi=tinggi;
        this.alas=alas;
        this.luas=alas * tinggi / 2; 
        }
        void outputSegitiga(){
            System.out.println(luas);
        }
}