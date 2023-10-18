import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Arrays;
public class EnemyArrayList {
    public static void main(String[] args) {
        ArrayList<String> enemyBoosList = new ArrayList<>(Arrays.asList("b1", "b2", "b3", "b4"));
        ArrayList<String> sideEnemyList = new ArrayList<>(Arrays.asList("s1", "s2", "s3", "s4"));
        for(int i = 0; i < enemyBoosList.size(); i++){
            System.out.println(enemyBoosList.get(i));
        }
        for(int j = 0; j < sideEnemyList.size(); j++){
            System.out.println(sideEnemyList.get(j));
        }
    }
}
