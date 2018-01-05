/*
 
Name:Ahmad Alkurdy
Write an interface CarbonFootprint with a getCarbonFootprint
method. Have each of your classes implement that interface, so that its getCarbonFootprint method
calculates an appropriate carbon footprint for that class (check out a few websites that explain how
to calculate carbon footprints). Write an application that creates objects of each of the three classes,
places references to those objects in ArrayList<CarbonFootprint>, then iterates through the ArrayList,
polymorphically invoking each object’s getCarbonFootprint method. For each object, print
some identifying information and the object’s carbon footprint.
 */
package carbon;

/**
 *
 * @author ahmad
 */
//importing the array package for the output
import java.util.ArrayList;
//the class to test the three classes
public class Carbon{
    public static void main( String[] args )
    {
        ArrayList< CarbonFootPrint > categories = new ArrayList< CarbonFootPrint >();//creates array of objects of type CarbonFootprint
      categories.add( new Bike( 200.00 ));
        categories.add( new Building( 4000.52 ));
        categories.add( new Car( 5845.25, 20.5 ));
        categories.get( 0 ).getCarbonFootPrint();
        categories.get( 1 ).getCarbonFootPrint();
        categories.get( 2 ).getCarbonFootPrint();
      //  System.out.println(" Data of each object:\n ");
       for( CarbonFootPrint currentObject : categories ){
            System.out.printf("%s \n%s %s: %.2f\n", currentObject.getClass().getName(),
                currentObject.toString(),
                "Carbon footprint is ", currentObject.getCarbonFootPrint());
            System.out.println();
        }//end for loop
    }//end of main
        
        }