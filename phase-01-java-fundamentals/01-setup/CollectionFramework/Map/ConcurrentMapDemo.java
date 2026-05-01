package CollectionFramework.Map;


import java.util.SimpleTimeZone;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapDemo {
    public static void main(String[] args) {
        ConcurrentMap<Integer, String> map = new ConcurrentHashMap<>();
map.put(1,"ARYAN");
map.put(2,"Kanani");
map.put(3,"kkk");
        System.out.println(map);

    }
}

