package com.mycompany.projetopilha;
import java.util.Arrays;
/**
 *
 * @author 821150867
 */
public class ArrayStack {
    
    private int maxSize;
    private Object[] stackArray;
    private int top;
    private int length;
    
    public ArrayStack(int tam) {
        maxSize = tam;
        stackArray =  new Object[maxSize];
        top = -1;
    }
    
    public void push(Object value) {
        if(isFull()){
            //System.out.println("Stack cheia");
            return;
        }
        top++;
        stackArray[top] = value;
    }
    
    public Object pop(){
        if(isEmpty()){
            System.out.println("error");
            return -1;
        }
        int oldTop = top;
        top--;
        stackArray[oldTop] = null;
        return stackArray[oldTop];
    }
    
    public Object peek(){
        if (isEmpty()){
            //System.out.println("Stack vazia");
            return -1;
        }
        return stackArray[top];
    }
    
    public boolean isEmpty(){
        return(top == -1);
    }
    
    public boolean isFull(){
        return (top == maxSize -1);
    }
    
    public int size(){
        length = stackArray.length;
        return length - 1;
    }
    
    @Override
    public String toString(){
        return "Pilha: " + Arrays.toString(stackArray);
    }
}
