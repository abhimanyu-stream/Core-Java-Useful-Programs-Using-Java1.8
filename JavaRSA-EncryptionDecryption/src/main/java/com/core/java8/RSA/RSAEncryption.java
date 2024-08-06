package com.core.java8.RSA;

import java.security.InvalidKeyException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.util.Base64;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

public class RSAEncryption {

	public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, IllegalBlockSizeException, BadPaddingException {
		
		
		//KeyPairGenerator 
        //SecureRandom 
        //keyPairGenerator
        //KeyPair
        //PublicKey 
        //Base64.getEncoder()
		//PrivateKey 
		//Cipher 
		
		
		// 1.
		KeyPairGenerator rsaKeyPairGenerator = KeyPairGenerator.getInstance("RSA");
		
		// 2.
		SecureRandom secureRandom = new SecureRandom();
		rsaKeyPairGenerator.initialize(2048,secureRandom);
		KeyPair keyPair = rsaKeyPairGenerator.generateKeyPair();
		
		
		// 3.
		
		PublicKey publicKey = keyPair.getPublic();
		String publicKeyString = Base64.getEncoder().encodeToString(publicKey.getEncoded());
		System.out.println("Public Key is : "+ publicKeyString);
		
		// 4.
		
		PrivateKey privateKey = keyPair.getPrivate();
		String privateKeyString = Base64.getEncoder().encodeToString(privateKey.getEncoded());
		System.out.println("Private Key is : " + privateKeyString);
		
		// 5.
		
		Cipher encryptionCipher = Cipher.getInstance("RSA");
		encryptionCipher.init(Cipher.ENCRYPT_MODE, publicKey);
		
		// 6. userString to encrypt by PublicKey
		
		String userString = "Java8SpringBootSpringFrameworkJPA";
		byte[] encryptedByteArray = encryptionCipher.doFinal(userString.getBytes());
		String encryptedByteArrayToString = Base64.getEncoder().encodeToString(encryptedByteArray);
		System.out.println("Encrypted Data By RSA KeyPair and PublicKey : "+ encryptedByteArrayToString);
		
		// 7. decrypt Data by PrivateKey
		Cipher decryptionCipher = Cipher.getInstance("RSA");
		decryptionCipher.init(Cipher.DECRYPT_MODE, privateKey);
		byte[] decryptedByteArray = decryptionCipher.doFinal(encryptedByteArray);
		String decryptedByteArrayToString = new String(decryptedByteArray);
		System.out.println("Decrypted Data By RSA KeyPair and PrivateKey : "+ decryptedByteArrayToString);
		
	}
	

}
//https://java2blog.com/rsa-encryption-and-decryption-java/
/**
 * CAUSE :Using RSA to encrypt a large file is not a good idea. You could for example generate a random AES key, encrypt it using RSA and store it in the output file, and then encrypt the file itself with AES, which is much faster and doesn't have any problem with large inputs. The decryption would read the encrypted AES key, decrypt it, and then decrypt the rest of the file with AES.
   "The RSA algorithm can only encrypt data that has a maximum byte length of the RSA key length in bits divided with eight minus eleven padding bytes, i.e. number of maximum bytes = key length in bits / 8 - 11 "

SOLVE
if key length 2048 maximum bytes data is 245 bytes
if key length 1024 maximum bytes data is 117 bytes
 * 
 */
