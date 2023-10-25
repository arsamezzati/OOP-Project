package Characters.Enemies;
import java.util.Random;
import Characters.Enemy;

public class Boss {
    //list of bosses
    private static final String[] boss = {"Blood Queen","Lord Darkar","Ice king","Vecna"};

    public static Object randomBoss(){
        Random random = new Random();
        int randonNum = random.nextInt(boss.length);
        String randomMember = boss[randonNum];



        return 0;
    }
}
