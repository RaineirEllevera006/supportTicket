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

public class SupportTicketApp {
    
    public static void main(String[] args) {
    
    }
    
}
