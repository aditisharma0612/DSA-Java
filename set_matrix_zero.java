import java.util.*;

class Solution {
    public void setZeroes(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;

        Set<Integer> rSet = new HashSet<>();
        Set<Integer> cSet = new HashSet<>();

        // Step 1: Store row and column index of zero elements
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    rSet.add(i);
                    cSet.add(j);
                }
            }
        }

        // Step 2: Set elements to zero based on stored row and column indexes
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (rSet.contains(i) || cSet.contains(j)) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int row = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int col = sc.nextInt();

        int[][] matrix = new int[row][col];

        System.out.println("Enter matrix elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        Solution sol = new Solution();
        sol.setZeroes(matrix);

        System.out.println("Matrix after setting zeroes:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int ele : row) {
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
