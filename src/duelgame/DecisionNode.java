/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duelgame;

import java.util.ArrayList;
import java.util.Random;


/**
 *
 * @author Blu
 */
public class DecisionNode {
    private int weight;
    private final int decision;
    //private Map<String,int> attributes;
    private DecisionNode parent;
    private ArrayList<DecisionNode> children;
    
    public DecisionNode(int decision){
        weight = 1;
        this.decision = decision;
    };
    
    public int getWeight(){
        return weight;
    };
    
    public void increaseWeight(){
        weight++;
    };
    
    public int getDecision(){
        return decision;
    };
    
    public DecisionNode getParent(){
        return parent;  
    };
    
    public DecisionNode addChild(int decision){
        DecisionNode childNode = new DecisionNode(decision);
        childNode.parent = this;
        if (children == null) {
            children = new ArrayList<>();
        }
        this.children.add(childNode);
        return childNode;
    };
    
    public int getSumWeightChildren(){
        int sum = 0;
        for (DecisionNode element : children) {
            sum += element.getWeight();
        }
        return sum;
    };
    
    // TODO: Implement proper weightedd random chooser
    public int computeChoice(){
        Random r = new Random();
        return 1;
    };
}

