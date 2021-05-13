
/**
 * Write a description of class BattleShip here.
 *
 * @Daniel McElroy
 * @5/6/21
 */
import java.util.Scanner;
import java.util.Random;
public class BattleShip1D
{
    Random random = new Random();
    Scanner input = new Scanner(System.in);
    
    public int[] battleShip = new int[3];
    public int grid[] = {1, 2, 3, 4, 5, 6, 7};
    public int numHits = 0;
    public int numMisses = 0;
    public int value1;
    public int value2;
    public int value3;
    
    public BattleShip1D() {
    }
    public void setBattleShipLocation(){
        int temp = random.nextInt(5);
        value1 = grid[temp];
        value2 = grid[temp + 1];
        value3 = grid[temp + 2];
    }
    public void play(){
          while (numHits < 3){
            System.out.println("Please enter the coordinate you would like to fire upon (1-7): ");
            int coordinate = input.nextInt();
            if (grid[coordinate - 1] == value1 || grid[coordinate - 1] == value2 || grid[coordinate - 1] == value3){
                numHits ++;
                System.out.println("HIT!");
            }
            else{
                numMisses ++;
                System.out.println("miss.");
            }
        }
        System.out.println("GAME OVER, YOU SUNK THE BATTLESHIP!");
    }
    public String toString() {
        int numGuesses = numHits + numMisses;
        if(numGuesses == 3){
            return "\n Rating: A+, Perfect!";
        }
        if(numGuesses == 4){
            return "\n Rating: B, Nice Job!";
        }
        if(numGuesses == 5){
            return "\n Rating: C, You can do better.";
        }
        if(numGuesses == 6){
            return "\n Rating: D, Better luck next time!";
        }
        return "\n Rating: F, Better luck next time!";
    }
}
