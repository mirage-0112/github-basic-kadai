package kadai_021;

import java.util.Arrays;
import java.util.List;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        Dictionary_Chapter21 dictionaryInstance = new Dictionary_Chapter21();

        // 検索する単語リスト
        List<String> wordsToSearch = Arrays.asList("apple", "banana", "grape", "orange");

        for (String word : wordsToSearch) {
            System.out.println(word + "の意味は" + dictionaryInstance.getMeaning(word));
        }
    }
}