import Characters.Enemy;

public class Main {
    public static void main(String[] args) {
        //Game.startGame();
        Dungeon dungeon = new Dungeon(0);
        Enemy e1 = new Enemy("Ramtin",20,10);
        Enemy e2 = new Enemy("Nadia",1,100);
        dungeon.addEnemy(e1);
        dungeon.addEnemy(e2);
        System.out.println(dungeon.getNextEnemyList().getName());
    }
}
