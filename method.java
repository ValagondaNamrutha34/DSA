class Service {
    void process(Task t) {
        System.out.println("Processing task: Task@" + Integer.toHexString(t.hashCode()));
    }
}
class Task {
    Service service;
    Task(Service service) {
        this.service = service;
    }
    void start() {
        service.process(this);
    }
}
public class method {
    public static void main(String[] args) {
        Service service = new Service();
        Task task = new Task(service);
        task.start();
    }
}