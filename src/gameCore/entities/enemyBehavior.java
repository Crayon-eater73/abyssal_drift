package gameCore.entities;

//the behavior of the enemy , if the enemy would have a line, it would say their line along with what the enemy's action was
public class enemyBehavior {
    public void attack(ace player) {
        System.out.println("Enemy attacks " + player.getName());
    }

    public void speak(String line) {
        System.out.println("Enemy says: " + line);
    }

    public void taunt(String line) {
        System.out.println("Enemy taunts: " + line);
    }
}


/*public void attack(Ace player)
public void speak(String line)
public void taunt(String line)*/