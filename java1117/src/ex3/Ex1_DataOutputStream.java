package ex3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ex1_DataOutputStream {
private String path;
public Ex1_DataOutputStream() {
	path="src/ex1/datOnj.txt";
	
}public void dataWrite() {
	
	try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(path));){
		dos.writeInt(10);
		dos.writeBoolean(true);
		dos.writeChar('a');
		dos.writeFloat(10.5f);
		dos.writeUTF("MyTest");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}public void dataReader() {try(DataInputStream dis = new DataInputStream(new FileInputStream(path));) {
	System.out.println("출력:------------------");
	System.out.println("int"+dis.readInt());
	System.out.println("boolean"+dis.readBoolean());
	System.out.println("char"+dis.readChar());
	System.out.println("Float"+dis.readFloat());
	System.out.println("String"+dis.readUTF());
	
} catch (Exception e) {
	// TODO: handle exception
}
	
}public static void main(String[] args) {
	Ex1_DataOutputStream ref =new Ex1_DataOutputStream();
//	ref.dataWrite();
	ref.dataReader();
}

}
