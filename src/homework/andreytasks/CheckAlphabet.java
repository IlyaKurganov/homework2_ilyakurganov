package homework.andreytasks;

import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = (sc.nextLine());

        System.out.println(hasAllLetters(str));

    }

    public static boolean hasAllLetters(String str) {
        boolean result = true;
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        str = str.replaceAll(" ","").toLowerCase();
        char[] alphabetArray = alphabet.toCharArray();
        for (int i = 0; i < alphabet.length(); i++) {
            if (str.indexOf(alphabetArray[i]) == -1) {
                result = false;
                break;
            }
        }
        return result;
    }

}
