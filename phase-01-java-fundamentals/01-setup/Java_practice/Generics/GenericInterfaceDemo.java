package Generics;


interface Loop<V> {
    void add(V value);

    V get();
}

class ForLoop<T> implements  Loop <T>{
private T  item ;

//ForLoop(T item){
//    this.item = item;
//}

    @Override
    public void add(T value) {
        this.item = value;
    }

    @Override
    public T get() {
        return item;
    }
}
class MyNumber extends Number implements Loop{
    private final int value;

public MyNumber (int value){
    this.value = value;
}

    public void add(int value) {

    }


    @Override
    public void add(Object value) {

    }

    @Override
    public Object get() {
        return null;
    }

    @Override
    public int intValue() {
        return 0;
    }

    @Override
    public long longValue() {
        return 0;
    }

    @Override
    public float floatValue() {
        return 0;
    }

    @Override
    public double doubleValue() {
        return 0;
    }
}

class WhileLop <T extends Number & Loop>{
   private T item ;

   public WhileLop(T item){
       this.item = item;
   }

   public void display(){
       item.get();
   }

   public T getItem(){
       return item;
   }


}

public class GenericInterfaceDemo {
    public static void main(String[] args) {

        ForLoop <String> forLoop  = new ForLoop<>();
        forLoop.add("Hello");
        System.out.println(forLoop.get());
        MyNumber myNumber = new MyNumber(10);
        WhileLop<MyNumber> whileLop = new WhileLop(myNumber);
      whileLop.display();
    }
}
