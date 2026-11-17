package ex3;

public class ADEMain {
public static void main(String[] args) {
//	D d = new D("typle1");
//	System.out.println("------------------");
//	E c = new E("type2");
	A ref = new D("type1");
	A ref1 = new E("type1");
	System.out.println("----------------");
	ref.testA();
	ref1.testA();
	// instanceof: 같은 주소에 소속되는 지 확인
	// 다형성에서 어떤 자식 클래스인지 구분할때 자주 사용
	System.out.println("new D()에 해당 되는 instanceof");
	System.out.println("A ref instance 자료형:"+(ref instanceof A));
	System.out.println("A ref instance 자료형:"+(ref instanceof B));
	System.out.println("A ref instance 자료형:"+(ref instanceof D));
	// System.out.println("A ref instance 자료형:"+(ref instanceof D)); -> 다른 인스턴스의 주소를 가지기 때문
	System.out.println("----------------");
	B ref2 = new D("type2");
	System.out.println("B ref instance 자료형:"+(ref2 instanceof A));
	System.out.println("B ref instance 자료형:"+(ref2 instanceof B));
	System.out.println("B ref instance 자료형:"+(ref2 instanceof D));
	// 컴파일러는 E의 자료형인 A는 인식하지만 B는 컴파일러가 모르는 것
	//System.out.println("B ref instance 자료형:"+(ref2 instanceof E));
}
}
