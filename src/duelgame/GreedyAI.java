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
    // SCORE IS DELTA OF HEALTH (selfHealth - enemyHealth)
    
    
    // Compute all possible game states from specific move
    private ArrayList<GameState> getNextState(int move, GameState currentState){
        ArrayList<GameState> gameStates = new ArrayList<>();
        for (int enemyMove = 0; enemyMove < 4; enemyMove++) {
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
    
    // Calculate scores for all possible game state
    private ArrayList<Integer> calScores(ArrayList<GameState> gameStates) {
        ArrayList<Integer> scores = new ArrayList<>();
        for (GameState element: gameStates) {
            scores.add(element.calculateStateScore());
        }
        return scores;
    }
        
    private int getMaxScore(ArrayList<Integer> scores){
        int max = 0;
        for (Integer element: scores) {
            max = max > element? max:element;
        }
        return max;
    }
    
    // Variable @level changes the difficulty through the number of look ahead
    // TO DO: Recursively getBestMove until max level is reached 
    //        and add score to path score
    private int getBestMove(int level,GameState currentState){
        int maxScore = 0; int bestMove = 0;
        for (int move = 0; move < 4; move++) {
            ArrayList<GameState> gameStates = getNextState(move,currentState);
            int moveScore = getMaxScore(calScores(gameStates));
            if (moveScore > maxScore) {
                maxScore = moveScore;
                bestMove = move;
            }
        }
        return bestMove;
    };
    
    // WRAPPER FUNCTION
    public int getBestMove(){
        return getBestMove(0,startingState);
    }
    int[] startSelf;
    int[] startEnemy;
    public void setStartState(int[] self,int[] enemy){
        startSelf = self;
        startEnemy = enemy;
    }
    
    // GIVE DETAIL DEFINITION FOR ALL POSSIBLE STATE
    private GameState startingState = new GameState(startSelf,startEnemy);
    // GIVE SCORE TO EACH STATE
}
