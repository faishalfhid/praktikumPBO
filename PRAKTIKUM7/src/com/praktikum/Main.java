package com.praktikum;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nama        : Faishal Fariz Hidayatullah");
        System.out.println("NIM         : 215150607111014\n");
        
        System.out.println("==== Pegawai Tetap ====\n");
        Pegawai PegawaiTetap = new PegawaiTetap("Faishal", "3504105008710009", 2_500_000);
        Pegawai PegawaiTetap1 = new PegawaiTetap("Yoga", "3504105008710008", 2_000_000);
        Pegawai PegawaiTetap2 = new PegawaiTetap("Kumara", "3504105008720007", 5_400_000);
        System.out.println(PegawaiTetap.toString());
        System.out.println(PegawaiTetap1.toString());
        System.out.println(PegawaiTetap2.toString());

        System.out.println("==== Pegawai Harian ====\n");
        Pegawai PegawaiHarian = new PegawaiHarian("Regin", "3504105008730006", 10_500, 40);
        Pegawai PegawaiHarian1 = new PegawaiHarian("Andhika", "3504105008740005", 6_500, 35);
        Pegawai PegawaiHarian2 = new PegawaiHarian("Jeki", "3504105008750004", 30_500, 30);
        System.out.println(PegawaiHarian.toString());
        System.out.println(PegawaiHarian1.toString());
        System.out.println(PegawaiHarian2.toString());

        System.out.println("====== Sales ======\n");
        Pegawai Sales = new Sales("Naufal", "3504105008790003", 40, 50_000);
        Pegawai Sales1 = new Sales("Reza", "3504105008790002", 42, 60_000);
        Pegawai Sales2 = new Sales("Bayu", "3504105008790001", 50, 50_000);
        System.out.println(Sales.toString());
        System.out.println(Sales1.toString());
        System.out.println(Sales2.toString());

    }
}
