package ex1;

import java.util.Scanner;

public class Ex2_Loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) { 
			System.out.println("1-홀,2-짝,3-종료 =>");
			int menu = Integer.parseInt(sc.nextLine());
			System.out.println(menu);
			if (menu==3) {
				System.out.println("종료");
				break;
				
			}else if (menu==1) {
				System.out.println("홀");
			}else if (menu==2) {
					System.out.println("짝");
			}else {
				System.out.println("올바른 메뉴 선택!");
					
				}
					
				
			}
			
		}
	}


