package system.user;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

private enum Type{
    Client, administrator;
}

public class User {
    private int id;
    private String name;
    private String email;
    private String password;
    private static int numberOfUsers = 0;
    private Type type;

    public User(){

    }

    public User(String name, String email, String password) throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeySpecException{
        this.id = numberOfUsers++;
        this.name = name;
        this.email = email;
        Hash hashedPasssword = new Hash(password);
        this.password = hashedPasssword.hashing();
    }

}