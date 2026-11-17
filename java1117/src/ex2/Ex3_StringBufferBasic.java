package ex2;
public class Ex3_StringBufferBasic {
public static void main(String[] args) {
	String msg = "a";
	msg+="b";
	msg+="c";
	msg+="d";
	msg+="e";
	System.out.println(msg);
	StringBuilder sb = new StringBuilder();
	sb.append("a");
	sb.append("b");
	sb.append("c");
	sb.append("d");
	sb.append("e");
	System.out.println(sb);
}
}
