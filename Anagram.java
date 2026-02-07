import java.util.*;
class Anagram {
    private static boolean isAnagram(String word1, String word2) {
        word1 = word1.trim().toLowerCase().replaceAll("[^a-z]", "");
        word2 = word2.trim().toLowerCase().replaceAll("[^a-z]", "");
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        for (char ch : word1.toCharArray())map1.put(ch, map1.getOrDefault(ch, 0) + 1);
        for (char ch : word2.toCharArray())map2.put(ch, map2.getOrDefault(ch, 0) + 1);
        return map1.equals(map2);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter string 1: ");
            String word1 = sc.nextLine();
            System.out.println("Enter string 2: ");
            String word2 = sc.nextLine();
            System.out.printf("Both are%s an anagram.%n", isAnagram(word1, word2) ? "" : " not");
        } catch (NullPointerException e) {
            System.out.println("Null strings are not allowed! ");
        }
    }
}