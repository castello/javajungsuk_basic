import java.util.*;

class Ex4_20 {
	public static void main(String[] args) { 
		int menu = 0, num  = 0;
		Scanner scanner = new Scanner(System.in);

		outer:   // while문에 outer라는 이름을 붙인다. 
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.print("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");

			String tmp = scanner.nextLine(); // 화면에서 입력받은 내용을 tmp에 저장
			menu = Integer.parseInt(tmp);    // 입력받은 문자열(tmp)을 숫자로 변환

			if(menu==0) {  
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (!(1<= menu && menu <= 3)) {
				System.out.println("메뉴를 잘못 선택하셨습니다.(종료는 0)");
				continue;		
			}

			for(;;) {
		      System.out.print("계산할 값을 입력하세요.(계산 종료:0, 전체 종료:99)>");
				tmp = scanner.nextLine();    // 화면에서 입력받은 내용을 tmp에 저장
				num = Integer.parseInt(tmp); // 입력받은 문자열(tmp)을 숫자로 변환

				if(num==0)  
					break;        // 계산 종료. for문을 벗어난다.

				if(num==99) 
					break outer;  // 전체 종료. for문과 while문을 모두 벗어난다.

				switch(menu) {
					case 1: 
						System.out.println("result="+ num*num);		
						break;
					case 2: 
						System.out.println("result="+ Math.sqrt(num)); 
						break;
					case 3: 
						System.out.println("result="+ Math.log(num));  
						break;
				} 
			} // for(;;)
		} // while의 끝
	} // main의 끝
}