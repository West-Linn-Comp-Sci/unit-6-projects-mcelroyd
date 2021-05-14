
/**
* A Coin represents a real world coin such as a "quarter" which 
* has a value of 0.25, a "half dollar" which has value of 0.50, etc. 
* A class invariant holds that 0.00 < all coin values <= 1.00 

 * @Daniel McElroy
 * @5/13/21
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class Coin { 
    private double myValue; 
    private String myName; 
    public Coin(double value, String name) { 
       myValue = value; 
       myName = name; 
    }
    public double getValue() { 
       return myValue; 
    } 
    public String getName() { 
       return myName;
    } 
    // returns true if this coin is equal to aCoin, 
    // which means the name and the value are both equal 
    public boolean equals(Coin aCoin) { 
            if(myValue == aCoin.getValue() && myName.equals(aCoin.getName())){
                return true;
            } else {
                return false;
            }
    }
}