package com.core.java8.AES;

import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AESEncryption {
	
	public static void main(String[] args) throws NoSuchAlgorithmException {
		
		KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
		SecretKey secretKeyByAES = keyGenerator.generateKey();
		System.out.println("" + secretKeyByAES);
		
		String secretKeyString = Base64.getEncoder().encodeToString(secretKeyByAES.getEncoded());
		System.out.println(secretKeyString);
	}

}
