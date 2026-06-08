package MultiThreding.FalseSharing;

public class Counter4 {
    @jdk.internal.vm.annotation.Contended("group 1")
    public volatile long count1 = 0;
    @jdk.internal.vm.annotation.Contended("group 1")
    public volatile long count2 = 0;
    @jdk.internal.vm.annotation.Contended("group 2")
    public volatile long count3 = 0;

}
