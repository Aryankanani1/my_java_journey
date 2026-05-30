package MultiThreding.ExecutorService;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class ExecutorServiceExample {

    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newFixedThreadPool(10);
//        executorService.execute(newRunnable("task 1"));
////        executorService.execute(newRunnable("task 2"));
//        executorService.execute(newRunnable("task 3"));
//        ExecutorService executorService1 = Executors.newFixedThreadPool(3);
//        executorService1.execute(newRunnable("task 2"));
//
//        executorService.shutdown();
//        executorService1.shutdown();

        ExecutorService executorService = Executors.newFixedThreadPool(3);

        List<Callable<String>> callableList = new ArrayList<>();
        //called server to down the latency
        callableList.add(newCallable("task 1.1"));
        callableList.add(newCallable("task 1.2"));
        callableList.add(newCallable("task 1.3"));

        // runnable submit method
        //Future future = executorService.submit(newRunnable("task 1.1"));
        // callable submit method
//        Future future = executorService.submit(newCallable("task 1.1"));

        try{
            // it will return result of .submit method
            // and the main thread will be blocked until it will not return the result of newRunnable
//            String result = (String) executorService.invokeAny((Collection)callableList);
            List<Future<String>> futureList = executorService.invokeAll((Collection<Callable<String>>) callableList);

            for(Future future : futureList){
                System.out.println(future.get());
            }
        }catch (InterruptedException e){
        }catch (Exception e){
        }

        executorService.shutdown();
    }
    public static Runnable newRunnable(String task){
        return new Runnable() {
            @Override
            public void run() {
                String message = Thread.currentThread().getName() + ": " + task;
                System.out.println(message);
            }
        };
    }

    public static Callable newCallable(String task){
        return new Callable() {
            @Override
            public Object call() throws Exception {
                String message = Thread.currentThread().getName() + " " + task;
                return message;
            }
        };
    }
}



