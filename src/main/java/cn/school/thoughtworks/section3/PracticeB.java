package cn.school.thoughtworks.section3;

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class PracticeB {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。

        List<String> list2 = object.get("value");

        for(String key: list2){
            if (collectionA.containsKey(key)){
                collectionA.put(key,collectionA.get(key)-collectionA.get(key)/3);
            }
        }
        return collectionA;
    }
}
