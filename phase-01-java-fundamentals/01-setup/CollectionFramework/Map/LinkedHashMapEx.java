package CollectionFramework.Map;

import java.util.LinkedHashMap;
import java.util.Map;


class Lru<K,V> extends  LinkedHashMap<K,V>{


    private int capacity;

    public Lru(int capacity){
        super(capacity,0.75f,true);
        this.capacity = capacity;
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > capacity;
    }
}

public class LinkedHashMapEx {
    public static void main(String[] args) {

        LinkedHashMap<Integer,String> linkedHashMap = new java.util.LinkedHashMap<>(11,04f,true);

        linkedHashMap.put(1,"Aryan");
        linkedHashMap.put(2,"Kanani");
        linkedHashMap.put(5,"Robert");
        linkedHashMap.put(3,"micheal");
      for(Map.Entry<Integer,String> entry : linkedHashMap.entrySet()){
          System.out.println(entry);
      }

      linkedHashMap.get(1);
      linkedHashMap.get(2);
      linkedHashMap.get(2);
      linkedHashMap.get(1);
      linkedHashMap.get(2);

        System.out.println(linkedHashMap);

        Lru <Integer,String > lru = new Lru<>(3);
        lru.put(1,"Aryan");
        lru.put(2,"robert");
        lru.put(3,"learry");
        lru.get(1);
        lru.put(4,"qqq");
        System.out.println(lru);




    }
}
