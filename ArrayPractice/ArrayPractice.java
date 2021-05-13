
/**
 * 2d Array Assaignments
 *
 * @Daniel McElroy
 * @5/10/21
 */
public class ArrayPractice {
   public static void main(String[] args) {
       int[][] array = {{5, 4, 2, 1, 0}, {523, 63, 2342, 586, 1, 6534, 0}, {10, 9, 2, 0}};
       //Calls the fixArray method three times on this array
       fixArray(array,0,array[0].length-1,array[0].length);
       fixArray(array,1,array[1].length-1,array[1][0]+array[1][array[1].length-2]);
       fixArray(array,2,array[2].length-1,array.length);
       print(array);
   }
   //method to add the correct value to the array at the correct col, row
   public static void fixArray(int[][] arr, int row, int col, int value) {
       arr[row][col]=value;
   }
   //Do not make alterations to this method!
   public static void print(int[][] array) {
      for(int[] row: array) {
          for(int num: row) {
               System.out.print(num + " ");
          }
          System.out.println();
      }
   }
}