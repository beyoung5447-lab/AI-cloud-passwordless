package ex1;

import javax.annotation.Resource;

public class Ex1_Resource {
	// byType일 경우 <bean id="res1" name="resn1" class="ex1.Ex1_MyResource"
	// name으로 설정한 값을 @Qualifier처럼 설정할 수 있다.
	@Resource(name = "resn2")
	private Ex1_MyResource res;

	public Ex1_MyResource getRes() {
		return res;
	}
	// setter가 생략
}
