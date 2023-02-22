
import java.util.LinkedList;
import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> queue = new LinkedList<>();


    public ServiceStation(Queue<Transport> queue) {
        this.queue = queue;

    }


    public void addTransport(Transport auto) {
        if (auto != null) {
            System.out.println("Введите автомобиль");
        }
        queue.add((Transport) auto);
    }

    public Transport carryOutATechnicalInspection(Transport auto) throws TransportTypeExeption {
        while (queue.isEmpty()) {
            if (auto.queueCheck(auto)) {
                System.out.println("проходим ТО");
                queue.poll();
            }
        }
        return auto;
    }


}





