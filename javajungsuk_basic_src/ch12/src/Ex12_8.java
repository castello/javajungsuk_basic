import java.lang.annotation.*;

@Deprecated
@SuppressWarnings("1111") // 유효하지 않은 애너테이션은 무시된다.
@TestInfo(testedBy="aaa", testDate=@DateTime(yymmdd="160101",hhmmss="235959"))
class Ex12_8 {
	public static void main(String args[]) {
		// Ex12_8의 Class객체를 얻는다.
		Class<Ex12_8> cls = Ex12_8.class;

		TestInfo anno = cls.getAnnotation(TestInfo.class);
		System.out.println("anno.testedBy()="+anno.testedBy());
		System.out.println("anno.testDate().yymmdd()=" +anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss()=" +anno.testDate().hhmmss());

		for(String str : anno.testTools())
			System.out.println("testTools="+str);

		System.out.println();

		// Ex12_8에 적용된 모든 애너테이션을 가져온다.
		Annotation[] annoArr = cls.getAnnotations();

		for(Annotation a : annoArr)
			System.out.println(a);
	} // main의 끝
}

@Retention(RetentionPolicy.RUNTIME)  // 실행 시에 사용가능하도록 지정 
@interface TestInfo {
	int       count()	  	default 1;
	String    testedBy();
	String[]  testTools() 	default "JUnit";
	TestType  testType()    default TestType.FIRST;
	DateTime  testDate();
}

@Retention(RetentionPolicy.RUNTIME)  // 실행 시에 사용가능하도록 지정
@interface DateTime {
	String yymmdd();
	String hhmmss();
}

enum TestType { FIRST, FINAL }
