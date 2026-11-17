package ex10;

public record StudentRequest(String name, int age) {
    public StudentRequest {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("이름은 필수입니다");
        }
        if (age < 1) {
            throw new IllegalArgumentException("나이는 1세 이상이어야 합니다");
        }
    }
}