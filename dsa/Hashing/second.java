package dsa.Hashing;

import java.util.HashMap;
import java.util.Map;

public class second {
    public static int mostFrequentErrorCode(int[] errors) {

        HashMap<Integer, Integer> frequency = new HashMap<>();
        for (int code : errors) {
            frequency.put(code, frequency.getOrDefault(code, 0) + 1);
        }
        int maxCode = -1;
        int maxCount = 0;
        for (Map.Entry<Integer, Integer> entry : frequency.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                maxCode = entry.getKey();
            }
        }

        return maxCode;
    }

    public static void main(String[] args) {
        int[] errors = {500, 404, 500, 503, 404, 500, 502, 404, 500};
        int result = mostFrequentErrorCode(errors);
        System.out.println("Most Frequent Error Code: " + result);
    }
}
