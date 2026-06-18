package MultiThreding.MultithreadingCollection;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapExample
{
    public static void main(String[] args) {

        Map hashMap = new HashMap();
        Map hashTable = new HashMap();
        Map map = new ConcurrentHashMap();
        ConcurrentMap concurrentMap = new ConcurrentHashMap();
        concurrentMap.put("Aryan","Kanani");
       ConcurrentMap<String,String> concurrentMap1 = new ConcurrentHashMap<>();
       concurrentMap1.put("Kanani", "Aryan");


       // slipped condition
        // slipped condition  means that condition has changed before you check the condition and act upon it
        if(!concurrentMap1.containsKey("key1")){
            concurrentMap1.put("key1","aryan");
        }

        // fix slipped condition
        concurrentMap1.putIfAbsent("key1","aryan");
        concurrentMap1.computeIfAbsent("key2", (key) -> {
            System.out.println("absent key" + key);
            return "value";
                });


    }
}
