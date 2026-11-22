package controller;

public class ActionForward {
	// 멤버필드
	private String url; // viewName ->jsp
	private boolean methods; //이동방식 - false :forward or redirect
	// 생성자
	public ActionForward() {
	}
	public ActionForward(String url, boolean methods) {
		this.url = url;
		this.methods = methods;
	}
	public ActionForward(String url) {
		this.url = url;
		methods = false; // forward
	}
	//set/get 추가
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public boolean isMethods() {
		return methods;
	}
	public void setMethods(boolean methods) {
		this.methods = methods;
	}
	
}
