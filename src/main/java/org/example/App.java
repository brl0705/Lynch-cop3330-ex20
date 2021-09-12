package org.example;


import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        Scanner input1 = new Scanner (System.in);
        System.out.println("What is the order amount?");
        int order = input1.nextInt();

        Scanner input2 = new Scanner (System.in);
        System.out.println("What state do you live in?");
        String state = input2.nextLine();

        Scanner input3 = new Scanner (System.in);
        System.out.println("What county in " + state + "?");
        String county = input3.nextLine();

        if(state.equals("Florida")){
            if(county.equals("Seminole")){
                double tax = order * 0.07;
                double total = tax + order;
                System.out.println("The sales tax in " + county + " county " + state +" is 7%. Your order total is $" + total);

            }
            else{
                double tax = order * 0.08;
                double total = tax + order;
                System.out.println("The sales tax in " + county + " county " + state +" is 8%. Your order total is $" + total);

            }



        }
        else{
            double tax = order * 0.55;
            double total = tax + order;
            System.out.println("The sales tax in " + county + " county " + state +" is 5.5%. Your order total is $" + total);

        }
    }
}
