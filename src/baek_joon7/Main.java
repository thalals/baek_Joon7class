//7단계 클래스사용(TEST) - 정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오. 

package baek_joon7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("정수 의 개수 :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("정수 입력");
		int a[] = new int [n]; 
		
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		Test b =new Test(a);
		
		System.out.println(b.Sum(a));
	}
}
