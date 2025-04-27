//*****************************************
  //   Programmer: Surachhya Adhikari
  //   CTP 150 - section: 400
  //   Lab 2
  //   Version 1.0
/**
 * This is a PaintEstimator Service class.
 * It has default constructor and constructor with parameters.
 */
public class PaintEstimator {
    private double squareFeet;
    private double paintPricePerGallon;
    public static final double coveragePerGallon = 115;
    public static final int hoursPerGallon = 8;
    public static final double laborPerHour = 18.00;

    /**
     * Default Constructor
     */
    public PaintEstimator() {
        squareFeet = 0;
        paintPricePerGallon = 0.0;
    }

    /**
     * Constructor with parameters
     */
    public PaintEstimator(double sqFeet, double pricePerGallon) {
        squareFeet = sqFeet;
        paintPricePerGallon = pricePerGallon;
    }
    
    /**
     * Getter Method to get squareFeet of the room.
     */
    public double getSquareFeet() {
        return squareFeet;
    }
    
    
    /**
     * Setter Method to set squareFeet of the room.
     * @param squareFeet
     */
    public void setSquareFeet(double squareFeet) {
        squareFeet = squareFeet; 
    }
    
    /**
     * Getter Method to get Paint Price per gallon.
     */
    public double getPaintPricePerGallon() {
        return paintPricePerGallon; 
    }

    /**
     * Setter Method to set Paint Price per gallon.
     * @param paintPricePerGallon
     */
    public void setPaintPricePerGallon(double paintPricePerGallon) {
        paintPricePerGallon = paintPricePerGallon; 
    }

    /**
     * Method to get total gallon needed
     * @return double: total gallon needed
     */
    public double getGallonsNeeded() {
        return squareFeet / coveragePerGallon;
    }

    /**
     * Method to calculate labor hours needed for paint job.
     * @param gallonsNeeded
     * @return double: labor hours required
     */
    public double getLaborHoursReqd(double gallonsNeeded) {
        return gallonsNeeded * hoursPerGallon;
    }

    /**
     * Method to calculate cost of paint
     * @param gallonsNeeded
     * @return double: cost of paint
     */
    public double getPaintCost(int gallonsNeeded) {
        return gallonsNeeded * getPaintPricePerGallon();
    }

    /**
     * Method to calculate cost of labor
     * @param laborHour
     * @return double: cost of labor
     */
    public double getLaborCost(double laborHour) {
        return laborHour * laborPerHour;
    }

    /**
     * Method to calculate total cost for paint job
     * @param paintCost
     * @param laborCost
     * @return double: total cost
     */
    public double getTotalCost(double paintCost, double laborCost) {
        return paintCost + laborCost;
    }
}
