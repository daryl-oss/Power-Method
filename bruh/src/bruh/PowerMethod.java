/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bruh;

import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class PowerMethod {

    /**
     * @param args the command line arguments
     */   
       public static void main(String[] args) {
        int choice;
        do {
            String[] options = {
                "Calculate Power", 
                "Sum of Array", 
                "Average of Array", 
                "Maximum of Array", 
                "Minimum of Array"
            };
            choice = JOptionPane.showOptionDialog(null, "Choose an operation:", 
                "Operations", JOptionPane.DEFAULT_OPTION, 
                JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case 0: // Calculate Power
                    calculatePower();
                    break;
                case 1: // Sum of Array
                    computeArraySum();
                    break;
                case 2: // Average of Array
                    computeArrayAverage();
                    break;
                case 3: // Maximum of Array
                    findMaxInArray();
                    break;
                case 4: // Minimum of Array
                    findMinInArray();
                    break;
                default:
                    break;
            }
        } while (choice >= 0);
    }

    public static void calculatePower() {
        int base = Integer.parseInt(JOptionPane.showInputDialog("Enter the base number:"));
        int exponent = Integer.parseInt(JOptionPane.showInputDialog("Enter the exponent:"));
        long result = power(base, exponent);
        JOptionPane.showMessageDialog(null, base + " to the power of " + exponent + " is " + result);
    }

    public static long power(int base, int exponent) {
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }
        return result;
    }

    public static void computeArraySum() {
        int[] array = getArrayFromUser();
        int sum = computeSum(array);
        JOptionPane.showMessageDialog(null, "The sum of the array is " + sum);
    }

    public static int computeSum(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static void computeArrayAverage() {
        int[] array = getArrayFromUser();
        double average = computeAverage(array);
        JOptionPane.showMessageDialog(null, "The average of the array is " + average);
    }

    public static double computeAverage(int[] array) {
        return (double) computeSum(array) / array.length;
    }

    public static void findMaxInArray() {
        int[] array = getArrayFromUser();
        int max = findMax(array);
        JOptionPane.showMessageDialog(null, "The highest value is: " + max);
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static void findMinInArray() {
        int[] array = getArrayFromUser();
        int min = findMin(array);
        JOptionPane.showMessageDialog(null, "The lowest value is: " + min);
    }

    public static int findMin(int[] array) {
        int min = array[0];
        for (int value : array) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    public static int[] getArrayFromUser() {
        String input = JOptionPane.showInputDialog("Enter the number of elements in the array:");
        int size = Integer.parseInt(input);
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            input = JOptionPane.showInputDialog("Enter element " + (i + 1) + ":");
            array[i] = Integer.parseInt(input);
        }
        return array;
    }
}