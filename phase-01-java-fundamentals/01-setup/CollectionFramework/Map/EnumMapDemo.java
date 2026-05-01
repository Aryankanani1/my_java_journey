package CollectionFramework.Map;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapDemo {
    public static void main(String[] args) {
        Map<Days,Integer> map = new EnumMap<>(Days.class);
        // no hashing
        map.put(Days.SUNDAY,1);
        System.out.println(Days.SUNDAY.ordinal());
    }

    enum Days{
MONDAY,TUESDAY,WEDNESDAY,SATUREDAY,SUNDAY,FRIDAY
        // in the enum there is array called ordinal
    }
}
