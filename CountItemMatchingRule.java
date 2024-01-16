import java.util.List;

public class CountItemMatchingRule {
    public static void main(String[] args) {
        // Example usage:
        List<List<String>> items = List.of(
                List.of("type1", "red", "item1"),
                List.of("type2", "blue", "item2"),
                List.of("type1", "green", "item3")
        );
        String ruleKey = "type";
        String ruleValue = "type1";

        int result = countMatches(items, ruleKey, ruleValue);
        System.out.println("Number of items matching the rule: " + result);
    }

    private static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;

        for (List<String> item : items) {
            String itemType = item.get(0);
            String itemColor = item.get(1);
            String itemName = item.get(2);

            switch (ruleKey) {
                case "type":
                    if (ruleValue.equals(itemType)) {
                        count++;
                    }
                    break;
                case "color":
                    if (ruleValue.equals(itemColor)) {
                        count++;
                    }
                    break;
                case "name":
                    if (ruleValue.equals(itemName)) {
                        count++;
                    }
                    break;
            }
        }

        return count;
    }
}
