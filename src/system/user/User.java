package system.user;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private static int numberOfClients = 0;

    public User(String name, String email, String password){
        this.id = numberOfClients++;
        this.name = name;
        this.email = email;
        this.password = password;
    }
}