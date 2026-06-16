import java.util.ArrayList;

public class generate_subsets {
    static void generateSubsets(int[] arr, int index, ArrayList<Integer> subset) {
        if (index == arr.length) {
            System.out.println(subset);
            return;
        }
        subset.add(arr[index]);
        generateSubsets(arr, index + 1, subset);
        subset.remove(subset.size() - 1);
        generateSubsets(arr, index + 1, subset);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        generateSubsets(arr, 0, new ArrayList<>());
    }
}