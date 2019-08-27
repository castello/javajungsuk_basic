import java.net.*;
import java.io.*;

public class Ex16_5 {
	public static void  main(String args[]) {
		URL url = null;
		InputStream in = null;
		FileOutputStream out = null;
	    String address = "http://www.codechobo.com/book/src/javabasic_src.zip";

		int ch = 0;

		try {
			url = new URL(address);
			in = url.openStream();
			out = new FileOutputStream("javabasic_src.zip");

			while((ch=in.read()) !=-1) {
				out.write(ch);
			}
			in.close();
			out.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	} // main
}