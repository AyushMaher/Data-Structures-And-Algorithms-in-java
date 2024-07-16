// public class Stack {
//     private int maxSize;
//     private int top;
//     private int[] stackArray;

//     public Stack(int size) {
//         maxSize = size;
//         stackArray = new int[maxSize];
//         top = -1;
//     }

//     public void push(int element) {
//         if (top >= maxSize - 1) {
//             System.out.println("Stack is full. Cannot push element " + element);
//             return;
//         }
//         stackArray[++top] = element;
//     }

//     public int pop() {
//         if (top < 0) {
//             System.out.println("Stack is empty. Cannot pop element");
//             return -1;
//         }
//         return stackArray[top--];
//     }

//     public int peek() {
//         if (top < 0) {
//             System.out.println("Stack is empty. Cannot peek element");
//             return -1;
//         }
//         return stackArray[top];
//     }

//     public boolean isEmpty() {
//         return (top == -1);
//     }

//     public int size() {
//         return top + 1;
//     }

//     public static void main(String[] args) {
//         Stack stack = new Stack(5);

//         stack.push(1);
//         stack.push(2);
//         stack.push(3);

//         System.out.println("Stack size: " + stack.size());

//         System.out.println("Peek element: " + stack.peek());

//         int element = stack.pop();
//         System.out.println("Popped element: " + element);

//         System.out.println("Stack size: " + stack.size());

//         System.out.println("Is stack empty? " + stack.isEmpty());
//     }
// }




public class Stack {
    private Node top;

    public Stack() {
        top = null;
    }

    public void push(int element) {
        Node newNode = new Node(element);
        newNode.next = top;
        top = newNode;
    }

    public int pop() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot pop element");
            return -1;
        }
        int element = top.data;
        top = top.next;
        return element;
    }

    public int peek() {
        if (top == null) {
            System.out.println("Stack is empty. Cannot peek element");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return (top == null);
    }

    public int size() {
        int count = 0;
        Node temp = top;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        Stack stack = new Stack();

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Stack size: " + stack.size());

        System.out.println("Peek element: " + stack.peek());

        int element = stack.pop();
        System.out.println("Popped element: " + element);

        System.out.println("Stack size: " + stack.size());

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}