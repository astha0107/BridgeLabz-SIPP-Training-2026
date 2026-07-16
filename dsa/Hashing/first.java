package dsa.Hashing;

import java.util.HashSet;

public class first {
    public static boolean hasDuplicate(String[] tokens) {
        HashSet<String> set = new HashSet<>();
        for (String token : tokens) {
            if (set.contains(token)) {
                return true;
            }
            set.add(token);
        }

        return false;
    }
    public static void main(String[] args) {
        String[] tokens = {
            "TK101",
            "TK205",
            "TK350",
            "TK101",
            "TK500"
        };
        if (hasDuplicate(tokens)) {
            System.out.println("Duplicate session token found.");
        } else {
            System.out.println("No duplicate session tokens.");
        }
    }
}
