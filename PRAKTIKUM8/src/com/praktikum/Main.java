package com.praktikum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Magician magic = null;
        Titan titan = new Titan(0, 45, 200);
        Healer healer = null;
        Warrior warrior = null;
        int pilihan = 0;
        System.out.println("Selamat Datang di Game Defend FILKOM !");
        System.out.print("Silahkan masukkan nama player : ");
        String NamaPemain = scan.nextLine();
        
        boolean ulangmenu = true; 
        do {
            System.out.println("Silahkan pilih karakter yang diinginkan:");
            System.out.println("1. Magician");
            System.out.println("2. Healer");
            System.out.println("3. Warrior");
            
            do {
                try {
                    System.out.print("Pilih: ");
                    pilihan = scan.nextInt();
                    ulangmenu = false;
                } catch (Exception e) {
                    ulangmenu = true;
                    scan.next();
                    System.out.println("Masukkin angka bro!");
                }
            } while (ulangmenu);
            ulangmenu = true;

            System.out.println("Selamat datang " + NamaPemain + " !");
            switch (pilihan){
                case 1 :
                    System.out.println("1");
                    magic = new Magician(10, 60, 100);
                    magic.info();
                    ulangmenu = true;
                    System.out.println("\n==============================");
                    System.out.println("      Siap Untuk Bertarung      ");
                    System.out.println("==============================\n");
                    for(int i = 0; ulangmenu; i++){
                        if(titan.getHP() > 0 && magic.getHP()>0){
                            System.out.println("\n>======== TURN "+(i+1)+"==========<");
                            if(magic.attack()){
                                magic.receiveDamage(titan);
                            }
                            if(titan.attack()){
                                titan.receiveDamage(magic);
                            }
                            System.out.println(NamaPemain +"'s HP : "+ magic.getHP());
                            System.out.println("Enemy's HP : "+titan.getHP());
                        } else{
                            ulangmenu=false;
                        }
                    }
                    ulangmenu = true;
                    System.out.println("");
                        if(titan.getHP() == 0){
                            System.out.println("     "+ NamaPemain +"'s WIN this Game     ");
                            System.out.println("      ***  YOU WIN  ***      ");
                        }else if(magic.getHP() == 0){
                            System.out.println("    Titan's WIN this Game     ");
                            System.out.println("      ***  YOU LOSE  ***      ");
                        }
                        System.out.println("");

                        System.out.println("\n******************************");
                        System.out.println("  Statistik Akhir Pertandingan  ");
                        System.out.println("******************************\n");
                        magic.info();
                        titan.info();
                        System.out.println("------------------------------");
                        System.out.println("");
                    
                    break;
                case 2 :
                    System.out.println("2");
                    healer = new Healer(10, 10, 70);
                    healer.info();
                    ulangmenu = true;
                    System.out.println("\n==============================");
                    System.out.println("      Siap Untuk Bertarung      ");
                    System.out.println("==============================\n");
                    for(int i = 0; ulangmenu; i++){
                        if(titan.getHP() > 0 && healer.getHP()>0){
                            System.out.println("\n>======== TURN "+(i+1)+"==========<");
                            if(i % 2 == 1){
                                healer.heal();
                            }
                            
                            if(healer.attack()){
                                healer.receiveDamage(titan);
                            }
                            if(titan.attack()){
                                titan.receiveDamage(healer);
                            }
                            System.out.println(NamaPemain +"'s HP : "+ healer.getHP());
                            System.out.println("Enemy's HP : "+titan.getHP());
                        } else{
                            ulangmenu=false;
                        }
                    }
                    ulangmenu = true;
                    System.out.println("");
                        if(titan.getHP() == 0){
                            System.out.println("     "+ NamaPemain +"'s WIN this Game     ");
                            System.out.println("      ***  YOU WIN  ***      ");
                        }else if(healer.getHP() == 0){
                            System.out.println("    Titan's WIN this Game     ");
                            System.out.println("      ***  YOU LOSE  ***      ");
                        }
                        System.out.println("");

                        System.out.println("\n******************************");
                        System.out.println("  Statistik Akhir Pertandingan  ");
                        System.out.println("******************************\n");
                        healer.info();
                        titan.info();
                        System.out.println("------------------------------");
                        System.out.println("");
                    break;
                case 3 :
                    System.out.println("3");
                    warrior = new Warrior(30, 25, 80);
                    warrior.info();
                    ulangmenu = true;
                    System.out.println("\n==============================");
                    System.out.println("      Siap Untuk Bertarung      ");
                    System.out.println("==============================\n");
                    for(int i = 0; ulangmenu; i++){
                        if(titan.getHP() > 0 && warrior.getHP()>0){
                            System.out.println("\n>======== TURN "+(i+1)+"==========<");
                            if(warrior.attack()){
                                warrior.receiveDamage(titan);
                            }
                            if(titan.attack()){
                                titan.receiveDamage(warrior);
                            }
                            System.out.println(NamaPemain +"'s HP : "+ warrior.getHP());
                            System.out.println("Enemy's HP : "+titan.getHP());
                        } else{
                            ulangmenu=false;
                        }
                    }
                    ulangmenu = true;
                    System.out.println("");
                        if(titan.getHP() == 0){
                            System.out.println("     "+ NamaPemain +"'s WIN this Game     ");
                            System.out.println("      ***  YOU WIN  ***      ");
                        }else if(warrior.getHP() == 0){
                            System.out.println("    Titan's WIN this Game     ");
                            System.out.println("      ***  YOU LOSE  ***      ");
                        }
                        System.out.println("");

                        System.out.println("\n******************************");
                        System.out.println("  Statistik Akhir Pertandingan  ");
                        System.out.println("******************************\n");
                        warrior.info();
                        titan.info();
                        System.out.println("------------------------------");
                        System.out.println("");
                    break;
                default :
                    System.out.println("Input yang anda masukan tidak sesuai");
                    break;
            }
            
        } while (ulangmenu);
    }
}
