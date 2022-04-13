package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius: ");
                Double radius = input.nextDouble();
                if(radius<0){
                    System.out.println("You have entered negative value ");
                }
                else {
                    System.out.println("The area of a circle of radius: " + radius + " is: " + Circle.getArea(radius));
                }

    }

}
