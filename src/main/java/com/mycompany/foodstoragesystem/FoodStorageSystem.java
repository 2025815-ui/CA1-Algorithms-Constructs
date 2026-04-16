/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.foodstoragesystem;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author yarzarmin
 */
public class FoodStorageSystem {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Storage storage = new Storage();

        while (true) {
            System.out.println("\n=======MENU=======");
            System.out.println("1. Add Food - Burger,Pizza,Fries,Sandwich and Hotdog.");
            System.out.println("2. Remove Food from Front");
            System.out.println("3. Remove Food from Rear");
            System.out.println("4. Peek Top Item in storage");
            System.out.println("5. Display all items in storage");
            System.out.println("6. Exit the program");

            System.out.println("Enter Your Operation: ");
            int choice = input.nextInt();
            input.nextLine(); //consume leftover newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Food Name : ");
                    String name = input.nextLine();
                    //checking if the name input is empty
                    if (name.isEmpty()) {
                        System.out.println("Name cannot be empty!");
                        break;
                    }

                    System.out.println("Enter Food Weight in gram : ");
                    double weight = input.nextDouble();
                    //checking if the weight input is correct
                    if (weight <= 0) {
                        System.out.println("Weight cannot be empty!");
                        break;
                    }

                    System.out.println("Enter Best Before Date YYYY-MM-DD : ");
                    String days = input.next();

                    try {

                        LocalDate bestbefore = LocalDate.parse(days);//convert input string to date

                        LocalDate today = LocalDate.now();//get today date

                        //checking the date is today date or not
                        if (bestbefore.isBefore(today)) {
                            System.out.println("Date cannot be in the past");
                            break;
                        }
                        
                        //checking if the date is within two weeks (14 days)
                        if (bestbefore.isAfter(today.plusDays(14))) {
                            System.out.println("Best-Before-Date must be within 2 weeks.");
                            break;
                        }
                        storage.addFood(new FoodItem(name, weight, bestbefore));//add the food into the storage

                    } catch (Exception e) {
                        System.out.println("Invalid date format !! Try YYYY-MM-DD");//handle invalid date format
                    }

                    break;

                case 2:
                    storage.removeFromFront();
                    break;

                case 3:
                    storage.removeFromRear();
                    ;
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
                    return;//exiting the program

                default:
                    System.out.println("Invalid Option!!! Please Choose from the list.");
                    break;

            }
          
        }
       
    }
}
