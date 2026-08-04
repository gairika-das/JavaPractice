public class SecondLargestnum {
    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23};

        int largest = arr[0];
        int secondLargest = arr[0];

        // Find the largest number
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }

        // Find the second largest number
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && arr[i] < largest) {
                secondLargest = arr[i];
            }
        }

        System.out.println("Largest number = " + largest);
        System.out.println("Second largest number = " + secondLargest);
    }
}