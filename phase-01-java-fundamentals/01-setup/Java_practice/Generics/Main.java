package Generics;

import java.util.Objects;

class Box<T> {

    private T object;

    public T getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

}

class Leap<K,V>{
    private K key;
    private V value;

    public Leap(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public void setKey(K key){
        this.key = key;
    }

    public K getKey(){
        return key;
    }

    public void setValue(V value){
        this.value = value;
    }

    public V getValue(){
        return value;
    }


}

public class Main {
    public static void main(String[] args) {
        Box<Integer> box = new Box();
       box.setObject(1);
        System.out.println(box.getObject());

        Leap<String,Integer> leap = new Leap<>("banana",12);
        System.out.println(leap.getKey());
        System.out.println(leap.getValue());
    }
}
