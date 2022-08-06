import java.util.ArrayList;
import java.util.Scanner;

public class Anagram {

    public static boolean isAnagram(String original, String testWord){

        boolean result = false;
        int count = 0;
        int i = 0;

        if (original.length() != testWord.length()){
            return result;
        } else {

            ArrayList<Character> list = new ArrayList<>();
            for (int j = 0; j < original.length(); j++){
                char c = original.charAt(j);
                list.add(c);
            }

            while (i != original.length()){

                char ch = testWord.charAt(i);

                for (int k = 0; k < list.size(); k++){
                    if (list.get(k) == ch) {
                        count++;
                        list.remove(k);
                    }
                }

                i++;
            }

            if (count == original.length())
                result = true;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the original word: ");
        String word = input.next();

        System.out.print("Enter the testing word: ");
        String testWord = input.next();

        System.out.println(isAnagram(word, testWord));

    }
}
