import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @className MapGroupTest 
 * @description  
 * @author c.w
 * @date 2024/01/16 15:00
 * @version 
**/
public class MapGroupTest {

    @Test
    public void Group(){
        List<Pro> proList = getList();
        System.out.println(proList);
        Map<String, Map<String, Map<String, Long>>> countMap = proList.stream()
                .collect(Collectors.groupingBy(
                        Pro::getPro,
                        Collectors.groupingBy(
                                Pro::getCity,
                                Collectors.groupingBy(
                                        Pro::getSchool,
                                        Collectors.counting()
                                )
                        )
                ));
        JSONArray arrayList = new JSONArray();
        countMap.forEach((pro, cityMap) ->
        {
            JSONArray array = new JSONArray();
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("pro", pro);
            jsonObject.put("data", array);
            arrayList.add(jsonObject);
            cityMap.forEach((country, domainMap) -> {
                JSONObject jsonYearCountry = new JSONObject();
                jsonYearCountry.put("city", country);
                JSONArray array1 = new JSONArray();
                jsonYearCountry.put("data", array1);
                array.add(jsonYearCountry);
                domainMap.forEach((domain, count) -> {
                    JSONObject jsonObject1 = new JSONObject();
                    if (!jsonYearCountry.containsKey("total")) {
                        jsonYearCountry.put("total", 0);
                    }
                    long total = jsonYearCountry.getInteger("total");
                    total = total + count;
                    jsonYearCountry.put("total", total);
                    jsonObject1.put("count", count);
                    jsonObject1.put("school", domain);
                    jsonObject1.put("city", country);
                    jsonObject1.put("pro", pro);
                    array1.add(jsonObject1);
                });
                array1.sort(Comparator.comparing(obj -> ((JSONObject) obj).getIntValue("count")).reversed());
            });
//            array.sort(Comparator.comparing(obj -> ((JSONObject) obj).getIntValue("total")).reversed());
        });
//        arrayList.sort(Comparator.comparing(obj -> ((JSONObject) obj).getIntValue("year")));
        System.out.println(arrayList);
    }

    public List<Pro> getList(){
        List<Pro> proList = new ArrayList<>();
        //                         y          c            a
        proList.add(new Pro("安徽","蚌埠","蚌埠1中"));
        proList.add(new Pro("安徽","蚌埠","蚌埠1中"));
        proList.add(new Pro("安徽","蚌埠","蚌埠2中"));
        proList.add(new Pro("安徽","蚌埠","蚌埠2中"));
        proList.add(new Pro("安徽","蚌埠","蚌埠2中"));
        proList.add(new Pro("安徽","芜湖","芜湖1中"));
        proList.add(new Pro("安徽","芜湖","芜湖1中"));
        proList.add(new Pro("安徽","芜湖","芜湖3中"));
        proList.add(new Pro("安徽","芜湖","芜湖4中"));
        proList.add(new Pro("安徽","芜湖","芜湖2中"));
        return proList;
    }
}


