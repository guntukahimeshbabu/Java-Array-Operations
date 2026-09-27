package my_captian;

import java.util.Scanner;

public class ArrayOperations {

    // Method to sort the array using Bubble Sort
    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // Method to find second highest and second lowest
    public static void findSecondValues(int[] arr) {

        sortArray(arr);

        int secondLowest = arr[1];
        int secondHighest = arr[arr.length - 2];

        System.out.println("Second Lowest : " + secondLowest);
        System.out.println("Second Highest: " + secondHighest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numbers = new int[5];

        System.out.println("Enter 5 different numbers:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        System.out.println("\nOriginal Array:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        sortArray(numbers);

        System.out.println("\n\nSorted Array:");

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        findSecondValues(numbers);

        sc.close();
    }
}
