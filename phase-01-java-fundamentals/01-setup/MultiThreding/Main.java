package MultiThreding;

class Car extends Thread{
    @Override
    public void run(){
        for(;;){
            System.out.println(Thread.currentThread().getName());
        }
    }
}
public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        for (;;){
            System.out.println(Thread.currentThread().getName());
        }

    }
}