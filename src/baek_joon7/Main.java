//7�ܰ� Ŭ�������(TEST) - ���� n���� �־����� ��, n���� ���� ���ϴ� �Լ��� �ۼ��Ͻÿ�. 

package baek_joon7;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.print("���� �� ���� :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("���� �Է�");
		int a[] = new int [n]; 
		
		for(int i=0;i<n;i++)
			a[i] = sc.nextInt();
		
		Test b =new Test(a);
		
		System.out.println(b.Sum(a));
	}
}
