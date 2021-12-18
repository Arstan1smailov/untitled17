package com.company;

public class Boss extends GameEntity{
    private String defence;
    Weapon weapon = new Weapon();



    public String getDefence() {
        return defence;
    }

    public void setDefence(String defence) {
        this.defence = defence;
    }


    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public Boss(int health ,int damage , String defence ) {
        super(health, damage);
        this.defence=defence;

    }
    public  String printlinfo() {
        return  "Health: "+ getHealth()+"\n"+"Damage: "+getDamage()+"\n"+"Defence: "+this.defence+"\n";
    }
}
