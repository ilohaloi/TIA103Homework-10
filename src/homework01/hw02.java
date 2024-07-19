package homework01;

public class hw02 {

	//請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)")
	
	public static void main(String[] args) {
	
		int sum1 = 0 , i ;
	
	for (i = 2; i <= 1000; i++) {
		if (i % 2 == 0) {
			sum1 += i;
			
		}
		System.out.println("1～1000的偶數和=" + sum1);	
	}		
	
	
	
	
	
	// 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)
	
	
	int m, sum2 = 1;
	for (m = 1; m <= 10; m++) {
		sum2 *= m;
	}
	System.out.println("1～10的連乘積=" + sum2);
	System.out.println("=====================");
	
	
	
	// 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
	int n = 1, sum3 = 1;
	while (n <= 10) {
		sum3 *= n;
		n++;
	}
	System.out.println("1～10的連乘積=" + sum3);
	System.out.println("=====================");
	
	System.out.println("=====================");
	
	//請設計一隻Java程式,輸出結果為以下:1 4 9 16 25 36 49 64 81 100
	int x, y=1;
	for (x=1; y<100; x++) {
		y = (int) Math.pow(x,2);
		System.out.print(y + " ");
	}
	
	System.out.println();
	System.out.println("=====================");
	
}
