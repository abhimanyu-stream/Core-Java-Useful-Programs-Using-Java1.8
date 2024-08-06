package com.core.java8.AES;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

public class AESEncryptionCipherIvParameterSpec {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		
		
		System.out.println(KeyGenerator.getInstance("AES").generateKey().getEncoded());//[B@31ef45e3  11 chars
		// step 1.
		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		SecretKey secretKey = keyGenerator.generateKey();
		String secretKeyString = Base64.getEncoder().encodeToString(secretKey.getEncoded());
		System.out.println(secretKeyString);
		
		// step 2.
		// Cipher
		
		Cipher encryptionCipher  = Cipher.getInstance("AES/CBC/PKCS5Padding");
		byte[] initVectorBytes  = keyGenerator.generateKey().getEncoded();
		
		
		// step 3.
		// IvParameterSpec
		IvParameterSpec ivParameterSpec = new IvParameterSpec(initVectorBytes);
		//Cipher.ENCRYPT_MODE
		//Cipher.DECRYPT_MODE
		//Cipher.PRIVATE_KEY
		//Cipher.PUBLIC_KEY
		//Cipher.SECRET_KEY
		//Cipher.UNWRAP_MODE
		//Cipher.WRAP_MODE
		
		encryptionCipher .init(Cipher.ENCRYPT_MODE, secretKey, ivParameterSpec);
		
		// Take a String and encrypt it using cipher
		
		String userString = "Java8SpringBootSpringFrameworkJPA";
		// Encryption
		byte[] encryptedByteArray = encryptionCipher .doFinal(userString.getBytes());
		String encryptedByteArrayToString = Base64.getEncoder().encodeToString(encryptedByteArray);
		System.out.println("encryptedByteArrayToString : " + encryptedByteArrayToString);
		
		// DEcryption
		Cipher decryptionCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        decryptionCipher.init(Cipher.DECRYPT_MODE,secretKey,ivParameterSpec);
		byte[] decryptedByteArray = decryptionCipher.doFinal(encryptedByteArray);
		
		
		String decryptedByteArrayToString = new String(decryptedByteArray);
		System.out.println("decryptedByteArrayToString : "+ decryptedByteArrayToString);
		
		

	}

}
