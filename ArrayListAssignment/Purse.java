
/**
 * A Purse holds a collection of Coins 
 *
 * @Daniel McElroy
 * @5/13/21
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class Purse { 
    private ArrayList<Coin> coins; 
    public Purse() { 
        coins = new ArrayList<Coin>(); 
    }
    // adds aCoin to the purse 
    public void add(Coin aCoin) { 
        coins.add(aCoin); 
    } 
    // returns total value of all coins in purse 
    public double getTotal() { 
        //COMPLETE THIS METHOD!
        double total = 0;
        for (int i = 0; i < coins.size(); i++){
            total += coins.get(i).getValue();
        }
        return total;
    } 
    // returns the number of coins in the Purse that matches aCoin 
    // (both myName & myValue) 
    public int count(Coin aCoin) {
        //COMPLETE THIS METHOD
        int count = 0;
        for (int i = 0; i < coins.size(); i++){
            if (coins.get(i).equals(aCoin)){
                count++;
            }
        }
        return count;
    } 
    // returns the name of the Coin in the Purse that has the smallest value
    public String findSmallest(){
        Coin smallest = coins.get(0);
        for (int i = 0; i < coins.size(); i++){
            if (coins.get(i).getValue() < smallest.getValue()){
                smallest = coins.get(i);
            }
        }
        return smallest.getName();
    }
}