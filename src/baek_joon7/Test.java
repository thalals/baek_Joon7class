package baek_joon7;

public class Test {
	private int [] a;

	Test(int[] a){
		this.a= a;
	}
	
	public int Sum(int a[]) {
		int result=0;
		for(int i=0;i<a.length;i++)
			result+=a[i];
		return result;
	}
}
