/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.praktikum;

import.java.util.ArrayList; 

    public class CarData {
        //Private static ArrayList untuk menampung data dengan tipe data Car
        private static ArrayList <Car> carList = new ArrayList<Car>();
        public ArrayList<Car> getCarList() { // Konstruktor default
            return carList;
        }

    public void setCarList(ArrayList<Car> carList) {//Setter untuk mengubah list mobil
    CarData.carList = carList;
    }

    public void addCar(String carType, String polNum, String merk){//Konstruktor dengan 3 parameter
    Car car = new Car(carType, polNum, merk); 
    carList.add(car);
    }
    public void listOfCar(){ 
        System.out.println("===============================");
        System.out.println("	DAFTAR MOBIL    ");
        System.out.println("===============================");
    for (Car data : carList) {
        System.out.println("TIPE MOBIL : " + data.getCarType());
        System.out.println("NO.POLISI	: " + data.getPolNum());
        System.out.println("MERK MOBIL : " + data.getMerk());
        System.out.println("-----------------");
    }
  }
}
