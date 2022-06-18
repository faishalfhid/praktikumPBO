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
public class Car {
private String carType;//Variabel global untuk menampung Tipe Mobil   
private String polNum;//Variabel global untuk menampung Nomor Polisi
private String merk;//Variabel global untuk menampung Merek Mobil
private boolean status;//Variabel global untuk menampung status mobil di rental tau tidak

public Car(String carType, String polNum, String merk, boolean status){//Konstruktor dengan 3 parameter
this.carType = carType;//Inisialisasi dari variabel lokal ke variabel global
this.polNum = polNum;// Inisialisasi dari parameter ke variabel global
this.merk = merk;// Inisialisasi dari parameter ke variabel global
this.status = status; // Inisialisasi dari parameter ke variabel global
}        

public Car(String a, String b, String c){
this.carType = a;
this.polNum = b;
this.merk = c;
}

public String getCarType() { //Getter untuk mendapatkan nilai tipe mobil
    return carType;
}

public String getPolNum() { //Getter untuk mendapatkan nilai Nomor Polisi
    return polNum;
}

public String getMerk() { //Getter untuk mendapatkan nilai merek
    return merk;
}

public boolean isStatus() { //Getter untuk mendapatkan nilai status mobil
    return status;
}

public static void setStatus(String status) {
    // Setter untuk mengubah/mengatur nilai status mobil
    if (status == "true") {
    System.out.println("MOBIL BERHASIL DISEWA");
    } else {
    System.out.println("MAAF, MOBIL SUDAH DISEWA");
    }
}

public static void status(){ 
    Car.setStatus("true"); 
    Car.setStatus("false"); 
    Car.setStatus("true"); 
    Car.setStatus("false");
}
}
