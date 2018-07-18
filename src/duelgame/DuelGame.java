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
    private String winner;
    public DuelGame(){
        human = new Player();
        bot = new Player();
    }
    public boolean isPlayerReady(){
        return human.getActionIndex() != 4;
    }
    public void runGameLogic() {
        // COMPUTE AI DECISION HERE
        Random r = new Random();
        if (bot.canShield())
        bot.setActionIndex(r.nextInt(2));
        else bot.setActionIndex(0);
        //--------------------
        human.updateChanges(bot.getActionIndex());
        bot.updateChanges(human.getActionIndex());
        human.updateProperties();
        bot.updateProperties();
    }
    
    public boolean isFinished(){
        if (human.getHealth() == 0 && bot.getHealth() == 0) {winner ="The game was draw"; return true;};
        if(human.getHealth() == 0) {winner = "Bot won the game"; return true;};
        if(bot.getHealth() == 0) {winner = "Human won the game"; return true;};
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
        if (player == 0) {
            return human.getActionIndex();
        }
        else return bot.getActionIndex();
    }
    public int[] getPlayerProperties(int player) {
        if (player == 0) {
            return human.getProperties();
        }
        else return bot.getProperties();
    }
    public int[] getPlayerChanges(int player) {
        if (player == 0) {
            return human.getChanges();
        }
        else return bot.getChanges();
    }
}
