package MultiThreding.FalseSharing;
@jdk.internal.vm.annotation.Contended
public class Counter3 {

    public volatile long count1 = 0;
    public volatile long count2 = 0;
    public volatile long count3 = 0;
}
