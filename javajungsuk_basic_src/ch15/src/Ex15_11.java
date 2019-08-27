import java.io.*;

class Ex15_11 {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("Ex15_11.java");
//    이클립스에서는 윗 줄 대신 아래 줄 입력
// 		FileReader fr = new FileReader(".\\src\\Ex15_11.java");
			BufferedReader br = new BufferedReader(fr);

			String line = "";
			for(int i=1;(line = br.readLine())!=null;i++) { 
				//  ";"를 포함한 라인을 출력한다.
				if(line.indexOf(";")!=-1)	
					 System.out.println(i+":"+line);
			}
                     
			br.close();
		} catch(IOException e) {}
	} // main
}