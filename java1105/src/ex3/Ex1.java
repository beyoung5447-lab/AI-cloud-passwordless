package ex3;

import java.util.Scanner;

public class Ex1 {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);
System.out.print("단을 입력해주세요:"); // 몇 단인지 입력한다
int dan = Integer.parseInt(sc.nextLine());

System.out.print("범위을 입력해주세요:"); // 범위를 입력한다
int ran = Integer.parseInt(sc.nextLine());
int range = ran / 2;
if (ran % 2 == 0) { // 짝수일 경우를 대비함
System.out.print("범위를 다시 입력해주세요(3,5,7,9):");
ran = Integer.parseInt(sc.nextLine());
range = ran / 2;

}
for (int i = 0; i <= 9; i++) { // 한번만 실행하기 위해 i를 0으로 설정함
for (int j = dan - range; j <= dan + range; j++) {
// 입력한 값을 좌우 대칭이 되도록 하기 위함
if (i==0) {
System.out.print(j + "단\t\t"); // 단이 출력된다

} else {

System.out.print(j + " x " + i + " = " + (j * i) + "\t");
} // 구구단이 출력된다
}
System.out.println(""); //줄바꿈을 위함

}

System.out.println("구구단 종료!");
}

}