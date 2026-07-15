package dsa.TwoPointer_SlidingWindow;
class first {
    public static int[] pairSum(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                return new int[]{left, right};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {5000, 10000, 15000, 20000, 25000, 30000};
        int target = 45000;

        int[] ans = pairSum(arr, target);

        if (ans[0] != -1) {
            System.out.println("Pair found at indices: " + ans[0] + " " + ans[1]);
            System.out.println("Values: " + arr[ans[0]] + " + " + arr[ans[1]]);
        } else {
            System.out.println("No pair found");
        }
    }
}
