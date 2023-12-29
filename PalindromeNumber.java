public class PalindromeNumber {
    public boolean isPalindrome(int x) {

        String number = String.valueOf(x);
        StringBuilder sb = new StringBuilder(number);
        String reverse = sb.reverse().toString();

        return number.equals(reverse);

    }
}
