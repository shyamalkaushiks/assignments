import java.util.ArrayList;
import java.util.List;

public class Q3_SubsetOfThree {
    public static List<String> generateSubsets(String set) {
        List<String> subsets = new ArrayList<>();
        generateSubsetsHelper(set, "", 0, subsets);
        return subsets;
    }

    private static void generateSubsetsHelper(String set, String currentSubset, int index, List<String> subsets) {
        if (index == set.length()) {
            subsets.add(currentSubset);
            return;
        }

        generateSubsetsHelper(set, currentSubset, index + 1, subsets);

        generateSubsetsHelper(set, currentSubset + set.charAt(index), index + 1, subsets);
    }

    public static void main(String[] args) {
        String set1 = "abc";
        List<String> subsets1 = generateSubsets(set1);
        System.out.println("Subsets of " + set1 + ": " + subsets1);

        String set2 = "abcd";
        List<String> subsets2 = generateSubsets(set2);
        System.out.println("Subsets of " + set2 + ": " + subsets2);
    }
}
