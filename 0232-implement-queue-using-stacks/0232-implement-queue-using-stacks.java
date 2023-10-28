class MyQueue {
    private Queue<Integer> q;
    public MyQueue() {
         q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int peek() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

