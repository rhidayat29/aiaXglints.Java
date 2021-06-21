package encodeDecode;

import java.util.Base64;

public class Main {

	//	public static void main(String[] args) throws Exception {
	////		Base64.Encoder encoder = Base64.getEncoder();  
	////		// Encoding string  
	////		String str = encoder.encodeToString("JavaTpoint".getBytes());  
	////		System.out.println("Encoded string: "+str);  
	////		// Getting decoder  
	////		Base64.Decoder decoder = Base64.getDecoder();  
	////		// Decoding string  
	////		String dStr = new String(decoder.decode(str));  
	////		System.out.println("Decoded string: "+dStr);  
	//		
	//		String pass = "aceng";
	//		
	//		
	//		Encode(pass);
	//		
	//		String unpass = Encode(pass);
	//		Decode(unpass);
	//	}

	public static String Encode(String code) {
		Base64.Encoder encoder = Base64.getEncoder();  
		// Encoding string  
		String str = encoder.encodeToString(code.getBytes());  
		System.out.println("Encoded password: "+str);  
		return str;

	}

	public static String Decode(String decode) {
		Base64.Decoder decoder = Base64.getDecoder();  
		// Decoding string  
		String dStr = new String(decoder.decode(decode));  
		System.out.println("Decoded password: "+dStr);  
		return dStr;
	}
}