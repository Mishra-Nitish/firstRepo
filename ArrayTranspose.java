import java.util.Scanner;

public class ArrayTranspose {

    public static void main(String[] args) {

        int[][] arr1 = takeInput();

        int[][] transposed = transposeArray(arr1);

        // Step 3: Display the transposed matrix
        System.out.println("Transposed Matrix:");
        display(transposed);
    }

    // Function to take a 2D array as input
     static int[][] takeInput() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int col = scanner.nextInt();

        int[][] arr = new int[row][col];

        // Take elements in input
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        return arr;
    }

    // Function to transpose the 2D array
    public static int[][] transposeArray(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        int[][] transposed = new int[col][row];

        // Transpose the matrix
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposed[j][i] = arr[i][j];
            }
        }

        return transposed;
    }

    // Function to display a 2D array
    public static void display(int[][] arr) {
        System.out.println("array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

}
