package ch04;

import java.util.Arrays;

public class SimpleStackG<T> {
    int DefaultSize=1;
    int MaxSize;
    Object stack[];
    int top=-1;
    public SimpleStackG() {
        stack=new Object[DefaultSize];
        MaxSize=DefaultSize;
    }
    public void push(Object data) {
        if(full()){
            MaxSize*=2;
            stack=Arrays.copyOf(stack, MaxSize);
        }
        stack[++top]=data;
    }
    private boolean full() {
        return top==MaxSize-1;
    }
    @Override
    public String toString() {
        return "top="+top+", stack="+ Arrays.toString(stack);
    }
    @SuppressWarnings("unchecked")
    public T pop() {
        if(empty()) throw new RuntimeException("stack empty");
        return (T) stack[top--];
    }
    private boolean empty() {
        return top==-1;
    }
}