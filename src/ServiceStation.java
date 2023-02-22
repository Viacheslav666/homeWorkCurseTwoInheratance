
import java.util.Queue;

public class ServiceStation {
    private Queue<String> queue;


    public  ServiceStation(Queue<String> queue) {
        this.queue = queue;

    }





    public void addTransport(Transport auto){
        if (auto != null) {
            System.out.println("Введите автомобиль");
        }
        queue.offer(String.valueOf(auto));
    }
    public  void  carryOutATechnicalInspection(Transport auto){
        for(String transport: queue){
            System.out.println("проходим ТО");
            queue.poll();
        }
        }

    }





