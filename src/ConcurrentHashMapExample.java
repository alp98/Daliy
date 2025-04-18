import java.util.concurrent.*;
public class ConcurrentHashMapExample {
    public static void main(String[]args){
        ConcurrentHashMap<String, Integer >map=new ConcurrentHashMap<>();
        Runnable task= ()->{
            for (int i=0; i<10; i++){
                String key = "key"+i;
                map.merge(key,1,Integer::sum);

            }

        };
        ExecutorService executor= Executors.newFixedThreadPool(5);
    for(int i=0; i<5;i++){
        executor.submit(task);
    }
    executor.shutdown();
    try{
        if(executor.awaitTermination(1,TimeUnit.MINUTES)){
            System.out.println("최종 맵 내용:"+map);
        }else {
            System.out.println("스레드 작업이 타임아웃 됐습니다.");
        }
    }
    catch(InterruptedException e){
        e.printStackTrace();
    }
    }
}
