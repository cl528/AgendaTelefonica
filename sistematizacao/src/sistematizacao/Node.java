package sistematizacao;

public class Node {
    Contato contato;
    Node next;

    public Node(Contato contato) {
        this.contato = contato;
        this.next = null;
    }
}
