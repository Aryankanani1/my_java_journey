package CollectionFramework.Map;

import java.util.Map;
import java.util.WeakHashMap;

class Image{

    String name;
    public Image(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}

public class WeakHashmapDemo {
    public static void main(String[] args) {
        WeakHashMap<String, Image> weakHashMap = new WeakHashMap<>();
        loadcache(weakHashMap);
        System.out.println(weakHashMap);
        System.gc();
        simulateapplicationrunning();
        System.out.println("cached after running some entries will be cleared "+weakHashMap);
    }

    private static void simulateapplicationrunning() {
        try {
            System.out.println("application running");
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


    private static void loadcache(Map<String,Image> map){
        String key1 = new String("img1");
        String key2 = new String("img2");
        String key3 = new String("img3");
      map.put(key1, new Image("Image1"));
      map.put(key2, new Image("Image2"));
      map.put(key3, new Image("Image3"));
    }
}