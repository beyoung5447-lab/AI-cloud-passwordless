package ex2;

import java.util.Scanner;

public class Example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int game_count = 0; // 게임 횟수 변수
        int you = 0;        // 입력값
        int cpu_num = 0;    // 컴퓨터가 받는 랜덤 난수
        String cpu;         // CPU 결과값 받기 위한 변수
        int win = 0;        // 이긴 횟수
        String result = ""; // 결과값  
        int win_rate = 0;   // 승률

        while (true) {
            System.out.print("1-홀, 2-짝 , 3-종료 => "); // System.out으로 수정
            try {
                you = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력해주세요!");
                continue;
            }

            // 3 입력 시 종료 처리
            if (you == 3) {
                System.out.println("종료합니다.");
                break;
            }

            // 유효하지 않은 입력 처리
            if (you != 1 && you != 2) {
                System.out.println("올바른 값(1 또는 2)을 입력하세요!");
                continue;
            }

            // 유효한 게임 진행 시에만 카운트 및 난수 생성
            game_count++;
            cpu_num = (int) (Math.random() * 2) + 1; // 1 또는 2

            cpu = switch (cpu_num) {
                case 1 -> "CPU:홀";
                case 2 -> "CPU:짝";
                default -> "";
            };

            // 승패 판정
            if (you == cpu_num) {
                win++;
                result = "이겼음";
            } else {
                result = "졌음";
            }

            // 결과 출력
            System.out.println("no:" + game_count);
            System.out.println("YOU:" + (you == 1 ? "홀" : "짝"));
            System.out.println(cpu);
            System.out.println("Result:" + result);
            System.out.println("--------------------");
        }

        // 게임을 한 번이라도 진행했을 때만 승률 및 상품 출력
        if (game_count > 0) {
            win_rate = (int) (((float) win / (float) game_count) * 100);
            System.out.println("=== 최종 결과 ===");
            System.out.println("Total 게임 횟수: " + game_count);
            System.out.println("승리 횟수: " + win);
            System.out.println("승률: " + win_rate + "%");

            if (game_count >= 7) {
                if (win_rate == 100) {
                    System.out.println("상품: 페라리");
                } else if (win_rate >= 90) {
                    System.out.println("상품: 카니발");
                } else if (win_rate >= 70) {
                    System.out.println("상품: 라보");
                } else if (win_rate >= 50) {
                    System.out.println("상품: 노트북");
                } else {
                    System.out.println("참가상: 각티슈");
                }
            } else {
                System.out.println("게임 횟수가 7회 미만이라 상품 추첨 대상이 아닙니다.");
            }
        } else {
            System.out.println("진행된 게임이 없습니다.");
        }
        
        sc.close();
    }
}      