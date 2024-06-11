package homework.andreytasks;

import java.util.Scanner;

public class IsPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isStrPalindrome(str));
        System.out.println(isStrPalindromeV2(str));

    }
    public static boolean isStrPalindrome(String str){
        String reversedStr = new StringBuilder(str).reverse().toString();
        if (str.equals(reversedStr)){
            return true;
        }
        return false;
    }

    public static boolean isStrPalindromeV2(String str){
        char[] array = str.toCharArray();
        String reversedStr = "";
        for (int i = array.length - 1; i >= 0; i--) {
            reversedStr += array[i];
        }
        if (str.equals(reversedStr)){
            return true;
        }
        return false;
    }
}
