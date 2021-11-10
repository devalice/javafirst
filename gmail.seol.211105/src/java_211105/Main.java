package java_211105;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Runtime rt = Runtime.getRuntime();
		Process pc = null;
		
		try {
			Runtime.getRuntime().exec("");
			
			//pc = rt.exec("notepad.exe");
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
