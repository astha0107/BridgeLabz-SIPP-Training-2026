package dsa.Hashing;

import java.util.*;

public class fourth {
    public static List<List<String>> groupAnagrams(String[] tickets) {
        HashMap<String, List<String>> map = new HashMap<>();
        for (String str : tickets) {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            String key = new String(ch);
            map.putIfAbsent(key, new ArrayList<>());
            map.get(key).add(str);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] tickets = {
                "eat", "tea", "tan", "ate", "nat", "bat"
        };
        List<List<String>> result = groupAnagrams(tickets);
        System.out.println("Grouped Anagrams:");
        for (List<String> group : result) {
            System.out.println(group);
        }
    }
}
