public class Construct2DArray {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int totalElements = m * n;

        // Check if the total number of elements matches the size of the original array
        if (original.length != totalElements) {
            return new int[0][0]; // Return an empty 2D array
        }

        int[][] result = new int[m][n];
        int index = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                result[i][j] = original[index++];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Construct2DArray construct2DArray = new Construct2DArray();
        
        // Example usage
        int[] original = {1, 2, 5, 6};
        int m = 2;
        int n = 2;

        int[][] result = construct2DArray.construct2DArray(original, m, n);

        System.out.println("Constructed 2D Array:");
        for (int[] row : result) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
