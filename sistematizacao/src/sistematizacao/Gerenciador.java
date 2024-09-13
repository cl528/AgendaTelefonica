package sistematizacao;

import java.util.Scanner;

public class Gerenciador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        ListaContato listacontato = new ListaContato(); 

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Adicionar contato");
            System.out.println("2. Buscar contato");
            System.out.println("3. Remover contato");
            System.out.println("4. Listar todos os contatos");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1: 
                    System.out.print("Nome: ");
                    String name = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String phone = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    ListaContato.addContato(new Contato(name, phone, email));  
                    break;

                case 2: 
                    System.out.print("Nome ou Telefone para busca: ");
                    String search = scanner.nextLine();
                    Contato found = listacontato.searchContact(search);
                    if (found != null) {
                        System.out.println("Contato encontrado: " + found);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 3: 
                    System.out.print("Nome ou Telefone para remover: ");
                    String remove = scanner.nextLine();
                    boolean removed = listacontato.removeContato(remove);
                    if (removed) {
                        System.out.println("Contato removido com sucesso!");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 4: 
                    System.out.println("Lista de Contatos:");
                    listacontato.ListarContatos();
                    break;

                case 5: 
                    System.out.println("Saindo...");
                    scanner.close();
                    return;

                default: 
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
