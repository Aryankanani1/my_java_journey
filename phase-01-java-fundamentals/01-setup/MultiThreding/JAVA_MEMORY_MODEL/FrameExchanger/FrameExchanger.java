package MultiThreding.JAVA_MEMORY_MODEL.FrameExchanger;

class FrameExchanger {

    private volatile boolean hashFrame = false;

    private long frameStoredCount = 0;
    private long frameTakeCount = 0;

    private Frame frame;

    // producer
    public void storedFrame(Frame frame){
        while(hashFrame){

        }
        this.frame = frame;
        frameStoredCount++;
        this.hashFrame = true;
        System.out.println("total frame produced: "+frameStoredCount);
    }

    //consumer
    public Frame takeFrame(){
        while(!hashFrame){
        }

        Frame newFrame = this.frame;
        frameTakeCount++;
        this.hashFrame = false;
        System.out.println("total frame consume: " +frameTakeCount);
        return newFrame;
    }
}
