/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duelgame;


/**
 *
 * @author Blu
 */
public class GreedyAI {
    // TRY TO GET BEST CURRENT CHOICE USING GREEDY
    // CHECK ALL POSSIBLE PATHS, CHOOSE HIGHEST SCORE
    
    
    public void getNextState(int move){
        // WRAPPER FUNCTION
    }
    
    private void getNextState(int move, GameState currentState){
        // COMPUTE ALL POSSIBLE STATE AND GIVE THEM SCORES
        
        
        // 
    };
    
    private class GameState {
        private int selfHealth;
        private int selfMana;
        private int selfShield;
        private int enemyHealth;
        private int enemyMana;
        private int enemyShield;
        private int stateScore;
        
        public GameState(int[] self,int[] enemy){
            selfHealth = self[0];
            selfMana = self[1];
            selfShield = self[2];
            enemyHealth = enemy[0];
            enemyMana = enemy[1];
            enemyShield = enemy[2];
            stateScore = 0;
        }
    }
    int[] startVals = {Player.MAX_HEALTH,0,0};
    // GIVE DETAIL DEFINITION FOR ALL POSSIBLE STATE
    private GameState startingState = new GameState(startVals,startVals);
    // GIVE SCORE TO EACH STATE
}
