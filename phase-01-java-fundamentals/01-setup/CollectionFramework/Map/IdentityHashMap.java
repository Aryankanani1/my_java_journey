package CollectionFramework.Map;

import java.util.HashMap;
import java.util.Map;

public class IdentityHashMap {
    public static void main(String[] args) {


        String str1 = new String("key");
        String str2 = new String("key");

        Map<String,Integer> map = new HashMap<>();
        map.put(str1,1);
        map.put(str2,2);
        System.out.println(map);

        Map<String,Integer> identityHashMap = new java.util.IdentityHashMap<>();
        identityHashMap.put(str1,1);
        identityHashMap.put(str2,2);
        System.out.println(identityHashMap);



    }
}
