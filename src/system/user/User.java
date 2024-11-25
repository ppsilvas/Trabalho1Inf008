package system.user;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private static int numberOfClients = 0;

    public User(){

    }

    public User(String name, String email, String password) throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeySpecException{
        this.id = numberOfClients++;
        this.name = name;
        this.email = email;
        Hash hashedPasssword = new Hash(password);
        this.password = hashedPasssword.hashing();
    }

    public void login(){

    }

    public void showUser(){
        System.out.println("Nome: "+name);
        System.out.println("Email: "+email);
        System.out.println("Senha: "+password);
    }

}