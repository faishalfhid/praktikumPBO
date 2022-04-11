/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PBOPRAK5;

import java.util.Scanner;
public class TokoBaju {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Baju yang tersedia :");
        int bajuA = 100000;
        System.out.println("Baju A dengan harga " + bajuA);
        int bajuB = 125000;
        System.out.println("Baju B dengan harga " + bajuB);
        int bajuC = 175000;
        System.out.println("Baju C dengan harga " + bajuC);
        System.out.print("Baju yang akan anda beli bertipe : ");
        String jenis = input.nextLine();
        System.out.print("Jumlah baju yang akan anda beli adalah : ");
        int jumlah = input.nextInt();
        
        Baju baju = new Baju(jenis, jumlah);
        baju.output();

        


    }
    
}
