package demos;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;


public class Task01 {

    public static void main(String[] args) {
            List<String> namesStartsA = initialData().stream()
            .filter(name -> name.startsWith("A"))
            .toList();
            printData(namesStartsA);
    }

    private static ArrayList<String> initialData(){
        ArrayList<String> names = new ArrayList<>();
        names.add("Anna");
        names.add("Sergey");
        names.add("Marina");
        names.add("Aleksandr");
        names.add("Anita");
        names.add("Dima");
        names.add("Taras");
        return names;
    }

    private static void printData (List<String> list){
        AtomicInteger counter = new AtomicInteger(1);
        list.forEach(name -> System.out.println(counter.getAndIncrement() + ") " + name));
    }
}
