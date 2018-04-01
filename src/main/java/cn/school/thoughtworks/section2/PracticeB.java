package cn.school.thoughtworks.section2;

import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.HashMap;

public class PracticeB {
    Map<String, Integer> countSameElements(List<String> collection1) {
        //实现练习要求，并改写该行代码。
        String pattern = "[a-z]*";
        String pattern2 = "\\d+";
        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);
        Pattern r2 = Pattern.compile(pattern2);

        Map<String,Integer> rs = new HashMap<String,Integer>();
        for (String s:collection1){
            // 现在创建 matcher 对象
            Matcher m = r.matcher(s);
            Matcher m2 = r2.matcher(s);
            String key = "";
            Integer n = 1;
            if (m.find()){
                key = m.group(0);
            }
            if (m2.find()){
                n *= Integer.parseInt(m2.group(0));
            }
            if (rs.containsKey(key)){
                rs.put(key,rs.get(key)+n);
            }else {
                rs.put(key,n);
            }
        }

        return rs;
    }
}
