/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author FAISHAL
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Nama    : Faishal Fariz Hidayatullah \nNIM     : 215150607111014");
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Bakso Pak Sahid", "Bakso", 8000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Nasgor Mblebes", "Nasi Goreng Jawa", 10000));
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant("Ayam Geprek Kak Ros", "Ayam Kota Ekstra Nasi", 10000));
        System.out.println("Masukkan Nama Merchant:");
        String NamaMerch = scan.nextLine();
        System.out.println("Nama Merchant: " + NamaMerch);
        System.out.println("Masukkan Nama Produk:");
        String NamaProduk = scan.nextLine();
        System.out.println("Nama Produk: " + NamaProduk);
        System.out.println("Masukkan Harga Produk:");
        double HargaProduk = scan.nextDouble();
        System.out.println("Harga Produk: " + HargaProduk);
        DataMerchant.merc = DataMerchant.tambahMerchant(new Merchant(NamaMerch, NamaProduk, HargaProduk));
        DataMerchant.tampilData();

    }
}
