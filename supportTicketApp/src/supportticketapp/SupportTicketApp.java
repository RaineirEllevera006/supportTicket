package supportticketapp;

class Ticket {
    String id;
    String name;
    String issue;

    Ticket(String id, String name, String issue) {
        this.id = id;
        this.name = name;
        this.issue = issue;
    }
}

class Node {
    Ticket data;
    Node next;

    Node(Ticket data) {
        this.data = data;
        this.next = null;
    }
}

class TicketQueue {
    private Node front = null;
    private Node rear = null;
    private int size = 0;

   int size() {
        return size;
    }

    boolean isEmpty() {
        return size == 0;
    }

    void enqueue(Ticket t) {
        Node newNode = new Node(t);
        if (rear == null) {           
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;    
            rear = newNode;         
        }
        size++;
    }

    
    
public class SupportTicketApp {
    
    public static void main(String[] args) {
    
    }
    
}
}