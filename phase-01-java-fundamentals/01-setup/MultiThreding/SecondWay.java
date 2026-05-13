package MultiThreding;

class Animal implements Runnable{


    @Override
    public void run() {
        while (true){
            System.out.println(Thread.currentThread().getName());
        }
    }
}

public class SecondWay {
    public static void main(String[] args) {

        Animal animal = new Animal();
        Thread t1 = new Thread(animal);
        t1.start();

        for(;;){
            System.out.println(Thread.currentThread().getName());
        }


    }
    }