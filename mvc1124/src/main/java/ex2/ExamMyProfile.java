package ex2;

public class ExamMyProfile {
	private String profile;

	public ExamMyProfile() {
		System.out.println("출력 완료");
	}

	public String print() {
		return "또 만나요" + profile;
	}


	public void setProfile(String profile) {
		this.profile = profile;

	}
}
