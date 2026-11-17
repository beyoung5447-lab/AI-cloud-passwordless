package ex3;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Writer;

public class Ex4_PrintWriter {
	static String path = "src/ex1/demo2.txt";

	public static void main(String[] args) throws Exception {

//		try {
//			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(path)));
//
//			bw.write("테스형2");
//			bw.newLine();
//			bw.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//
//		}
		PrintWriter pw = new PrintWriter(new FileOutputStream(path), true);
		pw.println("하이");
		pw.close();
	}
}
