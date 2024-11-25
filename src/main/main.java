package main;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Scanner;

import system.user.User;

public class main {
    public static void main(String[] args) throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeySpecException{
        Scanner sc = new Scanner(System.in);
        ArrayList<User> users = new ArrayList<User>();
        for (int i = 0; i < 1; i++) {
            System.out.println("Digite seu nome: ");
            String name = sc.nextLine();
            System.out.println("Digite seu email");
            String email = sc.nextLine();
            System.out.println("Digite sua senha");
            String password = sc.nextLine();
            users.add(new User(name, email, password));
        }

        for(User user:users){
            user.showUser();
        }
    }

    // public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
    //     String senha = "admin";

    //     MessageDigest algorithim = MessageDigest.getInstance("MD5");
    //     byte[] messageDigest = algorithim.digest(senha.getBytes("UTF-8"));

    //     System.out.println(messageDigest);
    // }
}
