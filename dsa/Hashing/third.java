package dsa.Hashing;

import java.util.HashMap;

public class third {
    public static int countSubarrays(int[] revenue, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int prefixSum = 0;
        int count = 0;
        for (int value : revenue) {
            prefixSum += value;
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;
    }

    public static void main(String[] args) {
        int[] revenue = {1, -1, 0, 2, -2, 3};
        int k = 0;
        int result = countSubarrays(revenue, k);
        System.out.println("Number of subarrays with sum " + k + " = " + result);
    }
}
