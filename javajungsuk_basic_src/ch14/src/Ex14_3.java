import java.util.function.*;

class Ex14_3 {
	public static void main(String[] args) {
		Function<String, Integer>	f  = (s) -> Integer.parseInt(s, 16);
		Function<Integer, String>	g  = (i) -> Integer.toBinaryString(i);

		Function<String, String>    h  = f.andThen(g);
		Function<Integer, Integer>  h2 = f.compose(g);

		System.out.println(h.apply("FF")); // "FF" → 255 → "11111111"
		System.out.println(h2.apply(2));   // 2 → "10" → 16

		Function<String, String> f2 = x -> x; // 항등 함수(identity function)
		System.out.println(f2.apply("AAA"));  // AAA가 그대로 출력됨

		Predicate<Integer> p = i -> i < 100;
		Predicate<Integer> q = i -> i < 200;
		Predicate<Integer> r = i -> i%2 == 0;
		Predicate<Integer> notP = p.negate(); // i >= 100

		Predicate<Integer> all = notP.and(q.or(r));
		System.out.println(all.test(150));       // true

		String str1 = "abc";
		String str2 = "abc";
		
		// str1과 str2가 같은지 비교한 결과를 반환
		Predicate<String> p2 = Predicate.isEqual(str1); 
		boolean result = p2.test(str2);   
		System.out.println(result);
	}
}