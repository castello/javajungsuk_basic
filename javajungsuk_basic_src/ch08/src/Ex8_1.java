class Ex8_1 {
	public static void main(String args[]) {
			System.out.println(1);			
			try {
				System.out.println(2);
				System.out.println(3);
			} catch (Exception e)    {
				System.out.println(4);  // 실행되지 않는다.
			} // try-catch의 끝
			System.out.println(5);
	}
}