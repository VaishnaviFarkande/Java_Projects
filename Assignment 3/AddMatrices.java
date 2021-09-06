/*Java Program to Add Two Matrix Using Multi-dimensional Arrays*/

public class AddMatrices {
public static void main(String[] args) {
int rows = 2, columns = 3;
int[][] firstMatrix = { {9, 5, 4}, {4, 3, 7} };
int[][] secondMatrix = { {6, 5, 2}, {3, 6, 6} };
int[][] sum = new int[rows][columns];
for(int i = 0; i < rows; i++) {
for (int j = 0; j < columns; j++) {
sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
}
}
System.out.println("Sum of two matrices is: ");
for(int[] row : sum) {
for (int column : row) {
System.out.print(column + "    ");
}
System.out.println();
}
}
}