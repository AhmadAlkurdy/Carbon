/*
 BIKE CLASS
 */
package carbon;

public class Bike implements CarbonFootPrint{
    private double yearlyMiles;
    private final int caloriesPerMile = 34;
    //constructor
    public Bike( double miles ){
        yearlyMiles = miles;
    }//end of constructor
    public double getYearlyMiles(){
        return yearlyMiles;
    }
    public void setYearlyMiles( double miles ){
        yearlyMiles = miles;
    }
    @Override
    public String toString(){
        return String.format("%s: %.2f",
            "Yearly miles are ", getYearlyMiles() );
    }
    @Override
    public double getCarbonFootPrint(){
        return yearlyMiles * caloriesPerMile;
    }
}//endnof Bike class