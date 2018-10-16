package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static String userItem;
    static double userPrice;
    static int userQuantity;
    static double totalCost;
    static String userAns ="y";
    static double amount = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<groceryClass> gc = new ArrayList<>();



        int i =0;
        while(!userAns .equalsIgnoreCase("n")){

            System.out.println("Enter the item:");
            userItem = sc.next();

            System.out.println("Enter the price for the item");
            userPrice = sc.nextDouble();

            System.out.println("Enter the quantity");
            userQuantity = sc.nextInt();

            gc.add(new groceryClass(userItem,userPrice,userQuantity));
//            System.out.println("would like to enter another item-yes(y) or no(n)?");
//            userAns = sc.next();
//            if(userAns .equalsIgnoreCase("n")){
//                System.out.println("Done");
//                break;
//            }


            i++;

            System.out.println("Enter n to quit. Type any keyboard key to continue");
            userAns = sc.next();
        }



        System.out.println("item"+"\t"+ "price" +"\t"+"quantity"+ "\t"+"cost"+"\t");

        for(groceryClass temp : gc){
            System.out.println(temp.getItemName()+"\t"+ temp.getPrice()+"\t"+temp.getQuantity()+"\t"+"\t"+ temp.cost());
            amount = amount + temp.cost();

    }

        System.out.println("Total Purchase Amount = $"+ amount);
        System.out.println("total number of purchase" + i);



    }
}
