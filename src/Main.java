import Characters.Player;
public class Main {
    public static void main(String[] args) {
        Player p1 = new Player("Hila",100,50);
        System.out.println(p1.getName());
        System.out.println(p1.getAttackDamage());
        System.out.println(p1.getMaxHealth());
        System.out.println(p1.getCurHealth());
    }
}