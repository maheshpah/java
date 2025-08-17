package basic.array;

import java.util.Arrays;

public class A_Array {
    public static void main(String[] args) {

        // 1. Declaration
        int[] arr1;
        int arr2[];

        // 2. Initialization
        int[] arr = new int[5]; // default values will be 0
        int[] arr2Data = {10, 20, 30, 40, 50};

        // 3. Accessing Elements
        System.out.println("First element: " + arr2Data[0]);

        // 4. Modifying Elements
        arr2Data[1] = 100;
        System.out.println("Modified second element: " + arr2Data[1]);

        // 5. Array Length
        System.out.println("Length of arr2Data: " + arr2Data.length);

        // 6. Iterating
        System.out.println("Using for loop:");
        for (int i = 0; i < arr2Data.length; i++) {
            System.out.print(arr2Data[i] + " ");
        }

        System.out.println("\nUsing enhanced for loop:");
        for (int val : arr2Data) {
            System.out.print(val + " ");
        }

        // 7. Sorting
        Arrays.sort(arr2Data);
        System.out.println("\nSorted array: " + Arrays.toString(arr2Data));

        // 8. Copying
        int[] copied = Arrays.copyOf(arr2Data, arr2Data.length);
        System.out.println("Copied array: " + Arrays.toString(copied));

        // 9. Searching
        int index = Arrays.binarySearch(arr2Data, 30);
        System.out.println("Index of 30: " + index);

        // 10. Filling
        Arrays.fill(arr, 99);
        System.out.println("Filled arr: " + Arrays.toString(arr));

        // 11. Multidimensional Array
        int[][] matrix = {
                {1, 2},
                {3, 4}
        };
        System.out.println("Matrix element [1][1]: " + matrix[1][1]);

        // 12. Cloning
        int[] cloneArr = arr2Data.clone();
        System.out.println("Cloned array: " + Arrays.toString(cloneArr));

        // 13. String conversion
        System.out.println("arr2Data as string: " + Arrays.toString(arr2Data));

        // 14. Equality check
        boolean isEqual = Arrays.equals(arr2Data, copied);
        System.out.println("arr2Data equals copied? " + isEqual);

        // 15. Reversing
        for (int i = 0, j = arr2Data.length - 1; i < j; i++, j--) {
            int temp = arr2Data[i];
            arr2Data[i] = arr2Data[j];
            arr2Data[j] = temp;
        }
        System.out.println("Reversed array: " + Arrays.toString(arr2Data));
    }
}
