package ex2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex2_FileReader_Writer {
	private String path;

	public Ex2_FileReader_Writer() {

		this.path = "src/ex1/demo01.txt";

	}

	public void msgWriter(String msg) {
		System.out.println(msg);
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true));) {
			bw.write(msg);
			bw.newLine();
		} catch (IOException e) {

			e.printStackTrace();
		}
		{

		}
	}

	public String msgReader() {

		try (BufferedReader br = new BufferedReader(new FileReader(path));) {
			String redV = null;
			StringBuilder sb = new StringBuilder();
			
			while((redV = br.readLine()) !=null) {
				sb.append(redV+"\n");
//			String res = "";
//			while ((redV = br.readLine()) != null) {
//				res += redV + "\n";
			}return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();

		}
		return "파일내용 읽기 실패";
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Ex2_FileReader_Writer ref = new Ex2_FileReader_Writer();
		ext: while (true) {
			System.out.println("1:작성,2:출력,3:종료");
			int menu = Integer.parseInt(sc.nextLine());
			switch (menu) {
			case 1:
				System.out.println("Message");
				String msg = sc.nextLine();
				ref.msgWriter(msg);
				break;
			case 2:
				String reMsg = ref.msgReader();
				System.out.println(reMsg);
				break;
			case 3:
				System.out.println("프로그램 종료");
				break ext;
			default:
				break;
			}
		}
	}
}
