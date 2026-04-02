/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.foodstoragesystem;
import java.util.Scanner;
/**
 *
 * @author yarzarmin
 */
public class FoodStorageSystem {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while(true){
            System.out.println("\n=======MENU=======");
            System.out.println("1. Add Food - Burger,Pizza,Fries,Sandwich and Hotdog.");
            System.out.println("2. Remove Food from Front");
            System.out.println("3. Remove Food from Rear");
            System.out.println("4. Peek Top Item in storage");
            System.out.println("5. Display all items in storage");
            System.out.println("6. Exit the program");
            
            System.out.println("Enter Your Operation: ");
            int choice = input.nextInt();
            
            
            
        }
    }
}
