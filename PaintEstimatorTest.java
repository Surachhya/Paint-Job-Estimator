//*****************************************
  //   Programmer: Surachhya Adhikari
  //   CTP 150 - section: 400
  //   Lab 2
  //   Version 1.0
// package imports
import java.util.Scanner;
import java.text.DecimalFormat;

/**
 * This is Test/Caller class for PaintEstimator.
 * This calculates the total paint cost for two rooms. Room 1 and Room 2.
 * This class be modified for more or less room.
 */
public class PaintEstimatorTest {
    public static void main(String[] args) {
         // declare local variables
         double squareFootage;
         double gallonPrice;
         double gallonNeeded;
         double laborHours;
         double laborCost;
         double paintCost;
         double r1totalCost;
         double r2totalCost;
         
         //--------------Room 1 --------------
        // label for Room 1
        System.out.println("Room 1:");
        squareFootage = getUserInput("Enter the square footage to be painted: ");
        gallonPrice = getUserInput("Enter the price per gallon of paint: $ ");
        
        // creating Instance for Room 1
        PaintEstimator r1 = new PaintEstimator(squareFootage, gallonPrice);
        
        // calculating data for room 1
        gallonNeeded = r1.getGallonsNeeded();
        laborHours = r1.getLaborHoursReqd(gallonNeeded);
        laborCost = r1.getLaborCost(laborHours);
        
        // paint can't be brought in fraction of gallon so rounding to higher number.
        paintCost = r1.getPaintCost((int)Math.ceil(gallonNeeded));
        r1totalCost = r1.getTotalCost(paintCost, laborCost);
        
        // displaying results for room 1    
        displayInfo(r1.getSquareFeet(), gallonNeeded, paintCost, laborHours, laborCost, r1totalCost);
        
        //--------------Room 2 --------------
        // label for Room 2
        System.out.println("\nRoom 2:");
        squareFootage = getUserInput("Enter the square footage to be painted: ");
        gallonPrice = getUserInput("Enter the price per gallon of paint: ");
        
        // creating Instance for Room 2
        PaintEstimator r2 = new PaintEstimator(squareFootage, gallonPrice);
        
        // calculating data for room 2
        gallonNeeded = r2.getGallonsNeeded();
        laborHours = r2.getLaborHoursReqd(gallonNeeded);
        laborCost = r2.getLaborCost(laborHours);
        paintCost = r2.getPaintCost((int)Math.ceil(gallonNeeded));
        r2totalCost = r2.getTotalCost(paintCost, laborCost);
        
        // displaying results for room 2   
        displayInfo(r1.getSquareFeet(), gallonNeeded, paintCost, laborHours, laborCost, r2totalCost);
        
        // calculating total cost for room 1 and room 2
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("\nThe total cost of the paint job: $" + df.format(r1totalCost + r2totalCost));
        
    }
    
    /**
     * Method to get User inputs based on message.
     * @param message
     * @return double: user input value
     */
    public static double getUserInput(String message)
    {
        System.out.print(message);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }
    
    /**
     * Method to display results for each room.
     * @param sqft
     * @param numGal
     * @param pCost
     * @param lHours
     * @param lCost
     * @param tCost
     */
    public static void displayInfo(double sqft, double numGal, double pCost,
                                   double lHours, double lCost, double tCost)
    {
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("\nTotal square feet: " + df.format(sqft));
        System.out.println("Number of Gallons of paint needed: " + (int)Math.ceil(numGal));
        System.out.println("Cost for the paint: " + df.format(pCost));
        System.out.println("Labor hours required: " + df.format(lHours));
        System.out.println("Cost for the labor: $" + df.format(lCost)); 
        System.out.println("Total Cost: $" + df.format(tCost));
    }
}
