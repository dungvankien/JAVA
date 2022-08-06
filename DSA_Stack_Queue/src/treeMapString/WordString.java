package treeMapString;

import java.util.Map;
import java.util.TreeMap;

public class WordString {
    public void printCountNumberofString(String string){
        Map<String,Integer> countKeyWord=new TreeMap<String, Integer>();
        String stringLower=string.toLowerCase();
        String[] strings=stringLower.split(" ");
        if(strings.length==0){
            System.out.println("Chuỗi rổng");
        }else {
            for (String s : strings) {
                if (countKeyWord.containsKey(s)) {
                    int value = countKeyWord.get(s) + 1;
                    countKeyWord.replace(s, value);
                } else {
                    countKeyWord.put(s, 1);
                }
            }
            System.out.println(countKeyWord);
        }
    }
}
