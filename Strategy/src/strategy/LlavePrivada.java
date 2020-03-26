/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategy;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

/**
 *
 * @author DiegoCortazar
 */
public class LlavePrivada implements ICiframiento {

    @Override
    public void cifrar(String msg) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
        String plainText = msg;
        String algorithm = "AES";
        Cipher cipher = Cipher.getInstance(algorithm);

        KeyGenerator keyGenerator = KeyGenerator.getInstance(algorithm);
        keyGenerator.init(256);
        SecretKey secretKey = keyGenerator.generateKey();
        
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);
        byte[] encrypText = cipher.doFinal(plainText.getBytes());

        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        byte[] decrypText = cipher.doFinal(encrypText);
        
        //String encodedEncText = javax.xml.bind.DatatypeConverter.printBase64Binary(encrypText);
        System.out.println("Encrypted text: " + new String(encrypText));
        //System.out.println("Encrypted and encoded text: " + encodedEncText);
        System.out.println("Decrypted text: " + new String(decrypText));

    }
}
