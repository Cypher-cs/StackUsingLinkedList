/*   Created by IntelliJ IDEA.
 *   Author: Prajjwal Pachauri (cypher)
 *   Date: 19-02-2021
 *   Time: 7:47 PM
 *   File: MyLinkedList.java
 */

package implementation;

import myinterface.StackADT;

public class MyStack implements StackADT {
        private Node top;
        private int size;

    public MyStack() {
        top = null;
        size = 0;
    }

    @Override
    public void push(int element) {
        Node node = new Node(element);
        node.setNext(top);
        top = node;
        size++;
    }

    @Override
    public int pop() {
        int response = 0;
        if (!isEmpty()) {
            response = top.getData();
            top = top.getNext();
            size--;
        }
        else {
            System.out.println("Stack UnderFlow");
        }
        return response;
    }

    @Override
    public int peek() {
        int response = 0;
        if (!isEmpty()) {
            response = top.getData();
        }
        else {
            System.out.println("Stack is Empty...");
        }
        return response;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void traverse() {
        Node temp = top;
        while (temp != null) {
            System.out.print(temp.getData() + ", ");
            temp = temp.getNext();
        }
        System.out.println();
    }

    @Override
    public int sizeByTraversing() {
        return 0;
    }
}
