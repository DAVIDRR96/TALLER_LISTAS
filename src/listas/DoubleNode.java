/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author samaniw
 */
public class DoubleNode {
    private int data;
    private DoubleNode nextNode;
    private DoubleNode previosNode;
    
    public DoubleNode(int d){
        this.data = d;
        this.nextNode = null;
        this.previosNode = null;
    }
    
    public DoubleNode(DoubleNode previosNode, int data, DoubleNode nextNode) {
        this.data = data;
        this.nextNode = nextNode;
        this.previosNode = previosNode;
    }

    
    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }

    /**
     * @return the nextNode
     */
    public DoubleNode getNextNode() {
        return nextNode;
    }

    /**
     * @param nextNode the nextNode to set
     */
    public void setNextNode(DoubleNode nextNode) {
        this.nextNode = nextNode;
    }

    /**
     * @return the previosNode
     */
    public DoubleNode getPreviosNode() {
        return previosNode;
    }

    /**
     * @param previosNode the previosNode to set
     */
    public void setPreviosNode(DoubleNode previosNode) {
        this.previosNode = previosNode;
    }
    
}
