package MultiThreding.Synchronized;

public class SynchronizedLambda {

    public static Object object = null;

    public static synchronized void setObject(Object o){
        object = o;
    }

    public static void consumeObject(Consumer consumer){
        consumer.accept(object);
    }

    public static void main(String[] args) {

//        consumeObject( (object) -> {
//            synchronized (SynchronizedLambda.class){
//                System.out.println(object);
//            }
//        });
    }
}
