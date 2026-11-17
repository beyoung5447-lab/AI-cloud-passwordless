package ex5.copy;

public abstract class Ex1_MainTeam {
	private String color;
	public Ex1_MainTeam(){
		color = "황금색";
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
private String logo() {
	return"ICTpassword 종로";
}
public final String getcolor() {
	return "본사"+logo()+"의"+color;
}
 public abstract void drawsomething();
}

