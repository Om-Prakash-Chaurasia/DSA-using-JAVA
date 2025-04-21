import java.util.HashMap;

public class containDuplicate {
    public static void main(String[] args) {
        String str = "acabb";
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (map.containsKey(c)) {
                System.out.println(c);
                System.exit(0);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println("No Duplicates");
    }
}
