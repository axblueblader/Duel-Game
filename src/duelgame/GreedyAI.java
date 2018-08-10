/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duelgame;

import java.util.ArrayList;


/**
 *
 * @author Blu
 */
public class GreedyAI {
    // TRY TO GET BEST CURRENT CHOICE USING GREEDY
    // CHECK ALL POSSIBLE PATHS, CHOOSE HIGHEST SCORE
    
    private ArrayList<GameState> getNextState(int move, GameState currentState){
        // COMPUTE ALL POSSIBLE STATE AND SCORE WITH DELTA HP
        ArrayList<GameState> gameStates = new ArrayList<>();
        for (int enemyMove = 0; enemyMove < 3; enemyMove++) {
            int selfHealth = currentState.getSelfHealth() - Player.DAMAGE_RESULT[move][enemyMove];
            int enemyHealth = currentState.getEnemyHealth() - Player.DAMAGE_RESULT[enemyMove][move];
            int selfMana = currentState.getSelfMana() + Player.MANA_RESULT[move][enemyMove];
            int enemyMana = currentState.getEnemyMana() + Player.MANA_RESULT[enemyMove][move];
            int selfShield = Player.SHIELD_RESULT[currentState.getSelfShield()][move];
            int enemyShield = Player.SHIELD_RESULT[currentState.getEnemyHealth()][enemyMove];
            int newSelf[] = {selfHealth,selfMana,selfShield};
            int newEnemy[] = {enemyHealth,enemyMana,enemyShield};
            GameState newState = new GameState(newSelf,newEnemy);
            gameStates.add(newState);
        }        
        return gameStates;
    };
    
    private ArrayList<Integer> calScores(ArrayList<GameState> gameStates) {
        ArrayList<Integer> scores = new ArrayList<>();
        for (GameState element: gameStates) {
            scores.add(element.calculateStateScore());
        }
        return scores;
    };
        
    public int getBestMove(int level){
        return 1;
    };
    
    int[] startVals = {Player.MAX_HEALTH,0,0};
    // GIVE DETAIL DEFINITION FOR ALL POSSIBLE STATE
    private GameState startingState = new GameState(startVals,startVals);
    // GIVE SCORE TO EACH STATE
}
