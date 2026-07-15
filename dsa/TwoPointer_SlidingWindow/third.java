package dsa.TwoPointer_SlidingWindow;

class third {

    public static int maxWindowSum(int[] arr, int k) {
        int windowSum = 0;
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }
        int maxSum = windowSum;
        for (int i = k; i < arr.length; i++) {
            windowSum += arr[i];
            windowSum -= arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return maxSum;
    }

    public static void main(String[] args) {
        int[] cpu = {10, 20, 30, 40, 50, 15, 25};
        int k = 5;

        System.out.println(maxWindowSum(cpu, k));
    }
}
