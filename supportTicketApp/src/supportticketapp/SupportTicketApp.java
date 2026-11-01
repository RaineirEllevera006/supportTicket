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


}
    
    
public class SupportTicketApp {
    
    public static void main(String[] args) {
    
    }
    
}
