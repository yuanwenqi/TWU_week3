package cn.school.thoughtworks.section2;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class PracticeA {
    Map<String,Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        Map<String,Integer> rs = new HashMap<String,Integer>();
        for (String i:collection1){
            if (rs.containsKey(i)){
                rs.put(i,rs.get(i)+1);
            }else {
                rs.put(i,1);
            }
        }
        return rs;
    }
}
