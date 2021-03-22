package com.company;

import com.company.twostack.Stack;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Stack<String> operator = new Stack<String>();
        Stack<Double> value = new Stack<Double>();

        Scanner scan = new Scanner(System.in);

        String[] node = scan.nextLine().split(" ");

        for(int i=0; i<node.length; i++){
            if (node[i].equals("(")){}
            else if(node[i].equals("+")) {
                operator.push(node[i]);
            }
            else if (node[i].equals("-")) {
                operator.push(node[i]);
            }
            else if (node[i].equals("*")) {
                operator.push(node[i]);
            }
            else if (node[i].equals("/")) {
                operator.push(node[i]);
            }
            else if (node[i].equals("%")) {
                operator.push(node[i]);
            }
            else if (node[i].equals(")")) {

                String oper = operator.pop();
                double val = value.pop();
                if(oper.equals("+")) {
                    val = value.pop() + val;
                }
                else if (oper.equals("-")) {
                    val = value.pop() - val;
                }
                else if (oper.equals("*")) {
                    val = value.pop() * val;
                }
                else if (oper.equals("/")) {
                    val = value.pop() / val;
                }
                else if (oper.equals("%")) {
                    val = value.pop() % val;
                }
                value.push(val);
            }
            else
            {
                value.push(Double.parseDouble(node[i]));
            }
        }
        System.out.println(value.pop());




    }
}
