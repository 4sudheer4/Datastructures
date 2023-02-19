public class Queue {

    public static void main(String[] args) {

        QueueImplementation queue = new QueueImplementation();
        queue.Enqueue(13);
        queue.Enqueue(14);
        queue.Enqueue(135);
        queue.Enqueue(12);
        queue.Enqueue(18);

        queue.Dequeue();
        queue.print();


    }
}
