package dto;
/* "num nun" number(10) NOT NULL, 
  mtitle    varchar2(100) NOT NULL, 
  mcontent  varchar2(255) NOT NULL, 
  mwriter   varchar2(45) NOT NULL, 
  mbdate    date NOT NULL, */
public class MemoDTO {
	private int num;
	private String mtitle;
	private String mcontent;
	private String mwriter;
	private String mdate;
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}

	public String getMtitle() {
		return mtitle;
	}
	public void setMtitle(String mtitle) {
		this.mtitle = mtitle;
	}
	public String getMcontent() {
		return mcontent;
	}
	public void setMcontent(String mcontent) {
		this.mcontent = mcontent;
	}
	public String getMwriter() {
		return mwriter;
	}
	public void setMwriter(String mwriter) {
		this.mwriter = mwriter;
	}
	public String getMdate() {
		return mdate;
	}
	public void setMdate(String mbdate) {
		this.mdate = mbdate;
	}
	
	

}
