package ex3;

import java.io.Serializable;

public class Membervo implements Serializable {
private int num;
transient private String pass;
private String name;
private boolean agree;
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isAgree() {
	return agree;
}
public void setAgree(boolean agree) {
	this.agree = agree;
}
}
