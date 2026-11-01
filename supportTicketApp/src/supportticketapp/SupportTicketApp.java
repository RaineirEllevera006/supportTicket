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
    
    Ticket dequeue() {
        if (front == null) {
            return null;
        }
        Ticket t = front.data;
        front = front.next; 
        if (front == null) {        
            rear = null;
        }
        size--;
        return t;
    }

     Ticket get(int position) {
        Node current = front;
        for (int i = 0; i < position; i++) {
            current = current.next;
        }
        return current.data;
    }
     
      int search(String id) {
        Node current = front;
        int position = 0;
        while (current != null) {
            if (current.data.id.equalsIgnoreCase(id)) {
                return position;
            }
            current = current.next;
            position++;
        }
        return -1;
    }
      
      
}   

public class SupportTicketApp extends javax.swing.JFrame {

    TicketQueue queue = new TicketQueue();

    javax.swing.JTextField idField = new javax.swing.JTextField();
    javax.swing.JTextField nameField = new javax.swing.JTextField();
    javax.swing.JTextField issueField = new javax.swing.JTextField();
    javax.swing.JTextField searchField = new javax.swing.JTextField();

 
    javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(
            new String[]{"Position", "Ticket ID", "Name", "Issue"}, 0) {
        public boolean isCellEditable(int row, int col) {
            return false;
        }
    };
    javax.swing.JTable table = new javax.swing.JTable(model);

    javax.swing.JLabel message = new javax.swing.JLabel("Register a ticket to begin.");

}


public class SupportTicketApp {
    
    public static void main(String[] args) {
    
    }
    
}