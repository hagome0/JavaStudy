package ch05;

import java.util.Arrays;

public class SimpleQueueD {
    int rear=-1, front=-1, MaxSize=1;
    char queue[];
    public SimpleQueueD() {
        queue=new char[MaxSize];
    }
    public void add(char data) {
        if(full()){
            MaxSize = MaxSize*2;
            queue = Arrays.copyOf(queue, MaxSize);
            for (int i = 0; i < rear-front; i++) {
                queue[i] = queue[front+1+i];
            }
            rear = rear-front-1;
            front = -1;
        }

        queue[++rear]=data;
    }
    public int remove() {
        if(empty()) throw new RuntimeException("queue empty");
        return queue[++front];
    }
    private boolean full() { return rear==MaxSize-1; }
    private boolean empty() { return rear==front; }
    @Override
    public String toString() {
        return "front="+front+", rear="+rear+", "+ Arrays.toString(queue);
    }
}