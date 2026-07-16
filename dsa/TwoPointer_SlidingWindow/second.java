package dsa.TwoPointer_SlidingWindow;

import java.util.*;

class second {
    public static List<List<Integer>> threeSum(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < arr.length - 2; i++) {

            if (i > 0 && arr[i] == arr[i - 1])
                continue;

            int left = i + 1;
            int right = arr.length - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == target) {

                    ans.add(Arrays.asList(arr[i], arr[left], arr[right]));

                    while (left < right && arr[left] == arr[left + 1])
                        left++;

                    while (left < right && arr[right] == arr[right - 1])
                        right--;

                    left++;
                    right--;

                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] arr = {100, 200, 300, 400, 500, 600};
        int target = 900;

        List<List<Integer>> result = threeSum(arr, target);

        if (result.isEmpty()) {
            System.out.println("No triplets found");
        } else {
            for (List<Integer> triplet : result) {
                System.out.println(triplet);
            }
        }
    }
}
