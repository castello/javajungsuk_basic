import java.io.*;
import java.util.ArrayList;

public class Ex15_21 {
	public static void main(String[] args) {
		try {
			String fileName = "UserInfo.ser";
			FileInputStream     fis = new FileInputStream(fileName);
			BufferedInputStream bis = new BufferedInputStream(fis);

			ObjectInputStream in = new ObjectInputStream(bis);

			// 객체를 읽을 때는 출력한 순서와 일치해야한다.
			UserInfo u1 = (UserInfo)in.readObject();
			UserInfo u2 = (UserInfo)in.readObject();
			ArrayList list = (ArrayList)in.readObject();

			System.out.println(u1);
			System.out.println(u2);
			System.out.println(list);
			in.close();
		} catch(Exception e) {
			e.printStackTrace();
		}
	} // main
} // class