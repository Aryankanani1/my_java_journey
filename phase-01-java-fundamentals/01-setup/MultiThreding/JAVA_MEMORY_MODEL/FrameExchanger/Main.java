package MultiThreding.JAVA_MEMORY_MODEL.FrameExchanger;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FrameExchanger frameExchanger = new FrameExchanger();

        Thread producer = new Thread(() -> {
            for(int i =0;i<5 ;i++) {
                frameExchanger.storedFrame(new Frame("video frame: " +i));
            }
        });


        Thread consumer = new Thread(() -> {
            for(int i =0;i<5 ;i++) {
               Frame f = frameExchanger.takeFrame();
            }
        });

        producer.start();
        consumer.start();
    }
}

