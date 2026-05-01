package level14;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Solution1304 {
        public static void printList(ArrayList<String> words) {
            for (String wordsList : words) {
                System.out.println(wordsList);
            }
        }

        public static void printHastSet(HashSet<String> words) {
            for (String setWords : words) {
                System.out.println(setWords);
            }
        }

    public static void main(String[] args) {
        String[] wordsArray = "Думаю, это будет новой фичей. Только не говорите никому, что она возникла случайно.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHastSet(wordsHashSet);

    }
}
