package demos;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Task03 {

    public static void main(String[] args) {
    printData(filterData(initData()));
    }

    private static LinkedHashMap<String, Integer> initData(){
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        map.put("Sun", 9);
        map.put("Mon", 11);
        map.put("Tue", 15);
        map.put("Wed", 13);
        map.put("Thu", 9);
        map.put("Fri", 8);
        map.put("Sat", 14);
        return map;
    }

    private static Map<String, Integer> filterData (Map<String, Integer> map){
        return map.entrySet()
                .stream()
                .filter(temp -> temp.getValue() >= 10 && temp.getValue() <= 13)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private static void printData (Map<String, Integer> map){
        AtomicInteger counter = new AtomicInteger(1);
        map.forEach((k,v) -> System.out.println(counter.getAndIncrement() + ") " + k + " ---> " + "+" + v + " C"));
    }
}
