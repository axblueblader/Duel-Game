/**
 * Class for storing Player data
 * update   damageTaken,shieldCount;
 * show     "-" + damageTaken
 * update   health,mana;
 * show     health,mana,shieldCount;
 */

package duelgame;

/**
 *
 * @author Blu
 */
public class Player {
    private static final int[][] DAMAGE_RESULT = { 
            //  result is damage taken by this player
            { 1, 0, 0, 3 }, // SLASH vs sl,sh,ch,bl
            { 0, 0, 0, 3 }, // SHIELD vs sl,sh,ch,bl
            { 2, 0, 0, 3 }, // CHANNEL vs sl,sh,ch,bl
            { 0, 0, 0, 3 }  // BLAST vs sl,sh,ch,bl
    };
    public static final int MAX_SHIELD = 2; // SHIELD limit before reset
    public static final int MAX_MANA = 2; // MANA required to BLAST
    public static final int MAX_HEALTH = 10;
//  private String name;
    private int health;
    private int mana;
    private int manaChanges;
    private int shieldCount;
    private int shieldChanges;
    private int damageTaken;
    private int actionIndex;

    public Player() {
 //     name = playerName;
        health = MAX_HEALTH;
        mana = 0;
        shieldCount = 0;
        damageTaken = 0;
        actionIndex = 4;
    }

    public boolean canShield(){
        return shieldCount != MAX_SHIELD;
    }
    public boolean canChannel(){
        return mana < MAX_MANA;
    }
    public boolean canBlast(){
        return mana >= MAX_MANA;
    }
    public void updateChanges(int enemyActionIdx) {
        if (canShield() == false) 
            shieldCount = 0;
        shieldChanges = 0;
        manaChanges = 0;
        damageTaken = DAMAGE_RESULT[actionIndex][enemyActionIdx];
        switch (actionIndex) {
            case 1:
                shieldChanges += 1;
                break;
            case 2:
                manaChanges += 1;
                break;
            case 3:
                manaChanges = -mana;
                break; 
            default:
                break;
        }
        if (actionIndex == 1 && enemyActionIdx == 0) {
            manaChanges +=1;
        }
    }
    
    public void updateProperties() {
        health = health - damageTaken;
        mana = mana + manaChanges;
        shieldCount = shieldCount + shieldChanges;
    }

    public int[] getProperties() {
        int[] propertiesArr = { health, mana, shieldCount };
        return propertiesArr;
    }

    public int[] getChanges() {
        int[] changesArr = {damageTaken, manaChanges, shieldChanges};
        return changesArr;
    }
    public int getHealth() {
        return health;
    }
    
    public int checkActionIndex(){
        if (actionIndex == 1 && !canShield()) return 1;
        if (actionIndex == 2 && !canChannel()) return 2;
        if (actionIndex == 3 && !canBlast()) return 3; 
        if (actionIndex == 4) return 4;
        return 0;
    }
    
    public void setActionIndex(int actionIdx) {
            actionIndex = actionIdx;
    }
    public int getActionIndex(){        
        return actionIndex;
    }
}