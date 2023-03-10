
import Drivers.DriverB;

import java.util.LinkedList;
import java.util.Queue;
/*
/Добавьте класс «Станция техобслуживания». В этом классе должна быть реализована очередь из авто. В классе есть методы:

«добавить авто в очередь»;
«провести техосмотр авто».
Напомним, что автобусы не нуждаются в техобслуживании перед заездом, поэтому они в очередь не встают.

Каждый новый объект становится в конец очереди на техобслуживание. Как только машина проходит техобслуживание, она должна из очереди удаляться.
 */


public class ServiceStation {
    private Queue<Transport<?>> queue;



    public ServiceStation(Queue<Transport<?>> queue) {
        this.queue = queue;

    }
    public ServiceStation() {
        queue = new LinkedList<>();
    }

    public void addTransport(Transport<?> auto) throws TransportTypeExeption {
        if ((auto != null) && auto.isDiagnosticApplicable()) {
            queue.offer(auto);
        }

    }

    public void carryOutATechnicalInspection() {
        while (queue.isEmpty()) {
                queue.poll();
            System.out.println(queue);
            }
    }


    @Override
    public String toString() {
        return "Сервисная станция{" +
                "Очередь транспорта=" + queue +
                '}';
    }
}





