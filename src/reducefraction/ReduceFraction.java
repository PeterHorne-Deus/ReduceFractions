/*
 * Peter Horne-Deus
 * This program reduces and inputed fraction
 * ReduceFraction.java
 * March 24, 2020
 */

package reducefraction;

import javax.swing.*;
/**
 *
 * @author Peter
 */
public class ReduceFraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("WARNING: Please ensure factor is reducable or an inaccurate answer will be produced");
        //User input variables
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the numerator of the fraction"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the denomiator of the fraction"));
        
        //Ensuring the fraction exsists
        if(num2 == 0){
            System.out.println("Not A Fraction");
        }
        //Calculating the reduced fraction
        else{
            //Calculating a less than zero reduced fraction (only works for fractions that do reduce)
            if(num1/num2 < 1){
                System.out.println("The reduced fraction is: " + num1/reduce(num1,num2) + "/" + reduce(num1,num2));
            }
            //Calculating redcuded greater than one fractions
            else{
                System.out.println("The reduced fraction is: " + reduce(num1,num2));
            }
        }
            
    }
    
    /**
     * This method calculates the reduced number for the fraction
     * @param n1
     * @param n2
     * @return 
     */
    static public int reduce(int n1, int n2){
        
        //Checking to make sure modulas divison will work
        if(n2 == 0){
            return n1;
        }
        else{
           //If the number can be whole divided then it is 
           if(n1%n2 == 0){
               return n1/n2;
           }
           //Running through the GCD calculations 
           else{
               return reduce(n2 , n1%n2);
           }
           
        }
            
        }
    
    
}
