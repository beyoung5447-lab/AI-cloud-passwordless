package ex4.OldBox;

public class OldBox {
private Object value;

public Object getValue() {
	return value;
}

public void setValue(Object value) {
	this.value = value;
}
public static void main(String[] args) {
	OldBox ref = new OldBox ();
	ref.setValue("Java");
	System.out.println(ref.getValue());
	String rs = (String ) ref.getValue();
	System.out.println(rs.substring(0,2));
	
}
}
