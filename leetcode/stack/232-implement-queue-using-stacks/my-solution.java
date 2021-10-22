class MyQueue {
    //  MY BRUTEFORCE APPROACH
    
    // question is to use two stacks(LIFO) to implement a QUEUE(FIFO)
    
    // will be used as a temporary DS to store the elements
    Stack<Integer> stack;
    // will use this as Queue
    Stack<Integer> queueStack;
        
    public MyQueue() {
        // initialization of the stacks
        this.stack = new Stack<Integer>();
        this.queueStack = new Stack<Integer>();
    }
    
    public void push(int x) {
        // when the queueStack is empty, then directly push elements to the queueStack
        if(this.queueStack.empty()) {
            this.queueStack.push(x);
        // else, there is elements in the queueStack.
        // so, stack is FILO. Need to pop all the elements out and insert the element at the last in the
        // queueStack. 
        } else {
            // pop out all the elements in the queueStack and push it to the stack.
            while(this.queueStack.size() != 0) {
                int element = this.queueStack.pop();
                this.stack.push(element);
            }
            // after, removing all the elements in the queueStack, insert the new element
            this.queueStack.push(x);
            
            // after inserting, reinsert all the elements from the stack to the queueStack.
            while(this.stack.size() != 0) {
                int ele = this.stack.pop();
                this.queueStack.push(ele);
            }
        }
    }
    
    public int pop() {
        return this.queueStack.pop();
    }
    
    public int peek() {
        return this.queueStack.peek();
    }
    
    public boolean empty() {
        return this.queueStack.empty();
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

// Runtime: 1 ms, faster than 24.43% of Java online submissions for Implement Queue using Stacks.
// Memory Usage: 38.2 MB, less than 40.16% of Java online submissions for Implement Queue using Stacks.