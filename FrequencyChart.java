
/**
 * Takes integers from the user and creates a chart that shows how frequently
 * each of the integers fell between sets of 10.
 *
 * @Daniel
 * @4/30/21
 */
import java.util.Scanner;
public class FrequencyChart
{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        boolean run = true;
        int counter = 0;
        int array[] = new int[100];
        String frequency[] = new String[100];
        System.out.println("Enter integers between 1-100, when you wish to stop, enter 0.");
        for (int i = 1; i < 101; i += 10){
            frequency[i] = "";
        }
        while (run == true){
            int num = input.nextInt();
            if (num <= 100 && num >= 0){
                array[counter] = num;
                counter++;
                for (int i = 1; i < 101; i += 10){
                    if (array[counter -1] <= i + 9 && array[counter - 1] >= i){
                        frequency[i] += "*";
                    }
                }
            }
            if (num == 0){
                run = false;
            }
        }
        for (int i = 1; i < 101; i += 10){
            System.out.println(i + " - " + (i+9) + " | " + frequency[i]);
        }
    }
}
