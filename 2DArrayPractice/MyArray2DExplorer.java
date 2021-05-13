
/**
 * Write a description of class Array2DExplorer here.
 *
 * @Daniel McElroy
 * @5/12/21
 */
public class MyArray2DExplorer
{
    public static void main(String[] args) {
        int array [][] = {  {4,1,8,5},
                            {0,2,3,4},
                            {6,6,2,2} };
        MyArray2DExplorer exp = new MyArray2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

        System.out.println();

        System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array,1));
        System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array,0));

        System.out.println();

        System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
        int [] row = exp.minRow(array);
        for(int i = 0; i < row.length; i++){
            System.out.print(row[i] + " ");
        }
        System.out.print("}");
        
        System.out.println();

        System.out.print("Test colMax: \n Expecting: {6 6 8 5} \n Actual: {");
        int [] colMaxs = exp.colMaxs(array);
        for(int i = 0; i < colMaxs.length; i++){
            System.out.print(colMaxs[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test allRowSum: \n Expecting: {18 9 16} \n Actual: {");
        int [] sum = exp.allRowSums(array);
        for(int i = 0; i < sum.length; i++){
            System.out.print(sum[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test averageCol: \n Expecting: {3.333333 3.0 4.333333 3.6666667} \n Actual: {");
        double [] avg = exp.averageCol(array);
        for(int i = 0; i < avg.length; i++){
            System.out.print(avg[i] + " ");
        }
        System.out.print("}");


        System.out.println();
        System.out.println();

        System.out.print("Test smallEven: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.smallEven(array));

        System.out.println();
        System.out.println();

        System.out.print("Test biggestRow: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.biggestRow(array));

        System.out.println();
    }
    public boolean evenRow(int[][] mat, int row) {
        for(int i : mat[row]) {
            if(i % 2 == 1){
                return false;
            }
        }
        return true;
    }
    public boolean oddColSum(int[][] nums, int col) {
        int sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += nums[i][col];
        }
        if(sum % 2 == 0) {
            return false;
        }
        return true;
    }
    public int[] minRow(int[][] nums) {
        int min = nums[0][0];
        int index = 0;
        for(int x = 0; x < nums.length; x++) {
            for(int y = 0; y < nums[x].length; y++) {
                if(nums[x][y] < min) {
                    min = nums[x][y];
                    index = x;
                }
            }
        }
        return nums[index];
    }
    public int[] colMaxs(int[][] matrix) {
        int[] result = new int[matrix[0].length];
        for(int i = 0; i < matrix[0].length; i++) {
            int max = matrix[0][i];
            for(int j = 0; j < matrix.length; j++) {
                if(matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }

            if( i < result.length) {
                result[i] = max;
            }
        }
        return result;
    }
    public int[] allRowSums(int[][] data) {
        int[] result = new int[data.length];
        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++) {
                result[i] += data[i][j];
            }
        }
        return result;
    }
     public double[] averageCol(int[][] nums) {
        double[] result = new double[nums[0].length];
        for(int i = 0; i < nums[0].length; i++) {
            for(int j = 0; j < nums.length; j++) {
                 result[i] += nums[j][i];
            }
            result[i] /= nums.length;
        }
        return result;
    }
    public int smallEven(int[][] matrix) {
        int smallEven = matrix[0][0];
        for(int[] row : matrix) {
            for(int i : row) {
                if(i < smallEven && i % 2 == 0) {
                    smallEven = i;
                }
            }
        }
        return smallEven;
    }
    public int biggestRow(int[][] nums) {
        int[] sumRow = allRowSums(nums);
        int greatestSum = 0;
        for(int i = 1; i < sumRow.length; i++) {
            if(sumRow[i] > sumRow[greatestSum]) {
                greatestSum = i;
            }
        }
        return greatestSum;
    }
}