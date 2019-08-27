class Ex6_13 {
	static {
		System.out.println("static { }");
	}

	{
		System.out.println("{ }");
	}

	public Ex6_13() {
		System.out.println("»ý¼ºÀÚ");
	}

	public static void main(String args[]) {
		System.out.println("Ex6_13 bt = new Ex6_13(); ");
		Ex6_13 bt = new Ex6_13();

		System.out.println("Ex6_13 bt2 = new Ex6_13(); ");
		Ex6_13 bt2 = new Ex6_13();
	}
}