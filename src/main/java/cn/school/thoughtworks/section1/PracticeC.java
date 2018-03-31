package cn.school.thoughtworks.section1;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;

public class PracticeC {
    List<String> collectSameElements(List<String> collection1, Map<String,List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> rs = new ArrayList<String>();
        List<String> list2 = collection2.get("value");
        for (String i:collection1) {
            for (String j:list2) {
                if (i == j){
                    rs.add(i);
                }
            }
        }
        return rs;
    }
}
