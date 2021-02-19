/*   Created by IntelliJ IDEA.
 *   Author: Prajjwal Pachauri (cypher)
 *   Date: 19-02-2021
 *   Time: 7:45 PM
 *   File: Node.java
 */

package implementation;

public class Node {
    private int data;
    private Node next;

    public Node(int data) {
        this.data = data;
        next =null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
