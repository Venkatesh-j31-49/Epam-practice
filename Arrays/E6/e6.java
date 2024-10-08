package Arrays.E6;
import java.util.Arrays;

public class e6 {
    public static int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] transposedMatrix = new int[columns][rows];


        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transposedMatrix[j][i] = matrix[i][j];
            }
        }




        return transposedMatrix;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");


        int[][] matrix = {
                {1, 2},
                {7, -13} };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
    
}
