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
    public class CarRider { 
        private String name;//Variabel untuk menampung nilai tipe data String dgn nama name 
        private int age;//Variabel untuk menampung nilai tipe data integer dgn nama age 
        private String phone;//Variabel untuk menampung nilai dengan tipe data String dgn nama phone

    public CarRider(String name, int age, String phone){//Konstruktor dengan 3 parameter
        this.name = name;//Inisialisasi dari variabel lokal ke variabel global 
        this.age = age;//Inisialisasi dari variabel lokal ke variabel global 
        this.phone = phone;//Inisialisasi dari variabel lokal ke variabel global
        }

    public String getName() { 
        return name;
        }

    public int getAge() { 
        return age;
        }

    public String getPhone() { 
        return phone;
        }
}

