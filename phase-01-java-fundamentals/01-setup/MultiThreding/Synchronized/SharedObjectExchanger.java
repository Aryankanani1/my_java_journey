package MultiThreding.Synchronized;

class SharedObjectExchanger {

     private Object object;

     private int counter = 0;

     public SharedObjectExchanger(Object o){
         if(o == null){
             throw new NullPointerException("object can't be null");
         }
         this.object = o;
     }

     public void incCounter(){
         synchronized (this.object){
             counter++;
         }
     }



}
