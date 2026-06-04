package CollectionFramework.Queue;

import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class DrainMethod {
    public static void main(String[] args) {
        BlockingQueue<String> bq = new ArrayBlockingQueue<>(10);
        Collection dren = new ArrayList();
        bq.offer("a");
        bq.offer("b");
        bq.offer("c");
        bq.offer("d");
        bq.offer("e");
        bq.offer("f");
        bq.drainTo(dren);
        bq.drainTo(dren,3);

    }
}
