class P{
	public void m1()throws ArithmeticException{
		System.out.println("Parent");
	}
}
class C extends P{
	public void m1()throws RuntimeException{
		System.out.println("Parent");
	}
    
}