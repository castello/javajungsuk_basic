import java.io.*;

class FileCopy {
	public static void main(String args[]) {
		try {
			FileInputStream  fis = new FileInputStream(args[0]);
			FileOutputStream fos = new FileOutputStream(args[1]);

			int data =0;
			while((data=fis.read())!=-1)
				fos.write(data);	 // void write(int b)

			fis.close();
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();		
		}
	}
}