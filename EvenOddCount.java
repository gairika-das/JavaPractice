public class EvenOddCount {
    public static void main(String[] args) {

        int[] arr = {12, 45, 7, 89, 23, 10, 18, 5};

        int evenCount = 0;
        int oddCount = 0;

        // Count even and odd elements
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Number of Even Elements = " + evenCount);
        System.out.println("Number of Odd Elements = " + oddCount);
    }
}
