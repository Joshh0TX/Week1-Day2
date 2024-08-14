package org.example.week1.day2;

public class PerimeterSurfaceAreaAndVolumeOfACuboid {
    public static void main(String[] args) {
        // Variable Declaration
        double length, breadth, height;
        double perimeter, surfaceArea, volume;

        // Variable initialization
        length = 12.0;
        breadth = 6.0;
        height = 4.0;

        perimeter = 4 * (length + breadth + height) ; //Formula for the perimeter of a cuboid is 4(L + B + H)

        /*
        Formula for Surface Area of A Cuboid is
        2(LB + LH + BH)*/
        surfaceArea = 2 * ((length * breadth) + (length * height) + (breadth * height));

        //Formula for volume of a Cuboid is length * breadth * height
        volume = length * breadth * height;

        //Display Output
        System.out.println("The perimeter a cuboid with length " + length + " , breadth " + breadth
        + " ,height" + height + " is: " + perimeter);

        System.out.println("The surface area of a cuboid with length " + length + " , breadth " + breadth
                + " , height " + height + " is: " + surfaceArea);

        System.out.println("The volume of a cuboid with length " + length + " , breadth " + breadth
                + " , height " + height + " is: " + volume);




    }
}
