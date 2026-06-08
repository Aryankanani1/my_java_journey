package MultiThreding.FalseSharing;

public class Counter2 {

    @jdk.internal.vm.annotation.Contended
    public volatile long count1 = 0;
    public volatile long count2 = 0;

}
