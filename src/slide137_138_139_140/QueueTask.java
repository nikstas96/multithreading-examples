package slide137_138_139_140;

import java.util.concurrent.PriorityBlockingQueue;

class QueueTask{
    private PriorityBlockingQueue<Task> queue
            = new PriorityBlockingQueue<Task>();
    public Task getTask() {
        return queue.poll();
    }

    public void setTask(Task task) {
        queue.add(task);
    }
    public PriorityBlockingQueue<Task> getQueue() {
        return queue;
    }
}
