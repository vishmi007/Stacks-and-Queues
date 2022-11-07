import java.util.*;

class TestHarness {
    public static void main(String args[]) throws Exception {
        testCircleQueue();
        testShufflingQueue();
        // teststack();

    }

    public static void teststack() throws Exception {
        // Testing the Stack

        DSAStack s = new DSAStack(10);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        s.push(8);
        s.push(9);
        s.push(10);

        System.out.println("The last number inserted to the Stack is " + s.peek());

        while (!s.isEmpty()) {
            System.out.println(s.pop()); // Works according to the last in First out (LIFO).
        }

        // Testing the stack Example two.
        DSAStack sd = new DSAStack(5);
        System.out.println("The second test");
        System.out.println("The Fisrt letter to go in is  : T");
        sd.push("T");
        System.out.println("The Second letter to go in is : I");
        sd.push("I");
        System.out.println(" The Third letter to go in is : I");
        sd.push("I");
        System.out.println(" The Fourth letter to go in is : L");
        sd.push("L");
        System.out.println(" The Fifth letter to go in is :  S");
        sd.push("S");

        System.out.println(" The charachters were print in reverse order as :");

        while (!sd.isEmpty()) {
            System.out.print(sd.pop()); // Works according to the last in First out (LIFO).
        }

    }

    public static void testShufflingQueue() throws Exception {
        // Testing the Shuffling Queue
        DSAQueueShuffling Qs = new DSAQueueShuffling(10);

        Qs.enQueue(1);
        Qs.enQueue(2);
        Qs.enQueue(3);
        Qs.enQueue(4);
        Qs.enQueue(5);
        Qs.enQueue(6);
        Qs.enQueue(7);
        Qs.enQueue(8);
        Qs.enQueue(9);
        Qs.enQueue(10);

        System.out.println("The First number inserted to the Stack is " + Qs.peek());

        while (!Qs.isEmpty()) {
            System.out.println(Qs.deQueue()); // Works according to the First in First out (FIFO).
        }

        // The sond Test
        System.out.println("The second Test");

        DSAQueueShuffling NQs = new DSAQueueShuffling(5);
        System.out.println("The Fisrt letter to go in is  : S");
        NQs.enQueue("S");
        System.out.println("The Second letter to go in is : L");
        NQs.enQueue("L");
        System.out.println("The Third letter to go in is : I");
        NQs.enQueue("I");
        System.out.println("The Fourth letter to go in is : I");
        NQs.enQueue("I");
        System.out.println("The Fifth letter to go in is :  T");
        NQs.enQueue("T");

        System.out.println(" The charachters were print in the same order as :");

        while (!NQs.isEmpty()) {
            System.out.print(NQs.deQueue()); // Works according to the First in First out (FIFO).
        }

    }

    public static void testCircleQueue() throws Exception {

        // Testing the Circle Queue

        System.out.println(" Entering the first 10 numbers to the queue.");
        DSACircularQueue Qc = new DSACircularQueue(10);
        System.out.println(" Entering number 1");
        Qc.enQueue(1);
        System.out.println(" Entering number 2");
        Qc.enQueue(2);
        System.out.println(" Entering number 3");
        Qc.enQueue(3);
        System.out.println(" Entering number 4");
        Qc.enQueue(4);
        System.out.println(" Entering number 5");
        Qc.enQueue(5);
        System.out.println(" Entering number 6");
        Qc.enQueue(6);
        System.out.println(" Entering number 7");
        Qc.enQueue(7);
        System.out.println(" Entering number 8");
        Qc.enQueue(8);
        System.out.println(" Entering number 9");
        Qc.enQueue(9);
        System.out.println(" Entering number 10");
        Qc.enQueue(10);

        System.out.println("Removing the first 5 numbers from the Queue");
        for (int i = 0; i < 5; i++) {
            System.out.println(Qc.deQueue());
        }
        System.out.println(" Entering number 11");
        Qc.enQueue(11);
        System.out.println(" Entering number 12");
        Qc.enQueue(12);
        System.out.println(" Entering number 13");
        Qc.enQueue(13);
        System.out.println(" Entering number 14");
        Qc.enQueue(14);
        System.out.println(" Entering number 15");
        Qc.enQueue(15);

        while (!Qc.isEmpty()) {
            System.out.println(Qc.deQueue());
        }

    }
}
