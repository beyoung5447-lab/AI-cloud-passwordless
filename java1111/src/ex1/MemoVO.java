package ex1;

public class MemoVO {
  private int num; 
  private String writer;
  private String mcont;
  private String rdate;
  private String pwd;
  public MemoVO() {}
public MemoVO(int num, String writer, String mcont, String rdate, String pwd) {
	super();
	this.num = num;
	this.writer = writer;
	this.mcont = mcont;
	this.rdate = rdate;
	this.pwd = pwd;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getWriter() {
	return writer;
}
public void setWriter(String writer) {
	this.writer = writer;
}
public String getMcont() {
	return mcont;
}
public void setMcont(String mcont) {
	this.mcont = mcont;
}
public String getRdate() {
	return rdate;
}
public void setRdate(String rdate) {
	this.rdate = rdate;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}

}
