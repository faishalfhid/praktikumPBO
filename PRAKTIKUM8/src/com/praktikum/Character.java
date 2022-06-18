package com.praktikum;

public abstract class Character {
    private int defense;
    private int attack;
    private int HP;
    
    //Konstruktor
    public Character(int defense, int attack, int hP) {
        this.defense = defense;
        this.attack = attack;
        HP = hP;
    }
    
    protected void setDefense(int defense) {
        this.defense = defense;
    }
    public int getDefense() {
        return defense;
    }

    protected void setAttack(int attack) {
        this.attack = attack;
    }
    public int getAttack() {
        return attack;
    }

    protected void setHP(int hP) {
        HP = hP;
    }
    public int getHP() {
        return HP;
    }

    public abstract boolean attack();

    public void receiveDamage(Character karakter){
        if(karakter.attack > this.defense){
            this.HP = this.HP - (karakter.attack - this.defense);
            System.out.println(karakter.getClass().getSimpleName()+" Attack : Succed (" + this.getClass().getSimpleName()+" Receive " + (karakter.attack - this.defense)+")");
            if(this.HP <= 0){
                this.HP = 0;
            }
        }
    }
    
    public void info(){
        System.out.println("----------- STATUS -----------");
        System.out.println("Role\t: "+this.getClass().getSimpleName());
        System.out.println("HP\t: "+this.HP);
        System.out.println("Attack\t: " + this.attack);
        System.out.println("Defense\t: " + this.defense);
    }


}
