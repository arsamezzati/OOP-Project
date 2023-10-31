package Characters;
import Game.GameLogic;
import Items.*;

import java.util.Scanner;

public class Player extends CharacterStats {
    public Player(String name,int health,int damage){
        this.setName(name);
        this.setAttackDamage(damage);
        this.setMaxHealth(health);
        this.setCurHealth(this.getMaxHealth());
        this.setStatus(true);
        this.setLevel(1);
        this.xp = 0;
        this.maxXp = 50;
    }
    private int xp;
    private int maxXp;
    public int getMaxXp(){
        return this.maxXp;
    }
    public void setMaxXp(int amount){
        this.maxXp = amount;
    }
    public int getXp(){
        return this.xp;
    }
    public void setXp(int enemyLevel){
        this.xp = this.xp + (enemyLevel*25);
    }

    public void equipItem(ItemsStats Item){
        this.setMaxHealth(this.getMaxHealth() + Item.getHealth());
        this.setAttackDamage(this.getAttackDamage() + Item.getAttackDamge());
    }
    public void unequipItem(ItemsStats Item){
        this.setMaxHealth(this.getMaxHealth() - Item.getHealth());
        this.setAttackDamage(this.getAttackDamage() - Item.getAttackDamge());
    }
    public void levelUp(){
        this.setLevel(this.getLevel()+1);

        System.out.println("### LEVEL UP ###");
        System.out.println("Your health has been restored");
        int choice = GameLogic.choice("Choose an uprade\n1) +5 Attack Damage\n+2) 15 Max Health",2);
        switch (choice){
            case 1:
                this.setAttackDamage(this.getAttackDamage()+5);
            case 2:
                this.setMaxHealth(this.getMaxHealth()+15);
                this.setCurHealth(this.getMaxHealth());
        }
    }
    public void gainXp(Enemy e){
        if(!e.getStatus()){
            this.setXp(e.getLevel());
            if (this.maxXp <= this.xp) this.levelUp();

        }
    }
}
