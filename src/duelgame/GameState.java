/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duelgame;

/**
 *
 * @author Mikami
 */
public class GameState {

    private int selfHealth;
    private int selfMana;
    private int selfShield;
    private int enemyHealth;
    private int enemyMana;
    private int enemyShield;
    private int stateScore;

    public GameState(int[] self, int[] enemy) {
        selfHealth = self[0];
        selfMana = self[1];
        selfShield = self[2];
        enemyHealth = enemy[0];
        enemyMana = enemy[1];
        enemyShield = enemy[2];
        stateScore = 0;
    }

    public int getSelfHealth() {
        return selfHealth;
    }

    public int getEnemyHealth() {
        return enemyHealth;
    }

    public int getSelfMana() {
        return selfMana;
    }

    public int getEnemyMana() {
        return enemyMana;
    }

    public int getSelfShield() {
        return selfShield;
    }

    public int getEnemyShield() {
        return enemyShield;
    }

    public int calculateStateScore() {
        stateScore = selfHealth - enemyHealth;
        return stateScore;
    }
}
