package MultiThreding.ThreadSignaling;

public class SignalHolder {
  private boolean signalRaised = false;
  private boolean isThreadWaiting = false;

  public void doNotify(){
      synchronized (this){
          System.out.println(Thread.currentThread().getName() + " calling notify() ");
          if(!isThreadWaiting){
              signalRaised = true;
          }
          this.notify();
          System.out.println(Thread.currentThread().getName() + " exiting notify() ");
      }
  }

  public void doWait() throws InterruptedException{
      synchronized (this){
if(this.signalRaised){
    System.out.println(Thread.currentThread().getName() + " signal was already waiting() ");
    this.signalRaised = false;
return;
}
          System.out.println(Thread.currentThread().getName() + " calling wait() ");
this.isThreadWaiting = true;
this.wait();
this.isThreadWaiting = false;
          System.out.println(Thread.currentThread().getName() + " exiting wait() ");
      }
  }
}
