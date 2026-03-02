import java.util.*;
public class PalindromeCheckerApp {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input : ");
        String input = scanner.nextLine();

        // Create service object
        PalindromeService service = new PalindromeService();

        // Check palindrome
        boolean result = service.checkPalindrome(input);

        System.out.println("Is Palindrome? : " + result);

    }
}

class PalindromeService {
    public boolean checkPalindrome(String input) {

        if (input == null) {
            return false;
        }
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}