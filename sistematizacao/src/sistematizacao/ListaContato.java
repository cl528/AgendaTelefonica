package sistematizacao;

public class ListaContato {
    public static final String Contato = null;
	private static Node head; 
    
    public static void addContato(Contato contato) {
        Node newNode = new Node(contato); 
        if (head == null) { 
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) { 
                temp = temp.next;
            }
            temp.next = newNode; 
        }
        System.out.println("Contato adicionado com sucesso!");
    }

    public Contato searchContact(String nameOrPhone) {
        Node temp = head;
        while (temp != null) { 
            if (temp.contato.getName().equals(nameOrPhone) || temp.contato.getPhoneNumber().equals(nameOrPhone)) {
                return temp.contato;
            }
            temp = temp.next;
        }
        return null;
    }

    public boolean removeContato(String nameOrPhone) {
        if (head == null) {
            return false;
        }

        if (head.contato.getName().equals(nameOrPhone) || head.contato.getPhoneNumber().equals(nameOrPhone)) {
            head = head.next; 
            return true;
        }

        Node temp = head;
        while (temp.next != null) {
            if (temp.next.contato.getName().equals(nameOrPhone) || temp.next.contato.getPhoneNumber().equals(nameOrPhone)) {
                temp.next = temp.next.next; 
                return true;
            }
            temp = temp.next; 
        }
        return false; 
    }

    public void ListarContatos() {
        if (head == null) {
            System.out.println("Nenhum contato na lista.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.println(temp.contato); 
            temp = temp.next; 
        }
    }
}
