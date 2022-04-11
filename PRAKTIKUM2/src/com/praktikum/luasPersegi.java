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
class luasPersegi{
        int luas;
        int sisi;
        luasPersegi(int sisi){
        this.sisi=sisi;
        this.luas=sisi*sisi;
        }
        void outputPersegi(){
            System.out.println(luas);
        }
}