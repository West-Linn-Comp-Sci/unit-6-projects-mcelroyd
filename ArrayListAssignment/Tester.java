
/**
 * Write a description of class Tester here.
 *
 * @Daniel McElroy
 * @5/13/21
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class Tester {
    public static void main(String[] args) {
        System.out.println("Test Remove Zeros");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3,4,0,0,1,4,0,6,0));
        System.out.println("Starting List: " + nums);
        removeZeros(nums);
        System.out.println("Expected: [3, 4, 1, 4, 6] \n Actual: " + nums);

        System.out.println();

        ArrayList<String> words = new ArrayList<>(Arrays.asList("this", "is", "a", "list", "of", "words"));
        System.out.println("Test Letter Counter:");
        System.out.println(words);
        System.out.println("Expected: 18 \n Actual: " + countLetters(words));

        System.out.println();

        System.out.println("Test keyPosition: find a 1");
        System.out.println(nums);
        System.out.println("Expected: 2 \n Actual: " + findPosition(1, nums));

        System.out.println();

        System.out.println("Test parse into array");
        System.out.println("Expected: [W, e, s, t, , L, i, n, n] \n Actual: " + parseIntoArrayList("West Linn"));

        System.out.println();

        System.out.println("Test FindMin for Personobjects");
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(new Person(32, "Abe"),
                new Person(14, "Betty"), new Person(18, "Cris")));
        System.out.println(people);
        System.out.println("Expected: BETTY \n Actual: " + findMin(people));

        System.out.println();

        System.out.println("Purse Test:");
        Purse myPurse = new Purse();
        myPurse.add(new Coin(.25, "quarter"));
        myPurse.add(new Coin(.05, "nickel"));
        myPurse.add(new Coin(.01, "penny"));
        myPurse.add(new Coin(.25, "quarter"));

        System.out.println(myPurse);
        System.out.println("# of Quarters = " + myPurse.count(new Coin(.25, "quarter")));
        System.out.println("Smallest Coin = " + myPurse.findSmallest());
        System.out.println("Total of Purse = $" + myPurse.getTotal());

    }
    public static void removeZeros(ArrayList<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) == 0) {
                list.remove(i);
                i--;
            }
        }
    }
    public static int countLetters(ArrayList<String>list){
        int result = 0;
        for (int i = 0; i < list.size(); i++){
            result += list.get(i).length();
        }
        return result;
    }
     public static int findPosition(int keyValue, ArrayList<Integer> list){
         for(int i = 0; i < list.size(); i++){
             if(list.get(i) == keyValue){
                 return i;
             }
         }
         return -1;
    }
    public static ArrayList<String> parseIntoArrayList(String input) {
        ArrayList<String> newArrayList = new ArrayList<String>();
        for(int i = 0; i < input.length(); i++) {
            if (input.substring(i, i+1).equals(" ")) {
                newArrayList.add("");
            } 
            else {
                newArrayList.add(input.substring(i, i+1));
            }
        }
        return newArrayList;
    }
     public static String findMin(ArrayList<Person>list){
        Person min = list.get(0);
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).getAge() < min.getAge()) {
                min = list.get(i);
            }
        }
        return min.getName();
    }
}

