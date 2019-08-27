class Ex8_12 {
	public static void main(String[] args) {
		try  {
			method1();		
		} catch (Exception e)	{
			System.out.println("main메서드에서 예외가 처리되었습니다.");
		}
	}	// main메서드의 끝

	static void method1() throws Exception {
		try {
			throw new Exception();
		} catch (Exception e) {
			System.out.println("method1메서드에서 예외가 처리되었습니다.");
			throw e;			// 다시 예외를 발생시킨다.
		}
	}	// method1메서드의 끝
}