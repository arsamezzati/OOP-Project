package Game;
import Characters.Enemy;
import Characters.Player;

public class Fight {
    public Fight(Player p,Enemy e){
        this.enemy = e;
        this.player = p;

    }
    private Enemy enemy;
    private Player player;
    public void explore(){

    }

    public void startFight() {
        while(this.player.getStatus()){
            this.player.getInfo();
            this.enemy.getInfo();
            int choice = GameLogic.choice("Choose your next move\n1) Explore\n2) Quit",2);
            switch(choice){
                case(1):
                    this.enemy.setCurHealth(this.enemy.getCurHealth()-this.player.getAttackDamage());
                    this.player.setCurHealth(this.player.getCurHealth()-this.enemy.getAttackDamage());
                    break;
                case(2):
                    this.player.setStatus(false);
                    System.out.println(" no pussy ");
                    break;
            }

        }
    }

}
