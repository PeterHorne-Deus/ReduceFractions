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
        //User input variables
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the numerator of the fraction"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the denomiator of the fraction"));
        
        //Ensuring the fraction exsists
        if(num2 == 0){
            System.out.println("Not A Fraction");
        }
        
        //Calculating the reduced fraction
        else{
            //Calculating a reduced fraction 
            System.out.println("The reduced fraction is: " + num1/reduce(num1,num2) + "/" + num2/reduce(num1,num2));
               
            
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
            //Running through the GCD calculations 
            return reduce(n2 , n1%n2);
            
           
        }
            
        }
    
    
}
