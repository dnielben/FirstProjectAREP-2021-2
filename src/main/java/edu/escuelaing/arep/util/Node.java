/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arep.util;

/**
 *
 * @author dnielben
 */
class Node<T> {
    
    private T val = null;
    private Node next = null;
    
    public Node(T val){
        this.val = val;
    }
    
    public void setNext(Node n){
        next = n;
    }
    
}
