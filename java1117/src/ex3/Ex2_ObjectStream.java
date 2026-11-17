package ex3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Ex2_ObjectStream {
String path = "src/ex1/obj.txt";
public void myWriteObject() {
	Membervo v = new Membervo();
	v.setNum(1);
	v.setName("테스형");
	v.setPass("11");
	v.setAgree(true);
	try (ObjectOutputStream oos= new ObjectOutputStream(new FileOutputStream(path)); ){
		oos.writeObject(v);
		System.out.println("정상적으로 직렬화 성공!");
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	} 
}
public void myReaderObject() {
	try (ObjectInputStream ois= new ObjectInputStream(new FileInputStream(path))) {
		Membervo v = (Membervo) ois.readObject();
		System.out.println("No"+v.getNum());
		System.out.println("Name"+v.getName());
		System.out.println("Pass"+v.getPass());
		System.out.println("Agree"+v.isAgree());
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
public static void main(String[] args) {
	Ex2_ObjectStream ref = new Ex2_ObjectStream();
	ref.myWriteObject();
	System.out.println("역직렬화로 읽어오기");
	ref.myReaderObject();
}
}
