package com.core.java8.JavaAES256;

import java.security.NoSuchAlgorithmException;
import java.util.Base64;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

public class AES256Encryption {

	public static void main(String[] args) throws NoSuchAlgorithmException {

		KeyGenerator AES256keyGenrator = KeyGenerator.getInstance("AES");
		AES256keyGenrator.init(256);// 128bits, 192bits, 256bits 
		/**
		 * 
		 * No, 512 bits is not a valid key length for AES (Advanced Encryption Standard). AES supports only three key lengths:

128 bits (16 bytes)
192 bits (24 bytes)
256 bits (32 bytes)
These key lengths are standardized and ensure the security and efficiency of the AES encryption process. Using a key length outside these values will result in an InvalidKeyException

		 */
		SecretKey secretKeyByAES256 = AES256keyGenrator.generateKey();
		byte[] secretKeyByAES256ByteArray = secretKeyByAES256.getEncoded();
		String secretKeyByAES256ByteArrayTOString = Base64.getEncoder().encodeToString(secretKeyByAES256ByteArray);
		System.out.println(secretKeyByAES256ByteArrayTOString);

	}

}
