/*********************************************************
 * Author: Vishmi Kalansooriya Date: 24th August 2021 Purpose: to see how the
 * call stack works.
 *********************************************************************************************************/
class Activity4 {
    static DSAStack d1 = new DSAStack(10);

    public static void main(String args[]) throws Exception {
        factorial(5);
        calVolume(8);

    }

    public static int factorial(int pNumber) throws Exception {

        d1.push("factorial()");
        int output = 1;

        if (pNumber < 0) {

            throw new IllegalArgumentException(" \n The input cannot be negative"); // gives an error when a negative

        } else if (pNumber == 0) // The base case
        {

            output = 1;

        } else {

            output = pNumber * factorial(pNumber - 1);
            for (int i = 0; i == pNumber; i++) {
                d1.push("factorial()");
            }
            for (int i = 0; i == pNumber; i++) {
                System.out.println(d1.pop());
            }
        }
        d1.peek();
        System.out.println(d1.pop());

        return output;
    }

    public static int calArea(int length) throws Exception {
        d1.push("calArea()");
        int area = 0;
        area = length * length;
        System.out.println();
        d1.peek();
        System.out.println(d1.pop());

        return area;

    }

    public static int calVolume(int plength) throws Exception {
        d1.push("calVolume()");
        int volume = 0;
        volume = calArea(plength) * plength;
        d1.peek();
        System.out.println(d1.pop());
        return volume;

    }

}
