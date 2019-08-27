import java.io.*;
import java.util.ArrayList;

public class Ex15_20 {
	public static void main(String[] args) {
		try {
			String fileName = "UserInfo.ser";
			FileOutputStream     fos = new FileOutputStream(fileName);
			BufferedOutputStream bos = new BufferedOutputStream(fos);

			ObjectOutputStream out = new ObjectOutputStream(bos);
			
			UserInfo u1 = new UserInfo("JavaMan","1234",30);
			UserInfo u2 = new UserInfo("JavaWoman","4321",26);

			ArrayList<UserInfo> list = new ArrayList<>();
			list.add(u1);
			list.add(u2);

			// 객체를 직렬화한다.
			out.writeObject(u1);
			out.writeObject(u2);
			out.writeObject(list);
			out.close();
			System.out.println("직렬화가 잘 끝났습니다.");
		} catch(IOException e) {
			e.printStackTrace();
		}
	} // main
} // class