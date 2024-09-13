package sistematizacao;

public class Contato {
    private String name;
    private String phoneNumber;
    private String email;

    public Contato(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Nome: " + name + ", Telefone: " + phoneNumber + ", Email: " + email;
    }
