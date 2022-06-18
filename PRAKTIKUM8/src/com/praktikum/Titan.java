package com.praktikum;

public class Titan extends Character {

    @Override
    public boolean attack() {
        double random = Math.random() * 10;
        if(random <= 4.0){
            return true;
        }
        return false;
    }

    public Titan(int defense, int attack, int hP) {
        super(defense, attack, hP);
    }

    @Override
    public void receiveDamage(Character karakter) {
        super.receiveDamage(karakter);
    }

    @Override
    public void info(){
        System.out.println("=========== MUSUH ===========");
        super.info();
    }
}
