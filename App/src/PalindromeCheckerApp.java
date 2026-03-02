import java.util.*;
public class PalindromeCheckerApp {
    private static boolean check(String s, int start, int end) {
        if (start >= end) return true;
        if (s.charAt(start) != s.charAt(end)) return false;
        return check(s, start + 1, end - 1);
    }

    public static void main(String args[]){
        String input = "noon";
        Stack<Character> stack = new Stack<>();
        for (char c : input.toCharArray())
            stack.push(c);
        boolean isPalindrome = true;

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}

