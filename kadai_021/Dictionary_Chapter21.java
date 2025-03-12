package kadai_021;

import java.util.HashMap;;

public class Dictionary_Chapter21 {
    private HashMap<String, String> dictionaryMap;

    public Dictionary_Chapter21() {
        dictionaryMap = new HashMap<>();
        dictionaryMap.put("apple", "りんご");
        dictionaryMap.put("peach", "もも");
        dictionaryMap.put("banana", "バナナ");
        dictionaryMap.put("lemon", "レモン");
        dictionaryMap.put("pear", "なし");
        dictionaryMap.put("kiwi", "キウイ");
        dictionaryMap.put("strawberry", "いちご");
        dictionaryMap.put("grape", "ぶどう");
        dictionaryMap.put("muscat", "マスカット");
        dictionaryMap.put("cherry", "さくらんぼ");
    }

    public HashMap<String, String> getDictionaryMap() {
        return dictionaryMap;
    }
}
