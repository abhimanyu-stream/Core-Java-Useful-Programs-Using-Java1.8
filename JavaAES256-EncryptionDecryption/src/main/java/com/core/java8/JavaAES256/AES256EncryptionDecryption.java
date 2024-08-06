package com.core.java8.JavaAES256;

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

public class AES256EncryptionDecryption {
	
	
	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, IllegalBlockSizeException, BadPaddingException {
		// 1.
		KeyGenerator AES256keyGenrator = KeyGenerator.getInstance("AES");
		AES256keyGenrator.init(256);// 128bits
		SecretKey secretKeyByAES256 = AES256keyGenrator.generateKey();
		byte[] secretKeyByAES256ByteArray = secretKeyByAES256.getEncoded();
		String secretKeyByAES256ByteArrayTOString = Base64.getEncoder().encodeToString(secretKeyByAES256ByteArray);
		System.out.println(secretKeyByAES256ByteArrayTOString);
		
		// 2. Encryption Data process
		
		Cipher encryptionCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
		
		IvParameterSpec ivParameterSpec = new IvParameterSpec(new byte[16]);
		
		encryptionCipher.init(Cipher.ENCRYPT_MODE,secretKeyByAES256,ivParameterSpec);
		String userString = "Java8SpringBootSpringFrameworkJPA";
        byte[] encryptedDataBytesArray = encryptionCipher.doFinal(userString.getBytes());
        String encryptedDataBytesArrayToString = Base64.getEncoder().encodeToString(encryptedDataBytesArray);
        System.out.println("Encrypted Data using AES256 is = " + encryptedDataBytesArrayToString);
        
      // 3. Decryption Data process
        Cipher decryptionCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
        decryptionCipher.init(Cipher.DECRYPT_MODE,secretKeyByAES256,ivParameterSpec);
        byte[] decryptedDataBytesArray = decryptionCipher.doFinal(encryptedDataBytesArray);
        String decryptedDataBytesArrayToString = new String(decryptedDataBytesArray);
        System.out.println("Decrypted Data using AES256 is " + decryptedDataBytesArrayToString);
	}

}
