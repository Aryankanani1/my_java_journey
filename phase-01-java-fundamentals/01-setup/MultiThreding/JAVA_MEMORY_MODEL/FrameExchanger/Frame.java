package MultiThreding.JAVA_MEMORY_MODEL.FrameExchanger;

import java.util.ArrayList;

class Frame {
    private FrameExchanger frameExchanger;

    String name;
    public Frame(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
