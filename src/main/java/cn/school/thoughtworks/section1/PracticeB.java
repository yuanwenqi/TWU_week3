package cn.school.thoughtworks.section1;

import java.util.ArrayList;
import java.util.List;

public class PracticeB {
    List<String> collectSameElements(List<String> collection1, List<List<String>> collection2) {
        //实现练习要求，并改写该行代码。
        List<String> rs = new ArrayList<String>();
        for (String x:collection1){
            for (List<String> i:collection2) {
                for (String j : i) {
                    if (x == j) {
                        rs.add(x);
                        break;
                    }
                }
            }
        }
        return rs;
    }
}
