/**
 * Java program to demonstrate Math.ceil() and Math.floor() method.
 */

package com.mymath;

/**
 * Main class.
 */
public class Main {

    // Method to find hypotenuse of triangle
    public static double findHypotenuse (int a, int b) {

        // Hypotenuse
        double c = Math.sqrt(a * a + b * b);

        return c;
    }

    // Method main to run java program.
    public static void main(String[] args) {

        // Calling method findHypotenuse() for triangle with a = 3, b = 4 and printing result to console
        System.out.println(findHypotenuse(3, 4));

        // Calling method findHypotenuse() for triangle with a = 5, b = 6 and printing result to console
        System.out.println(findHypotenuse(5, 6));

        // Calling method findHypotenuse() for triangle with a = 7, b = 9 and printing result to console
        System.out.println(findHypotenuse(7, 9));

    }
}