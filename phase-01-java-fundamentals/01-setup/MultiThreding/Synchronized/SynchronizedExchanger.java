package MultiThreding.Synchronized;

class SynchronizedExchanger {

   private Object object = null;

    public synchronized void setObj(Object object){
        this.object = object;
    }
    // executed by one thread at a time
    public synchronized Object getObj(){
        return this.object;
    }

    public void setObject(Object o){
        synchronized (this){
            this.object = o;
        }
    }

    public Object getObject(){
        synchronized (this){
            return this.object;
        }
    }
}
