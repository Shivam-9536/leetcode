// Last updated: 1/18/2026, 1:44:40 PM
class MyQueue {
    Stack<Integer> stack ;
    Stack<Integer> temp ;

    public MyQueue() {
        stack = new Stack<>();
        temp = new Stack<>();
    }
    public void push(int x) {
     stack.push(x);   
    }
    
    public int pop() {
        while(!stack.isEmpty()){
            temp.push(stack.pop());
        }
        int replace = temp.pop();
        while(!temp.isEmpty()){
            stack.push(temp.pop());
        }
        return replace;
    }
    
    public int peek() {
    while (!stack.isEmpty()) {
        temp.push(stack.pop());
    }
    int replace = temp.peek();
    while (!temp.isEmpty()) {
        stack.push(temp.pop());
    }
    return replace;
    }

    
    public boolean empty() {
        return stack.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */