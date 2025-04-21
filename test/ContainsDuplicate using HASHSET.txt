import java.util.HashSet;

public class containsDuplicate {
    public static void main(String[] args) {
        String str = "abbcd";
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (set.contains(c)) {
                System.out.println(c);
                System.exit(0);
            } else {
                set.add(c);
            }
        }
        System.out.println("No Duplicates");
    }
}