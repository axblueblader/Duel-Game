/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duelgame;

import java.util.Random;

/**
 *
 * @author Blu
 */
public class DuelGame {

    /**
     * @param args the command line arguments
     */
    private final Player human;
    private final Player bot;
    public static final int HUMAN = 0;
    public static final int BOT = 1;
    private static final int MAX_ROUND = 10;
    private int roundCount;

    private String winner;
    public DuelGame(){
        human = new Player();
        bot = new Player();
        roundCount = 0;
    }
    
    public boolean isPlayerReady(){
        return human.getActionIndex() != 4;
    }
    
    public int getRoundCount() {
        return roundCount;
    }
    public void runGameLogic() {
        // COMPUTE AI DECISION HERE
        Random r = new Random();
        int randomChoice = r.nextInt(100);
        // When shield, chance of SLASH/SHIELD = 66/33
        if (bot.canShield()){
            // Increase percentage of SLASH by bot
            if (randomChoice < 66) bot.setActionIndex(0);
            else bot.setActionIndex(1);
    
        }
        else bot.setActionIndex(0);
        
        // INCREASE ROUND COUNT
        roundCount = roundCount + 1;
        
        // UPDATE CHANGES
        human.updateChanges(bot.getActionIndex());
        bot.updateChanges(human.getActionIndex());
        human.updateProperties();
        bot.updateProperties();
    }
    
    public boolean isFinished(){
        if ((human.getHealth() <= 0 && bot.getHealth() <= 0)
                || (roundCount == MAX_ROUND)) 
        {winner ="The game was draw"; return true;}
        if(human.getHealth() <= 0) 
        {winner = "Bot won the game"; return true;}
        if(bot.getHealth() <= 0) 
        {winner = "Human won the game"; return true;}
        
        return false;
    }
    
    public String getWinner(){
        return winner;
    }
    public boolean shieldEnabled(){
        return human.canShield();
    }
    public boolean channelEnabled(){
        return human.canChannel();
    }
    public boolean blastEnabled(){
        return human.canBlast();
    }
    public void setHumanAction(int humanActionIdx) {
        human.setActionIndex(humanActionIdx);
    }
    public int getActionIdx(int player) {
        if (player == HUMAN) {
            return human.getActionIndex();
        }
        else return bot.getActionIndex();
    }
    public int[] getPlayerProperties(int player) {
        if (player == HUMAN) {
            return human.getProperties();
        }
        else return bot.getProperties();
    }
    public int[] getPlayerChanges(int player) {
        if (player == HUMAN) {
            return human.getChanges();
        }
        else return bot.getChanges();
    }
}
