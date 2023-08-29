// Using 2 Queues

class MyStack {
    Queue<Integer> q1, q2;
    public MyStack() {
        q1 = new LinkedList<>();
        q2 = new LinkedList<>();
    }
    
    public void push(int x) {
        // while(!q2.isEmpty()){
        //     q1.offer(q2.poll());
        // }
        q1.offer(x);
    }
    public int pop() {
        while(q1.size() != 1){
            q2.offer(q1.poll());
        }
        int top = q1.poll();
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
        return top;
    }
    
    public int top() {
        while(q1.size() != 1){
            q2.offer(q1.poll());
        }
        return q1.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty();
    }
}


// Using 1 Queue

class MyStack {
    Queue<Integer> q;
    public MyStack() {
        q = new LinkedList<>();
    }
    
    public void push(int x) {
        q.add(x);
        int size = q.size();
        while(size > 1){
            q.add(q.poll());
            size--;
        }
    }
    
    public int pop() {
        return q.poll();
    }
    
    public int top() {
        return q.peek();
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}
