package Characters;

public class CharacterStats {
    private int maxHealth;
    // status of the character ( dead = False, alive = True )
    private boolean status;
    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean isAlive){
        this.status = isAlive;
    }
    public int getMaxHealth(){
        return this.maxHealth;
    }
    public void setMaxHealth(int amount){
        this.maxHealth = amount;
    }
    private int curHealth;
    public int getCurHealth(){
        return this.curHealth;
    }
    public void setCurHealth(int amount){
        this.curHealth = amount;
    }
    private int AttackDamage;
    public int getAttackDamage(){
        return this.AttackDamage;
    }
    public void setAttackDamage(int amount){
        this.AttackDamage = amount;
    }
    private String name;
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
}
