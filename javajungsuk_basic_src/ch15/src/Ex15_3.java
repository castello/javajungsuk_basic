import java.io.*;
import java.util.Arrays;

class Ex15_3 {
	public static void main(String[] args) {
		byte[] inSrc = {0,1,2,3,4,5,6,7,8,9};
		byte[] outSrc = null;
		byte[] temp = new byte[4];	// 이전 예제와 배열의 크기가 다르다.

		ByteArrayInputStream  input  = null;
		ByteArrayOutputStream output = null;

		input  = new ByteArrayInputStream(inSrc);
		output = new ByteArrayOutputStream();

		System.out.println("Input Source  :" + Arrays.toString(inSrc));

		try {
			while(input.available() > 0) {
				input.read(temp);
				output.write(temp); 

				outSrc = output.toByteArray();
				printArrays(temp, outSrc);
			}
		} catch(IOException e) {}
	} // main의 끝

	static void printArrays(byte[] temp, byte[] outSrc) {
		System.out.println("temp          :" +Arrays.toString(temp));
		System.out.println("Output Source :" +Arrays.toString(outSrc));	
	}
}