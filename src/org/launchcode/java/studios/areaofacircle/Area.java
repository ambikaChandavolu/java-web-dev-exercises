package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Radius: ");
                Double radius = input.nextDouble();
        System.out.println("The area of a circle of radius: " +radius + " is: " +Circle.getArea(radius));

        //The area of a circle of radius 2.5 is: 19.625
    }

}
