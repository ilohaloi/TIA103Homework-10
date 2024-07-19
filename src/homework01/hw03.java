package homework01;

import java.util.Scanner;

public class hw03 {
	
	
	public static void main(String[] args) {
		
	/*請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、
	 * 等腰三角形、其它三角形或不是三角形,如圖示結果:
	 */
		
		int[] l = new int [3];
		Scanner sc = new Scanner(System.in);
		System.out.println("請輸入三邊長：");
		if (sc.hasNextInt()) {
			l[0]=sc.nextInt();
			l[1]=sc.nextInt();
			l[2]=sc.nextInt();		
		}
		if (l[0] *l[1] *l[2] !=0) {
			if (l[0] == l[1] && l[1] == l[2]) {
				System.out.println("正三角形");
				}
			else if (l[0] == l[1] || l[1]==l[2]) {
				System.out.println("等腰三角形");
				}
			else if (Math.pow(l[0],2) == (Math.pow(l[1],2) + Math.pow(l[2],2)) 
					|| Math.pow(l[1],2) == (Math.pow(l[0],2) + Math.pow(l[2],2)) 
					|| Math.pow(l[2],2) == (Math.pow(l[1],2) + Math.pow(l[0],2))) {
				System.out.println("直角三角形");
				}
			else if (l[0] + l[1] > l[2] && l[1]+l[2]>l[0] && l[0] + l[2] > l[1])
			{System.out.println("其他三角形");}
			else {System.out.println("不是三角形");}	
		}
		else {System.out.println("不是三角形");}
		
		
		System.out.println("============================");
		
	/*請設計一隻程式,會亂數產生一個0~9的數字,
	 * 然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息,猜
	 * 對則顯示正確訊息,如圖示結果:
	 */
		
		answer = (int) (Math.random() *10);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("開始猜數字吧(範圍=0~9)：");
		for (int x = 0; x! = answer;) {
			if (sc.hasNextInt()) {
			x = sc.nextInt();	
			} else {System.out.println("請輸入整數！");
			break;}
			if (x == answer) {
			System.out.println("答對了！答案就是" + answer);
			break;}
			else {System.out.println("猜錯囉！");}	
		}
		
		System.out.println("=================================");
		
		// 產生0～100亂數，每次猜就會提示你是大於還是小於正確答案
		
		int ans100;
		ans100 = (int) ((Math.random() *101));
		Scanner sc1 = new Scanner(System.in);
		System.out.println("開始猜數字吧(範圍=0~100)：");
		for (int y=0; y!=ans100;) {
			if (sc1.hasNextInt()) {
				y= sc1.nextInt();
			} else {System.out.println("請輸入整數！");
			break;}
			if (y > ans100) {
			System.out.println("猜低一點！");
			}
			else if (y < ans100) {
			System.out.println("猜高一點！");
			}
			else if (y == ans100) {
			System.out.println("答對了！答案就是"+ans100);
			break;}
		}
	}
	
		System.out.println("============================");
	/*阿文很喜歡簽大樂透(1~49),但他是個善變的人,上次討厭數字是4,但這次他想要依心情決定討
	 * 厭哪個數字,請您設計一隻程式,讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇
	 * 的號碼與總數,如圖:
	 */
		
		
		System.out.println("請輸入不想要的數字：");
		
		Scanner no= new Scanner(System.in);
		int a=no.nextInt();
		int num=0;
		
		System.out.println("可選擇的數字：");
		for(int i=1; i<=49; i++) {
			if(!((i>=10 && i/10==a) || i%10==a)) {
				System.out.print(i+"\t");
				num++;				
				}		
			if((i%10==0)) {
				System.out.println();
			}//遇到某些數字排列會不太整齊
		}	
		System.out.println();
		System.out.println("共有 "+ num +" 個數字可選擇");
}
