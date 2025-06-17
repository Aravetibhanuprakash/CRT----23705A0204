public class Main{
    public static void main(String []args){
        Stack stack=new Stack(5);
        stack.push(20);
        stack.push(30);
        stack.push(20);
        stack.push(40);
        stack.push(20);
        stack.push(30);
        stack.pop();
        stack.print();
        System.out.println("the peak value is:"+stack.peak());
    }
}
class Stack{
    int[] stack;
    int size;
    int top;
    Stack(int size){
        this.size=size;
        this.stack=new int[size];
        this.top=-1;
    }
    boolean isFull(){
        if(top==size-1){
            System.err.println("Stack is full");
            return true;
        }
        return false;
    }
    boolean isEmpty(){
        if(top==-1){
            System.err.println("Stack is empty");
            return true;
        }
        return false;
    }
    void push(int val){
        if (isFull()){
            return;
        }
        stack[++top]=val;
        System.out.println(val+"pushed into stack");
    }
    int pop(){
        if(isEmpty()){
            return -1;
        }
        int val=stack[top--];
        System.out.println(val+"popped from stack");
        return val;
    }
    int peak(){
        if(isEmpty()){
            return -1;
        }
        return stack[top];
    }
    void print(){
        for(int i=top;i>=0;i--){
            System.out.println("|"+stack[i]+"|");
        }
    }
}
