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
        Storage storage = new Storage();
        
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
            input.nextLine();
            
            switch(choice){
                case 1:
                    System.out.println("Enter Food Name : ");
                    String name = input.nextLine();
                    
                    System.out.println("Enter Food Weight in gram : ");
                    double weight = input.nextDouble();
                    
                    System.out.println("Enter Best Before Date YYYY-MM-DD : ");
                    String date = input.next();
                    
                    
                    storage.addFood(new FoodItem(name,weight,bestbeforedate));
                    
                    break;
                    
                case 2:
                    storage.removeFromFront();
                    break;
                
                case 3:
                    storage.removeFromRear();;
                    break;
                    
                case 4:
                    storage.peek();
                    break;
                    
                case 5:
                    storage.displayAll();
                    break;
                    
                case 6:
                    System.out.println("Exiting Program....");
                    input.close();
                    break;
                    
                default:
                    System.out.println("Invalid Option!!! Please Choose from the list.");
                    break;
                        
            }
           
            
            
            
        }
    }
}
