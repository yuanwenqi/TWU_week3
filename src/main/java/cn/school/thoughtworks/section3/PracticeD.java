package cn.school.thoughtworks.section3;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PracticeD {
    Map<String,Integer> createUpdatedCollection(List<String> collectionA, Map<String,List<String>> object) {
        //实现练习要求，并改写该行代码。
        String pattern = "[a-z]*";
        String pattern2 = "\\d+";
        // 创建 Pattern 对象
        Pattern r = Pattern.compile(pattern);
        Pattern r2 = Pattern.compile(pattern2);

        Map<String,Integer> collection3 = new HashMap<String,Integer>();
        for (String s:collectionA){
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
            if (collection3.containsKey(key)){
                collection3.put(key,collection3.get(key)+n);
            }else {
                collection3.put(key,n);
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
