class Ex9_15 {
	public static void main(String[] args) {
		int		i  = new Integer("100").intValue();
		int		i2 = Integer.parseInt("100");
		Integer  i3 = Integer.valueOf("100");

		int i4 = Integer.parseInt("100",2);
		int i5 = Integer.parseInt("100",8);
		int i6 = Integer.parseInt("100",16);
		int i7 = Integer.parseInt("FF", 16);
//		int i8 = Integer.parseInt("FF");     // NumberFormatException발생

		Integer i9 = Integer.valueOf("100",2);
		Integer i10 = Integer.valueOf("100",8);
		Integer i11 = Integer.valueOf("100",16);
		Integer i12 = Integer.valueOf("FF",16);
//		Integer i13 = Integer.valueOf("FF"); // NumberFormatException발생

		System.out.println(i);
		System.out.println(i2);
		System.out.println(i3);
		System.out.println("100(2) -> "+i4);
		System.out.println("100(8) -> "+i5);
		System.out.println("100(16)-> "+i6);
		System.out.println("FF(16) -> "+i7);

		System.out.println("100(2) -> "+i9);
		System.out.println("100(8) -> "+i10);
		System.out.println("100(16)-> "+i11);
		System.out.println("FF(16) -> "+i12);
	}
}