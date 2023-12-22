public class DuplicateZeros {
    public void duplicateZeros(int[] arr) {
        int length = arr.length;
        int i = 0;

        while (i < length) {
            if (arr[i] == 0) {
                for (int j = length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        DuplicateZeros duplicateZeros = new DuplicateZeros();
        int[] arr = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros.duplicateZeros(arr);

        System.out.println("Modified Array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
