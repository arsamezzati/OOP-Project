package Spells;

import Characters.CharacterStats;

public class Spell {
    private int damage;
    private int duration;
    private String name;
    private CharacterStats target;
    private int heal;
    private int coolDown;
    // Getter/Setter for Damage
    public int getDamage(){
        return this.damage;
    }
    public void setDamage(int value){
        this.damage = value;
    }
    // Getter/Setter for Heal
    public int getHeal(){
        return this.heal;
    }
    public void setHeal(int value){
        this.heal = value;
    }
    // Getter/Setter for name;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    // Getter/Setter for Duraiton
    public int getDuration(){
        return this.duration;
    }
    public void setDuration(int rounds){
        this.duration = rounds;
    }
    // Getter/Setter for Cool Down
    public int getCoolDown(){
        return this.coolDown;
    }
    public void setCoolDown(int cd){
        this.coolDown = cd;
    }
    // Setter/Getter for target;
    public CharacterStats getTarget(){
        return this.target;
    }
    public void setTarget(CharacterStats target){
        this.target = target;
    }



}
