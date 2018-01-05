/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carbon;

/**
 *
 * @author ahmad
 */
/*Car.java: Car class*/
public class Car implements CarbonFootPrint{
    private double averageYearlyMiles;
    private double averageMPG;
    private final int kgCO2PerMile = 9;
    //constructor
    public Car( double miles, double MPG ){
        averageYearlyMiles = miles;
        averageMPG = MPG;
    }//end of constructor
    public void setAverageYearlyMiles( double miles ){
        averageYearlyMiles = miles;
    }
    public void setAverageMPG( double MPG ){
        averageMPG = MPG;
    }
    public double getAverageYearlyMiles(){
        return averageYearlyMiles;
    }
    public double getAverageMPG(){
        return averageMPG;
    }
    @Override
    public String toString(){
        return String.format( "%s: %.2f \n%s: %.2f \n",
            "Average yearly miles is ", getAverageYearlyMiles(),
            "Average MPG is ", getAverageMPG() );
    }
    @Override
    public double getCarbonFootPrint(){
        return (( getAverageYearlyMiles() * getAverageMPG() ) * kgCO2PerMile );
    }
}//end of Car class