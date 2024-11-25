package system.user.client;

public class Client extends User{
    private String endereco;
    private String historicoCompras;

    public Client(){

    }

    public Client(String nome, String email, String password){
        super(nome, email, password);
    }
}