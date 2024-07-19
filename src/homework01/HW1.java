package homework01;

public class HW1 {

	public static void main(String[] args) {
	
		//請設計一隻Java程式,計算12,6這兩個數值的和與積
		int a1 = 12, a2 = 6, a3, a4;
		
		a3 = a1 * a2 ;
		
		a4 = a1 + a2 ; 
		
		System.out.println(a3);
		
		System.out.println(a4);
		
		System.out.println("============================");
		
		//請設計一隻Java程式,計算200顆蛋共是幾打幾顆? (一打為12顆)
		
		int b1 = 200, b2 = 12, b3 , b4 ; 
		
		b3 = b1 / b2;
		b4 = b1 % b2;
		
		System.out.println("共是" + b3 + "打" + b4 + "顆");
		
		System.out.println("============================");
				
		//請由程式算出256559秒為多少天、多少小時、多少分與多少秒
		
			//1天=24小時
			//   =24*60分=1440分
			//	 =24*60*60秒=86400秒(c1)
		 	//1小時=60分*60秒=3600秒(c2)
		
		int total = 256559;
		
		int days = total/86400;

		int hours = (total%86400)/3600;
		int minutes = (total%86400)%3600/60;
		int seconds = (total%86400)%3600%60;
		
		
				
		System.out.println(days); //天
		System.out.println(hours); 
		System.out.println(minutes);
		System.out.println(seconds);
		System.out.println(days + "天" + hours +"小時" + minutes + "分" + seconds +"秒");
		System.out.println("============================");
		
		
		
		//請定義一個常數為3.1415(圓周率),並計算半徑為5的圓面積與圓周長
		
		final float PI = 3.1415f;
		
		int r = 5; //半徑
		
		float area = r * r * PI;//圓面積
		float circum = 2 * r * PI;//圓周長
		
		System.out.println("圓面積="+ area + "圓周長=" + circum);
		
		System.out.println("============================");
		/*某人在銀行存入150萬,銀行利率為2%,如果每年利息都繼續存入銀行,
		請用程式計算10年後,本金加利息共有多少錢 (用複利計算,公式請自行google)
 
         */
		
		int y, money=1_500_000;
	    double rate = 0.02;
	    double saving = money*(1+rate);
	    for (y=1; y<=10; y++) {
	    	saving *= (1+rate) ;
	    }
	    System.out.println("複利10年本金加利息共有"+(int)saving+"元");

		System.out.println("============================");
		//請寫一隻程式,利用System.out.println()印出以下三個運算式結果:
			//5 + 5
			//5 + ‘5’
			//5 + “5”
		
		System.out.println(5 + 5); //等於兩個整數相加
		System.out.println(5 + '5');//
		System.out.println(5 + "5");//等於1個數字5和一個文字5
		
	}
}
