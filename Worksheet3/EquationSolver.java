
/*********************************************************
 * Author: Vishmi Kalansooriya                               
 * Date:  24th August 2021                                    
 * Purpose: to solve an expression using postFix methods.                   
 *********************************************************************************************************/
import java.util.*;

class EquationSolver {

    public static void main(String args[]) throws Exception {
        String expression = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the expression that you want to solve.");
        expression = sc.nextLine();
        String output = parseInfixToPostfix(expression);
        System.out.println(evaluatePostFix(output));

    }

    /*********************************************************************
     * Name- parseInfixToPostfix Date 24/08/2021 import - pExpression(String)
     * Export- output(String) purpose - To covert from inFix to PostFix
     *********************************************************************/
    private static String parseInfixToPostfix(String pExpression) throws Exception {

        Stack<Character> s = new Stack<>();
        char temp = 'a';
        String output = "";

        for (int i = 0; i < pExpression.length(); i++) {

            temp = pExpression.charAt(i);
            if (Character.isLetterOrDigit(temp)) {
                output += temp;
            } else if (temp == '(') {
                s.push(temp);
            } else if (temp == ')') {
                while (!s.isEmpty() && s.peek() != '(') {
                    output += s.pop();

                }
                if (s.isEmpty()) {
                    throw new Exception("Sorry ! The expression is not valid.");
                } else {
                    s.pop();
                }
            } else {
                while (!s.isEmpty() && precedenceOf(temp) <= precedenceOf(s.peek())) {
                    output += s.pop();
                }
                s.push(temp);
            }

        }

        while (!s.isEmpty()) {
            output += s.pop();
        }
        s.push(temp);

        return output;

    }

    /*********************************************************************
     * Name- precedenceOf Date 24/08/2021 import - passC (char) Export- returnValue
     * purpose - To value the operators.
     *********************************************************************/
    public static int precedenceOf(char passC) {
        int returnValue = 0;
        switch (passC) {

            case '+':
            case '-':
                returnValue = 1;
                break;

            case '*':
            case '/':
                returnValue = 2;
                break;
        }

        return returnValue;
    }

    /*********************************************************************
     * Name- evaluatePostFix Date 24/08/2021 import - postExpression(String) Export-
     * output(String) purpose - To evaluate the answer using PostFix
     *********************************************************************/
    public static int evaluatePostFix(String postExpression) throws Exception {
        Stack<Integer> eP = new Stack<>();

        for (int i = 0; i < postExpression.length(); i++) /* loop to scan all elements of the expression one by one */
        {
            char c = postExpression.charAt(i);

            // If the scanned character is an operand (number here),
            // push it to the stack.
            if (Character.isDigit(c))
                eP.push(c - '0');

            // If the scanned character is an operator, pop two
            // elements from stack apply the operator
            else {
                int value1 = eP.pop();
                int value2 = eP.pop();
                switch (c) {
                    case '+':
                        eP.push(value1 + value2);
                        break;

                    case '-':
                        eP.push(value2 - value1);
                        break;

                    case '*':
                        eP.push(value2 * value1);
                        break;
                    case '/':
                        eP.push(value2 / value1);
                        break;
                }
            }
        }
        return eP.pop(); // result return
    }

}
