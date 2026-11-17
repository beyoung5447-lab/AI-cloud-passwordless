package ex7;

public class ABImple implements InterA, InterB {

	@Override
	public void testA() {
		System.out.println("testA() 실행됨: B"); 
	}

	@Override
	public void testB() {
		System.out.println("testB() 실행됨: A"); 
	}

	public static void main(String[] args) {
		InterA ref = new ABImple();
		ref.testA(); 
		
		
		InterB ref1 = (InterB) ref; 
		
		
		ref1.testB(); 
	}
}