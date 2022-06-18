package com.praktikum;

public class Healer extends Character {

    @Override
    public boolean attack() {
        double random = Math.random() * 10;
        if(random <= 8.5){
            return true;
        }
        return false;
    }

    void heal(){
        this.setHP(this.getHP()+25);
        System.out.println("### Skill Heal Diaktifkan ###");
    }

    public Healer(int defense, int attack, int hP) {
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
