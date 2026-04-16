/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.foodstoragesystem;

//import java package for the date and time
import java.time.LocalDateTime;
import java.time.LocalDate;
/**
 *
 * @author yarzarmin
 */
public class FoodItem {
    //declare private variables
    private String name;
    private double weight;
    private LocalDate bestbeforedate;
    private LocalDateTime storedtime;
    
    //creating constructor for the object to initialize
    public FoodItem(String name,double weight,LocalDate bestbeforedate ){
        this.name = name; //assign name
        this.weight = weight; //assign weight
        this.bestbeforedate = bestbeforedate; //assign bestbeforedate
        this.storedtime = LocalDateTime.now();//assign the storage time to automtically set the current date and time
    }
    
    //using get method to access the private variable
    public String getName(){
        return name;
}
    
    //this will automatically call when printing the object
    public String toString(){
        return "\nName: " + name +
                "\nWeight: " + weight + "g" +
                "\nBest Before Date: " + bestbeforedate +
                "\nStore At: "+ storedtime;
    }
    
}
