package Characters.Enemies;
import java.util.Random;

public class SideEnemy {
    //list of side enemies
    private static final String[] sideEnemy = {"Assassin","DeathClaw","Demogorgon","Goblin","Shadow","HuntingTroll"};

    public static Object randomSide(){
        Random random = new Random();
        int randomNum = random.nextInt(sideEnemy.length);
        String randomMember = sideEnemy[randomNum];




        return 0;
    }
}
