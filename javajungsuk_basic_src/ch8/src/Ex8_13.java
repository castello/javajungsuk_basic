class Ex8_13 {
	public static void main(String args[]) {
		try {
			install();
		} catch(InstallException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();		
		}
	} // main의 끝

	static void install() throws InstallException {
		try {
			startInstall();		// 프로그램 설치에 필요한 준비를 한다.
			copyFiles();		// 파일들을 복사한다. 
		} catch (SpaceException2 e)	{
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(e);
			throw ie;
		} catch (MemoryException2 me) {
			InstallException ie = new InstallException("설치 중 예외발생");
			ie.initCause(me);
			throw ie;
		} finally {
			deleteTempFiles();		// 프로그램 설치에 사용된 임시파일들을 삭제한다.
		} // try의 끝
	}

	static void startInstall() throws SpaceException2, MemoryException2 { 
		if(!enoughSpace()) { 		// 충분한 설치 공간이 없으면...
			throw new SpaceException2("설치할 공간이 부족합니다.");
		}

		if (!enoughMemory()) {	// 충분한 메모리가 없으면...
			throw new MemoryException2("메모리가 부족합니다.");
//			throw new RuntimeException(new MemoryException("메모리가 부족합니다."));
		}
	} // startInstall메서드의 끝

   static void copyFiles()       { /* 파일들을 복사하는 코드를 적는다.   */ }
   static void deleteTempFiles() { /* 임시파일들을 삭제하는 코드를 적는다.*/ }
   
   static boolean enoughSpace() {
		// 설치하는데 필요한 공간이 있는지 확인하는 코드를 적는다.
		return false;
   }
   static boolean enoughMemory() {
		// 설치하는데 필요한 메모리공간이 있는지 확인하는 코드를 적는다.
		return true;
   }
} // ExceptionTest클래스의 끝

class InstallException extends Exception {
	InstallException(String msg) {
	   super(msg);	
   }
} 

class SpaceException2 extends Exception {
	SpaceException2(String msg) {
	   super(msg);	
   }
} 

class MemoryException2 extends Exception {
	MemoryException2(String msg) {
	   super(msg);	
   }
}