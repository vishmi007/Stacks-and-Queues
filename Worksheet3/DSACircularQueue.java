
/*********************************************************
 * Author: Vishmi Kalansooriya                               
 * Date:  24th August 2021                                    
 * Purpose: Implementing the Circular queue.                  
 *********************************************************************************************************/

import java.util.*;

class DSACircularQueue extends DSAQueueShuffling {

    public DSACircularQueue(int pMaximumCapacity) {

        super(pMaximumCapacity);

    }

    /*********************************************************************
     * Name- isFull Date 24/08/2021 import - NOne Export - (rear == maximumCapacity
     * - 1) purpose - to see whether the Queue is Full.
     *********************************************************************/
    public boolean isFull() {
        return (count == maximumCapacity);

    }

    /*********************************************************************
     * Name- enQueue Date 24/08/2021 import - pass (Object) Export - None purpose -
     * to insert data into the Queue
     *********************************************************************/
    public void enQueue(Object pass) throws Exception {
        if (isFull()) {
            throw new Exception("Sorry the stack is full"); // Throw an exception if the stack is full
        } else {
            if (rear == maximumCapacity - 1)
                rear = -1;
            rear++;
            queueArray[rear] = pass;
            count++;
        }

    }

    /*********************************************************************
     * Name- deQueue Date 24/08/2021 import - pass (Object) Export - topValue
     * purpose - to remove data into the Queue
     *********************************************************************/
    public Object deQueue() throws Exception {
        Object topValue = 0;
        if (isEmpty()) {
            throw new Exception("Sorry the stack is empty");
        } else {

            topValue = queueArray[front];
            front++;
            // If the front has reached the maximum capacity assign it to 0
            if (front == maximumCapacity) {
                front = 0;
            }
            count--;
        }

        return topValue;
    }

}
