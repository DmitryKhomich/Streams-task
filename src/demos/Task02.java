package demos;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Task02 {

    public static void main(String[] args) {
    printData(filterData(initData()));
    }

    private static HashMap<String, Double> initData(){
        HashMap<String, Double> map = new HashMap<>();
        map.put("Engine oil", 3.13);
        map.put("Transmission oil", 2.51);
        map.put("Break fluid", 1.65);
        map.put("Antifreeze", 2.05);
        map.put("Gear oil", 1.88);
        map.put("Screen wash", 1.1);
        return map;
    }

    private static Map<String, Double> filterData (HashMap<String, Double> map){
        return map.entrySet()
                .stream()
                .filter(price -> price.getValue() <= 2)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
    }

    private static void printData(Map<String, Double> list){
        AtomicInteger counter = new AtomicInteger(1);
        list.forEach( (key, value) -> System.out.println(counter.getAndIncrement() + ") " + key + " ---> " + value));
    }
}
