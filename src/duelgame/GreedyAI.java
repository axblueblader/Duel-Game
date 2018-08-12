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
    private ArrayList<GameState> getNextStates(int move, GameState currentState) {
        ArrayList<GameState> gameStates = new ArrayList<>();
        ArrayList<Integer> moveSet = makeEnemyMoveSet(currentState);
        for (int enemyMove: moveSet){
            int selfHealth = currentState.getSelfHealth() - Player.DAMAGE_TAKEN[move][enemyMove];
            int enemyHealth = currentState.getEnemyHealth() - Player.DAMAGE_TAKEN[enemyMove][move];
            int selfMana = currentState.getSelfMana() + Player.MANA_CHANGE[move][enemyMove];
            int enemyMana = currentState.getEnemyMana() + Player.MANA_CHANGE[enemyMove][move];
            int selfShield = Player.SHIELD_VALUE[move][currentState.getSelfShield()];
            int enemyShield = Player.SHIELD_VALUE[enemyMove][currentState.getEnemyShield()];
            int newSelf[] = {selfHealth, selfMana, selfShield};
            int newEnemy[] = {enemyHealth, enemyMana, enemyShield};
            GameState newState = new GameState(newSelf, newEnemy);
            gameStates.add(newState);
        }
        return gameStates;
    }

    ;
    
    // Calculate scores for all possible game state
    private ArrayList<Integer> calScores(ArrayList<GameState> gameStates) {
        ArrayList<Integer> scores = new ArrayList<>();
        for (GameState element : gameStates) {
            scores.add(element.calculateStateScore());
        }
        return scores;
    }

    private int getMinScore(ArrayList<Integer> scores) {
        int min = scores.get(0);
        for (Integer element : scores) {
            min = min < element ? min : element;
        }
        return min;
    }

    // Variable @level changes the difficulty through the number of look ahead
    // TO DO: Recursively getBestMove until max level is reached 
    //        and add score to path score
    private int getBestMove(int level, GameState currentState) {
        int maxScore = 0;
        int bestMove = 0;
        for (int move = 0; move < 4; move++) {
            ArrayList<GameState> gameStates = getNextStates(move, currentState);
            int moveScore = getMinScore(calScores(gameStates));
            if (moveScore > maxScore) {
                maxScore = moveScore;
                bestMove = move;
            }
        }
        return bestMove;
    }

    // WRAPPER FUNCTION
    public int getBestMove() {
        return getBestMove(0, currentState);
    }
    /*
        4 move, each move can result in max 4 state.
        def getBestScore(int level, GameState curState)
            for 0->3:
                gameStates = getNextStates(move,curState);
                if (level == maxLevel) {
                moveScore = getMinScore(calScores(gameStates);
                maxScore = maxScore>moveScore? maxScore:moveScore;
    } 
                else{
                foreach state:
                    nextScores.append(getBestScore(level+1,state));
                moveScore = getMinScore(nextScores);
                maxScore = maxScore>moveScore? maxScore:moveScore;
    }       
        return maxScore;
     */

    
    public int maxLevel = 2;
    public int lowestScoreDependOnLevel = maxLevel * (-3);
    
    //TO DO: Apply Shield and Blast Constraints
    public int getBestScore(int level, GameState currentState) {
        int maxScore = lowestScoreDependOnLevel;
        //make moveSet
        ArrayList<Integer> moveSet = makeSelfMoveSet(currentState);
        
        //foreach available move
        for (int move: moveSet){
            ArrayList<GameState> gameStates = getNextStates(move, currentState);
            if (level == maxLevel) {
                int moveScore = getMinScore(calScores(gameStates));
                maxScore = maxScore > moveScore ? maxScore : moveScore;
            }
            else{
                ArrayList<Integer> nextScores = new ArrayList<>();
                for(GameState stateElement: gameStates){
                    nextScores.add(getBestScore(level+1,stateElement));
                }
                int moveScore = getMinScore(nextScores);
                if (maxScore < moveScore){
                    maxScore = moveScore;
                    bestMove = move;
                }
            }
        }
        
        return maxScore;
    }
    
    public ArrayList<Integer> makeSelfMoveSet(GameState currentState){
        ArrayList<Integer> moveSet = new ArrayList<>();
        moveSet.add(0);
        
        if (currentState.getSelfShield() < Player.MAX_SHIELD) {
            moveSet.add(1);
        }
        
        moveSet.add(2);
        
        if (currentState.getSelfMana() >= Player.BLAST_MANA) {
            moveSet.add(3);
        }
        return moveSet;
    }
    
    public ArrayList<Integer> makeEnemyMoveSet(GameState currentState){
        ArrayList<Integer> moveSet = new ArrayList<>();
        moveSet.add(0);
        
        if (currentState.getEnemyShield() < Player.MAX_SHIELD) {
            moveSet.add(1);
        }
        
        moveSet.add(2);
        
        if (currentState.getEnemyMana() >= Player.BLAST_MANA) {
            moveSet.add(3);
        }
        return moveSet;
    }
    
    
    
    public int bestMove = 0;
    // WRAPPER FUNCTION
    public int getBestMove(int maxLevel){
        this.maxLevel = maxLevel;
        int bestScore = getBestScore(1,currentState);
        return bestMove;
    }
    
    private GameState currentState;

    public void makeCurrentState(int[] selfProperties, int[] enemyProperties) {
        currentState = new GameState(selfProperties, enemyProperties);
    }
}
