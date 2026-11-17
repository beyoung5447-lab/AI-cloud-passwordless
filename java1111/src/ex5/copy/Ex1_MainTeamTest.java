package ex5.copy;

public class Ex1_MainTeamTest {
	public static void main(String[] args) {
      String[] colors = {"빨간색","노란색","파란색"};
		Ex1_MainTeam[] arr = {new Ex1_Rect(),new Ex1_Circle(), new Ex1_TriangleDraw()};
		for (int i = 0; i < arr.length; i++) {
			arr[i].setColor(null);
			arr[i].drawsomething();
			System.out.println("====================");
		}
	}

}
