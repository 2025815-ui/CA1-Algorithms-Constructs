/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodstoragesystem;
import java.util.ArrayDeque;
import java.util.Deque;
/**
 *
 * @author yarzarmin
 */
public class Storage {
    private Deque<FoodItem> storage;
    private int capacity = 8;
    
    public Storage(){
    storage = new ArrayDeque<>();
}
    
}
