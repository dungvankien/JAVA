package palindrome;

public class MainCheckPalindrome {
    public static void main(String[] args) {
        CheckStringPalindrome checkStringPalindrome = new CheckStringPalindrome();
        String strings = "Chung Toi la al iot gnuhc";
        String string1="";
        if (checkStringPalindrome.checkPalindrome(strings)) {
            System.out.println(strings + " :is Palindrome");
        } else {
            System.out.println(strings + " :is not Palindrome");
        }
    }
}
