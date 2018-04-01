package cn.school.thoughtworks.section3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class PracticeA {
    Map<String,Integer> createUpdatedCollection(Map<String,Integer> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        List<String> list2 = object.get("value");
        for (String i:list2){
            collectionA.put(i,collectionA.get(i)-1);
        }

        return collectionA;
    }
}
