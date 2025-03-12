package kadai_021;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DictionaryExec_Chapter21 {
    public static void main(String[] args) {
        Dictionary_Chapter21 dictionaryInstance = new Dictionary_Chapter21();
        HashMap<String, String> dictionaryMap = dictionaryInstance.getDictionaryMap();

        // 検索する単語リスト
        List<String> wordsToSearch = Arrays.asList("apple", "banana", "grape", "orange");

        for (String word : wordsToSearch) {
            if (dictionaryMap.containsKey(word)) {
                System.out.println(word + "の意味は" + dictionaryMap.get(word));
            } else {
                System.out.println(word + "は辞書に存在しません");
            }
        }
    }
}
