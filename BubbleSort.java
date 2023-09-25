import java.util.Scanner;

public class BubbleSort {
    public static void bubbleSort(int arr[]) {
        int n = arr.length;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            // System.out.println(i);
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                // System.out.println(i);
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in inner loop, the array is already sorted
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int arr[] = {64, 34, 25, 12, 22, 11, 90};

        // Scanner scanner = new Scanner(System.in);

        bubbleSort(arr);

        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            // Record the start time
            long startTime = System.nanoTime();

            // Run your algorithm or code here
            runAlgorithmOrCode();

            // Record the end time
            long endTime = System.nanoTime();

            // Calculate the elapsed time in milliseconds
            long elapsedTime = (endTime - startTime) / 1000000; // Convert nanoseconds to milliseconds

            System.out.println("Elapsed time: " + elapsedTime + " milliseconds");
        }
    }

    public static void runAlgorithmOrCode() {
        // Replace this with your actual code or algorithm
        for (int i = 0; i < 1000000; i++) {
            // Some computation
        }
    }
}
