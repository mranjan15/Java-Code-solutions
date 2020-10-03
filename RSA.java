import java.math.BigInteger;
 
import java.util.Random;
 
import java.io.*;
 
public class Main {
 
	public BigInteger p;
 
	public BigInteger q;
 
	public BigInteger N;
 
	public BigInteger phi;
 
	public BigInteger e;
 
	public BigInteger d;
 
	public int bitlength = 1024;
 
	public int blocksize = 256;
 
	//blocksize in byte
 
	private Random r;
 
	public Main() {
 
		r = new Random();
 
		p = BigInteger.probablePrime(bitlength, r);
 
		q = BigInteger.probablePrime(bitlength, r);
 
		N = p.multiply(q);
 
		phi = p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE));
 
		e = BigInteger.probablePrime(bitlength/2, r);
 
		while (phi.gcd(e).compareTo(BigInteger.ONE) > 0 && e.compareTo(phi) < 0 ) {
 
			e.add(BigInteger.ONE);
 
		}
 
		d = e.modInverse(phi);
 
	}
 
	public Main(BigInteger e, BigInteger d, BigInteger N) {
 
		this.e = e;
 
		this.d = d;
 
		this.N = N;
 
	}
 
	public static void main (String[] args) throws IOException {
 
		Main rsa = new Main();
 
		DataInputStream in=new DataInputStream(System.in);
 
		String teststring ;
 
		System.out.println("Enter the plain text:");
 
		teststring=in.readLine();
		//System.out.println("P="+p+"Q="+q+"N="+n);
 
		System.out.println("Encrypting String: " + teststring);
 
		System.out.println("String in Bytes: " + bytesToString(teststring.getBytes()));
 
		// encrypt
 
		byte[] encrypted = rsa.encrypt(teststring.getBytes());
 
		System.out.println("Encrypted String in Bytes: " + bytesToString(encrypted));
 
		// decrypt
 
		byte[] decrypted = rsa.decrypt(encrypted);
 
		System.out.println("Decrypted String in Bytes: " +  bytesToString(decrypted));
 
		System.out.println("Decrypted String: " + new String(decrypted));
 
	}
 
	private static String bytesToString(byte[] encrypted) {
 
		String test = "";
 
		for (byte b : encrypted) {
 
			test += Byte.toString(b);
 
		}
 
		return test;
 
	}
 
	//Encrypt message
 
	public byte[] encrypt(byte[] message) {
 
		return (new BigInteger(message)).modPow(e, N).toByteArray();
 
	}
 
	// Decrypt message
 
	public byte[] decrypt(byte[] message) {
 
		return (new BigInteger(message)).modPow(d, N).toByteArray();
 
	}
 
}

