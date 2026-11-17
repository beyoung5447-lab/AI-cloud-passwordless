package ex2;

public class Ex2_ElseIF {
	public static void main(String[] args) {
		int num = 9;
		int cnt = 0;
		if(num==9 || (cnt +=1)>0) {
			System.out.println("실행1");
		}
		if(num==8 || (cnt +=1)>0) {
			System.out.println("실행2");
	}
		if(num==7 || (cnt +=1)>0) {
			System.out.println("실행3");
}
		System.out.println("if문이 더 실행된 회수:" +cnt);
		cnt = 0;
		
			if(num==9 || (cnt +=1)>0) {
				System.out.println("실행1");
			}else if (num ==8||(cnt+=1)>0)
			if(num==8 || (cnt +=1)>0) {
				System.out.println("실행2");
		}else if (num ==8||(cnt+=1)>0)
			if(num==7 || (cnt +=1)>0) {
				System.out.println("실행3");
	}else if (num ==7||(cnt+=1)>0)
			System.out.println("if문이 더 실행된 회수:" +cnt);
	}
}
