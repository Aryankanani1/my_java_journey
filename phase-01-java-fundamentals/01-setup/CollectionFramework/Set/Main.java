package CollectionFramework.Set;

import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;
import java.util.concurrent.CopyOnWriteArraySet;

public class Main {
    public static void main(String[] args) {

//        Set <Integer> set = new LinkedHashSet<>();
//        Set<Integer> set = new HashSet<>();
        Set<Integer> set = new TreeSet<>();
        Map<Integer,Integer> map = new HashMap<>();
        // set is nothing but the internal implementation of map's key
        //where in the map we won't accept the duplicate key in the set we also don't update the duplicate key
//        Set<Integer> set1 = map.keySet();
        set.add(1);
        set.add(4);
        set.add(2);
        set.add(3);
        set.add(1);

        map.put(1,3);
        map.put(3,1);
        map.put(4,1);
        map.put(2,1);
        System.out.println(map);

        System.out.println(set);
        // linkedhashset follow the insertion order


// this is nor recommended because it will implement the external synchronization, which means it will increse the complexity
Set<Integer> integerSet = Collections.synchronizedSet(set);


Set <Integer> s = Set.of(1,2,3,4,5,6,7,8,9,10);


Set<Integer> skipListSet = new ConcurrentSkipListSet<>();
Set<Integer> copyOnWriteArraySet = new CopyOnWriteArraySet<>();

for(int i = 0 ; i<= 5 ; i++){
    skipListSet.add(i);
    copyOnWriteArraySet.add(i);
}
        System.out.println("SkipList "+ skipListSet);
        System.out.println("copyOnWriteArrayList "+copyOnWriteArraySet);


        for(Integer i : skipListSet){
            System.out.println("reading from the skiplist "+ i);
            skipListSet.add(6);
        }
        for(Integer i : copyOnWriteArraySet){
            System.out.println("reading from the copynwriteset "+ i);
            copyOnWriteArraySet.add(6);
        }




    }
}
