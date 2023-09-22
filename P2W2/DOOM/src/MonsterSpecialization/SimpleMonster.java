package MonsterSpecialization;

import Entities.Monster;
import Entities.Player;

/**
 * Vincent Verboven
 * 22/11/2022
 */
public class SimpleMonster extends Monster {

    public SimpleMonster(Player player, int x, int y){
        super(player, x , y);
    }

    @Override
    public void attackPlayer() {
        super.attackPlayer();
    }
}
