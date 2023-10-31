package Events;
import Characters.Enemy;
import Characters.Player;
import Game.GameLogic;

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

        while(this.player.getStatus() && this.enemy.getStatus()){
            this.player.getInfo();
            this.enemy.getInfo();

            int choice = GameLogic.choice("Choose your next move\n1) Attack\n2) Runaway",2);
            if (choice == 1){
                this.enemy.setCurHealth(this.enemy.getCurHealth()-this.player.getAttackDamage());
                this.player.setCurHealth(this.player.getCurHealth()-this.enemy.getAttackDamage());
                this.player.checkStatus();
                this.enemy.checkStatus();
            }

        }
        if (!this.enemy.getStatus()){
            this.player.gainXp(this.enemy);
        }
    }

}
