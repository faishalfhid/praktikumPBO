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
public class SuratKaisar {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        String kataAwal = scan.nextLine();
        int N = scan.nextInt();
        String kata ="";
        System.out.println(enkripsi(kata,N,kataAwal));
  }
        public static String enkripsi (String kata, int N, String kataAwal){
        kata = "";
        char alphabet;
        for(int i=0; i < kataAwal.length();i++){
            alphabet = kataAwal.charAt(i);
                if(alphabet >= 'a' && alphabet <= 'z'){
                alphabet = (char) (alphabet + N);
                    if(alphabet > 'z') {
                    alphabet = (char) (alphabet+'a'-'z'-1);
                    }
                kata = kata + alphabet;
                }
                else if(alphabet >= 'A' && alphabet <= 'Z') {
                alphabet = (char) (alphabet + N);    
                    if(alphabet > 'Z') {
                    alphabet = (char) (alphabet+'A'-'Z'-1);
                    }
                    kata = kata + alphabet;
                    }else {
             kata = kata + alphabet;   
            }  
    }   
        return kata;
        }     
}
