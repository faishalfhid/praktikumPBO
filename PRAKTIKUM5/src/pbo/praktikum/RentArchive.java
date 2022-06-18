/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.praktikum;

import java.util.ArrayList; 

    public class RentArchive {
        //Private static ArrayList untuk menampung nilai dengan tipe data CarRent
        private static ArrayList <CarRent> rentData = new ArrayList<CarRent>();
    
    //Method static void dengan 3 parameter
    public void Rent(CarRider rider, Car car, int rentDur){
        //Menampilkan informasi terkait rental
        CarRent rent = new CarRent(rider, car, rentDur);
        rentData.add(rent);
        }
    //static Void untuk menampilkan informasi terkait pelanggan
    public void info(){ //Pengkondisian untuk mengecek panjang ArrayList dengan tipe data CarRent
        System.out.println("===============================");
        System.out.println("	INFORMASI PELANGGAN	");
        System.out.println("===============================");
            for (CarRent data : RentArchive.rentData){//For each utk menampilkan ArrayList dengan tipe data CarRent
                System.out.println("NAMA PEMINJAM	: " + data.getRider().getName());//Untuk menampilkan Nama Rider
                System.out.println("TIPE MOBIL	: " + data.getCar().getCarType());//Untuk menampilkan Nama Tipe Mobil
                System.out.println("NO. POLISI	: " + data.getCar().getPolNum());
                System.out.println("LAMA RENTAL	: " + data.getRentDur());
                System.out.println("-----------------");
                }
            }
    }