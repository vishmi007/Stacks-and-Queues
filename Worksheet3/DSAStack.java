
/*********************************************************
 * Author: Vishmi Kalansooriya                               
 * Date:  24th August 2021                                    
 * Purpose: Implementing the stack class.                   
 *********************************************************************************************************/
import java.util.*;

class DSAStack {
    // class Fields
    private Object[] stackArray;
    private int maximumCapacity;
    private int count;

    // parameter cunstructor
    public DSAStack(int pmaximumCapacity) {
        maximumCapacity = pmaximumCapacity;
        stackArray = new Object[maximumCapacity];
        count = -1;

    }

    // Getters
    public int getCount() {
        return count;
    }

    /*********************************************************************
     * Name- isFull Date 24/08/2021 import - NOne Export - (count == maximumCapacity
     * - 1) purpose - to see whether the stack is Full.
     ***********************************************************************/
    public boolean isFull() {
        return (count == maximumCapacity - 1); // If the top is equal to the stack length it is full.
    }

    /*********************************************************************
     * Name- isEmpty Date 24/08/2021 import - NOne Export - (count == - 1) purpose -
     * to see whether the stack is Empty.
     ***********************************************************************/
    public boolean isEmpty() {
        return (count == -1); // If the top (index is equal to -1) the stack is Empty NOTE: its all about the
                              // index. 0 is the first index

    }

    /*********************************************************************
     * Name- push Date 24/08/2021 import - pass (Object) Export - None purpose - to
     * insert data into the stack
     *********************************************************************/
    public void push(Object pass) throws Exception {
        if (isFull()) {
            throw new Exception("Sorry the stack is full"); // Throw an exception if the stack is full
        } else {
            count++;
            stackArray[count] = pass;
        }

    }

    /*********************************************************************
     * Name- push Date 24/08/2021 import - pass (Object) Export - None purpose - to
     * return data from the stack
     *********************************************************************/
    public Object pop() throws Exception {
        Object topValue = 0;
        if (isEmpty()) {
            throw new Exception("Sorry the stack is empty"); // Throw an exception if the stack is empty
        } else {
            topValue = stackArray[count];
            count--;
        }
        return topValue;
    }

    /*********************************************************************
     * Name- peek Date 24/08/2021 import - pass (Object) Export - None purpose - to
     * have a look at the data in the stack.
     *********************************************************************/
    public Object peek() throws Exception {
        Object topValue = 0;
        if (isEmpty()) {
            throw new Exception("Sorry the stack is empty"); // Throw an exception if the stack is empty
        } else {
            topValue = stackArray[count];

        }
        return topValue;

    }

}