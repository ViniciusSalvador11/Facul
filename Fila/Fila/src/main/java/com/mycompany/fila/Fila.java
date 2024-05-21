/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fila;

import java.util.Arrays;

/**
 *
 * @author 821150867
 */
public class Fila {

    public static void main(String[] args) {
        
        QueueArray fila = new QueueArray(4);
        
        fila.Enqueue(6);
        System.out.println("\nFront:" + fila.front() + "-" + fila.toString());
        
        fila.Enqueue(7);
        System.out.println("\nFront:" + fila.front() + "-" + fila.toString());
        
        fila.Enqueue(8);
        System.out.println("\nFront:" + fila.front() + "-" + fila.toString());
        
        //fila.Enqueue(10);
        //System.out.println("\nFront:" + fila.front() + "-" + fila.toString());
        
        fila.Dequeue();
        System.out.println("\nFront:" + fila.front() + "-" + fila.toString());
        
        if (!fila.isQueueEmpty()){
            fila.Dequeue();
        }else{
            System.out.println("Não é possivel excluir");
        }
    }
    
    public static class QueueArray { 

     

        /* Member variable declaration */   

        private int maxSize;   

        private int[] queueArray;   

        private int front;   

        private int rear;   

        private int currentSize;   

        /* Constructor */   

        public QueueArray(int tam)   

        {   

          this.maxSize = tam;   

          this.queueArray = new int[tam];   

          front = 0;   

          rear = -1;   

          currentSize = 0;   

        }   

        /* Queue:Insere */   

        public void Enqueue(int item)   

        {   

          /* Checks whether the queue is full or not */   

          if(isQueueFull())   

          {   

            System.out.println("Queue está cheia!");   

            return;   

          }   

          if(rear == maxSize - 1)   

          {   

            rear = -1;  

          }   

          else if (rear == -1) front =0; 

          /* increment rear then insert element to queue */   

          queueArray[++rear] = item;   

          currentSize++;   

          System.out.println("Item add na fila (queue) : " + item);   

        }   

        /* Queue:Delete Operation */     

        public int Dequeue()   

        {   

          /* Checks whether the queue is empty or not */   

          if(isQueueEmpty())   

          {   

            throw new RuntimeException("Queue está vazia");  

            //return -1; 

          }   

          /* retrieve queue element then increment */   

          int temp = queueArray[front]; 

          for (int i = 0; i < currentSize; i++){ 

              queueArray[i] = queueArray[i+1];  

          }   

          rear--; 

          if(rear == -1)   

          {   

            front = -1;   

          } 

          currentSize--;   

          return temp;   

        }   

        /* Queue:Peek Operation */       

        public int front()   

        { if (front == -1) return -1;   

          return queueArray[front];   

        }   

        /* Queue:isFull Operation */    

        public boolean isQueueFull()   

        {   

          return (maxSize == currentSize);   

        }       

        /* Queue:isEmpty Operation */    

        public boolean isQueueEmpty()   

      {   

          return (currentSize == 0);   

        }   

        @Override 

        public String toString() { 

          return "Fila: " + Arrays.toString(queueArray); 

        } 


          }
}