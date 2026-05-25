package MultiThreding.Race_Condition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class CheckThenAct {
    private static Runnable getRunnable(Map<String ,String> shreadMap) {
        return () -> {
            for (int i = 0; i < 1_00_000; i++) {
//                synchronized (shreadMap) {
                    if (shreadMap.containsKey("key")) {
                        String value = shreadMap.remove("key");
                        if (value == null) {
                            System.out.println("iteration: " + i + " :value for 'key' was null");
                        }
                    } else {
                        shreadMap.put("key", "value");
                    }
                }
//                }
            };
        }
    public static void main(String[] args) {
        Map<String ,String> sharedMap = new ConcurrentHashMap<>();
        Thread t1 = new Thread(getRunnable(sharedMap));
        Thread t2 = new Thread(getRunnable(sharedMap));
        t1.start();
        t2.start();
    }
}

