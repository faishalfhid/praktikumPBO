package com.praktikum;

public class Magician extends Character {

    @Override
    public boolean attack() {
        double random = Math.random() * 10;
        if(random <= 3.5){
            return true;
        }
        return false;
    }

    public Magician(int defense, int attack, int hP) {
        super(defense, attack, hP);
    }

    @Override
    public void receiveDamage(Character karakter) {
        super.receiveDamage(karakter);
    }

    @Override
    public void info(){
        System.out.println("=========== PLAYER ===========");
        super.info();
    }
}