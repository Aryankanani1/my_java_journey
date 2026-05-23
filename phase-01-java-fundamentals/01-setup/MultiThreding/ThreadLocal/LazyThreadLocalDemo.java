package MultiThreding.ThreadLocal;

public class LazyThreadLocalDemo {
    public static void main(String[] args) {
        ThreadLocal <String> threadlocal = new ThreadLocal();

       String value = threadlocal.get();
        System.out.println(value);

        if(value == null){
            threadlocal.set("lazy set value");
          value = threadlocal.get();
        }
        System.out.println(value);
    }
}
