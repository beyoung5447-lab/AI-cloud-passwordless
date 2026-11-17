package ex2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class Ex3_Properties {
	private Properties prop;
	private String path;

	public Ex3_Properties() {
		prop = new Properties();
		path = "src/ex2/my.properties";

	}

	public String message(String msg) {
		String res = "";
		try (FileReader rf = new FileReader(path)) {
			prop.load(rf);
			res = prop.getProperty(msg, "그런 말은 배운적이 없어요!");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return res;
	}

	public static void main(String[] args) {
		Ex3_Properties ref = new Ex3_Properties();
		Scanner sc = new Scanner(System.in);
		ext: while (true) {
			System.out.println("Memnu 1- 대화,3-종료");
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				System.out.println("대화:");
				String msg = sc.nextLine();
				String res = ref.message(msg);
				System.out.println("답변:" + res);
				break;
			case 3:
				System.out.println("대화를 종료 합니다.");
				break ext;
			default:
				System.out.println("메뉴 참조!");
			}
		}
		sc.close();
	}

}
