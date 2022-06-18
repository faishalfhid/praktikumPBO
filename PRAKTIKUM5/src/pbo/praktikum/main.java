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
    public class main {
        public static void main(String[] args) { 
            System.out.println("Nama :\\t Faishal Fariz Hidaayatullah");
            System.out.println("Nama :\t 215150607111014");
            CarRider rider1 = new CarRider ("Bayu", 39, "08000000000");//Instansiasi Objek CarRider1 dengan data yang telah ditetapkan.
            CarRider rider2 = new CarRider ("Faiz", 46, "08111111111");//Instansiasi Objek CarRider2 dengan data yang telah ditetapkan.
            CarRider rider3 = new CarRider ("Joy", 52, "08222222222");//Instansiasi Objek CarRider3 dengan data yang telah ditetapkan.
            CarRider rider4 = new CarRider ("Prima", 36, "08333333333");//Instansiasi Objek CarRider4 dengan data yang telah ditetapkan.

        CarData data = new CarData();//Instansiasi Objek CarData dengan nama CarData
        data.addCar("SUV", "N 1111 AB","Honda");
        data.addCar("SPORT", "N 2222 AB","SCC Tuatara");
        data.addCar("CONVERTIBLEE", "N 3333 AB", "Suzuki");
        data.addCar("COUPE", "N 4444 AB", "Daihatsu");

    data.listOfCar();

        RentArchive arsip = new RentArchive(); 
            arsip.Rent(rider1,data.getCarList().get(0), 12); 
            arsip.Rent(rider2,data.getCarList().get(1), 7); 
            arsip.Rent(rider3,data.getCarList().get(2), 3); 
            arsip.Rent(rider4,data.getCarList().get(3), 2);
            System.out.println(); 
            Car.status();

    System.out.println(); 
    arsip.info();

    }
 }