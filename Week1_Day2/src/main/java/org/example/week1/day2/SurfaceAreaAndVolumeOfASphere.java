package org.example.week1.day2;

public class SurfaceAreaAndVolumeOfASphere {
    public static void main(String[] args) {
        //Calculating the Surface Area and Volume of A Sphere

        //Declaring and initializing variables
        final double PI = 22/7;
        double radius = 15.5;

        //Formula for calculating Surface Area
        double surfaceArea = 4 * PI * radius * radius;

        //Formula for calculating Volume
        double volume =  (4/3) * PI * radius * radius * radius;

        //Output
        System.out.println("The surface area of a Sphere of radius " + radius + " cm "  + " is " + surfaceArea + " cm^3");
        System.out.println("The volume of a Sphere of radius " + radius + " cm "  + "is " + volume + " cm^3");
    }
}
