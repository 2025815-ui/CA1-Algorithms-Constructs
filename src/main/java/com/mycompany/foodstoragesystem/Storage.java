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
    private Deque<FoodItem> storage; //Declare private deque variable
    private int capacity = 8; //Make max capacity to 8
    
    public Storage(){
    storage = new ArrayDeque<>();
}
    //Adding food from the front in storage
    public void addFood(FoodItem item){
        //Checking if the storage is full or not
        if(storage.size() == capacity){
            System.out.println("Storage is full !!!");
            return;
        }
        storage.addFirst(item);//Adding the item into storage
        System.out.println("Food is added successfully!!");
    }
    
    //Removing item from the front (Stack behaviour)
    public void removeFromFront(){
        //Checking if the storage is empty
        if(storage.isEmpty()){
            System.out.println("Storage is Empty!!!");
            return;
        }
        System.out.println("Item is removed. " + storage.removeFirst());
    }
    
    //Removing item from Rear (Queue Behaviour)
    public void removeFromRear(){
        //Checking if the storage is empty
        if(storage.isEmpty()){
            System.out.println("Storage is Empty!!!");
            return;
        }
        System.out.println("Item is removed. " + storage.removeLast());
    }
    
    //Checking peek item in the storage
    public void peek(){
        //Checking if the storage is empty
        if(storage.isEmpty()){
            System.out.println("Storage is Empty!!!");
            return;
        }
        System.out.println("The Top item is: " + storage.peek());
    }
    
    //Display all item in the storage
    public void displayAll(){
        //Checkgin if the storage is empty
        if(storage.isEmpty()){
            System.out.println("Storage is Empty!!!");
            return;
        }
        System.out.println("\nCurrent Storage are: ");
        for(FoodItem item : storage){
            System.out.println(item);
        }
    }
}
