package CollectionFramework.SortedMap;


import java.util.HashMap;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main{
    public static void main(String[] args) {

        SortedMap<Integer,String>  sortedMap = new TreeMap<>((a,b) -> b-a);
        sortedMap.put(1,"Aryan");
        sortedMap.put(3,"Robert");
        sortedMap.put(2,"Mahesh");
        System.out.println(sortedMap);

        System.out.println(sortedMap.firstKey());
        System.out.println(sortedMap.lastKey());
        System.out.println(sortedMap.headMap(3)); // it will exclude itself
        System.out.println(sortedMap.tailMap(1)); // it will include itself


        //navigable map
        NavigableMap<Integer,String> navigableMap = new TreeMap<>();
        navigableMap.put(1,"Aryan");
        navigableMap.put(3,"Robert");
        navigableMap.put(2,"Mahesh");
        System.out.println(navigableMap);
        System.out.println(navigableMap.lowerKey(4));
        System.out.println(navigableMap.lowerEntry(4));
        System.out.println(navigableMap.higherEntry(1));
    }
}
