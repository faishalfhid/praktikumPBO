/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.praktikum;

/**
 *
 * @author FAISHAL
 */
    public class CarRent { 
        private CarRider rider;//Variabel bernama rider untuk menampung objek CarRider 
        private Car car;//Variabel bernama car untuk menampung objek Car
        private int rentDur;//Variabel bernama rentDur untuk menampung nlai dengan tipe data integer
    
    public CarRent(CarRider rider, Car car, int rentDur){//Konstruktor dengan 3 parameter
        this.rider = rider;//Inisialisasi dari variabel lokal ke variabel global 
        this.car = car;//Inisialisasi dari variabel lokal ke variabel global
        this.rentDur = rentDur;//Inisialisasi dari variabel lokal ke variabel global
    }

    public CarRider getRider(){ 
        return rider;
        }
    }
