package com.mycompany.myproject;

import org.apache.commons.math3.geometry.euclidean.twod.Vector2D; // Import Vector2D

public class AppTest
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        // Use Apache Commons Math
        Vector2D vec1 = new Vector2D(1.0, 2.0);
        Vector2D vec2 = new Vector2D(3.0, 4.0);
        Vector2D sum = vec1.add(vec2);

        System.out.println("Vector 1: " + vec1);
        System.out.println("Vector 2: " + vec2);
        System.out.println("Sum: " + sum);
    }
}