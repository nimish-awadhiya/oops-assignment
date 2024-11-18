public class Stack {
    private int maxSize;
    private int top;
    private int[] stack;
    
    public Stack(int size) {
        maxSize = size;
        stack = new int[maxSize];
        top = -1;
    }
    
    public void push(int value) {
        if (top < maxSize - 1) {
            stack[++top] = value;
            System.out.println(value + " pushed to stack.");
        } else {
            System.out.println("Stack Overflow");
        }
    }
    
    public void pop() {
        if (top >= 0) {
            System.out.println(stack[top--] + " popped from stack.");
        } else {
            System.out.println("Stack Underflow");
        }
    }
    
    public int peek() {
        if (top >= 0) {
            return stack[top];
        } else {
            System.out.println("Stack is empty.");
            return -1;
        }
    }
    
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Top element is: " + stack.peek());
        stack.pop();
        System.out.println("Top element after pop: " + stack.peek());
    }
}
