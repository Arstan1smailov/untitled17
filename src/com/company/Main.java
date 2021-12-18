package com.company;

public class Main {
    public static String health="HP: ";
    public static String damage="Damage: ";
    public static String nameWeapon="Weapon: ";
    public static String typeWeapon="Type of Weapon: ";
    public static void main(String[] args) {
        // write your code here
        Boss boss = new Boss(1500, 50, "Shield");
        boss.weapon.setNameOfWeapon("Heroes Sword");
        boss.weapon.setTypeOfWeapon("Sword");
        System.out.println(health + boss.getHealth() + "\n" + damage + boss.getDamage() + "\n" + "Defence: " + boss.getDefence() + "\n"
                + nameWeapon + boss.weapon.getNameOfWeapon() + "\n" + typeWeapon + boss.weapon.getTypeOfWeapon());
        System.out.println("-----------------------------------------------------");
        Boss boss1 = new Boss(4000, 50, "Kinetic Shield");
        boss1.weapon.setNameOfWeapon("Dragon's spine");
        boss1.weapon.setTypeOfWeapon("Spell Book");
        System.out.println(boss1.printlinfo() + nameWeapon + boss1.weapon.getNameOfWeapon() + "\n" + typeWeapon + boss1.weapon.getTypeOfWeapon());

        System.out.println("-----------------------------------------------------");
        Gargantua gargantua = new Gargantua(6000, 1000, "Impenetrable", 100);
        gargantua.weapon.setNameOfWeapon("Heavenly Bow");
        gargantua.weapon.setTypeOfWeapon("Bow");
        System.out.println(gargantua.printlinfo()+"\n"+nameWeapon +gargantua.weapon.getNameOfWeapon() + "\n" + typeWeapon + gargantua.weapon.getTypeOfWeapon());
        System.out.println("-----------------------------------------------------");
        Gargantua gargantua1 = new Gargantua(80000, 10000, "Unflappable",100000);
        gargantua1.weapon.setNameOfWeapon("Bow of Archer");
        gargantua1.weapon.setTypeOfWeapon("Bow");
        System.out.println(gargantua1.printlinfo()+"\n"+nameWeapon +gargantua1.weapon.getNameOfWeapon() + "\n" + typeWeapon + gargantua1.weapon.getTypeOfWeapon());


    }
}
