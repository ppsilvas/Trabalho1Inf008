package system.user;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.KeyStore.SecretKeyEntry;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Hash {
    private String password;
    SecureRandom random = new SecureRandom();
    byte[] salt = new byte[16];

    public Hash(String password) {
        this.password = password;
    }

    public String hashing() throws NoSuchAlgorithmException, UnsupportedEncodingException, InvalidKeySpecException{
        KeySpec spec = new PBEKeySpec(password.toCharArray(), salt, 65536, 128);
        SecretKeyFactory factory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
        byte[] hash = factory.generateSecret(spec).getEncoded();

        StringBuilder hexString = new StringBuilder();
        for(byte b: hash){
            hexString.append(String.format("%02X", 0XFF & b));
        }
        String hashed = hexString.toString();
        return hashed;  
    //    MessageDigest algorithm = MessageDigest.getInstance("MD5");
    //    byte messageDigest[] = algorithm.digest(password.getBytes("UTF-8"));

    //     return messageDigest;
    }
}
