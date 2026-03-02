import java.util.*;

public class PalindromeCheckerApp {

    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input : ");
        String input = scanner.nextLine();

        long start = System.nanoTime();
        boolean result = isPalindrome(input);
        long end = System.nanoTime();

        System.out.println("Is Palindrome? : " + result);
        System.out.println("Execution Time : " + (end - start) + " ns");

        scanner.close();
    }
}