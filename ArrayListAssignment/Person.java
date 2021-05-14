
/**
 * Write a description of class Person here.
 *
 * @Daniel McElroy
 * @5/13/21
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;
public class Person 
{
    private int myAge;
    private String myName;
    
    public Person(int myAge, String myName) {
        this.myAge = myAge;
        this.myName = myName;
    }
    public int getAge() {
        return myAge;
    }

    public String getName() {
        return myName;
    }
}