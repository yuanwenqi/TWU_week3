package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class PracticeC {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        Map<String,Integer> collection3 = new HashMap<String,Integer>();
        for (String i:collectionA){
            if (collection3.containsKey(i)){
                collection3.put(i,collection3.get(i)+1);
            }else {
                collection3.put(i,1);
            }
        }

        List<String> list2 = object.get("value");

        for(String key: list2){
            if (collection3.containsKey(key)){
                collection3.put(key,collection3.get(key)-collection3.get(key)/3);
            }
        }
        return collection3;
    }
}
