package taxitest;

import java.util.Scanner;

public class OperationTime {
/**
@author starry
@Version V1.0
@Copyright Starry
*/
	
	public static void main(String[] args) {		 
		try (var input = new Scanner(System.in)) {//获取用户输入的数据
			System.out.println("请输入承运出粗车\n甲出租车请输入0\n乙出租车请输入1");
			int etp = input.nextInt();//将用户输入的数据存储
			while(etp>1) {//判断用户输入数据是否正确				
				System.out.println("输入错误，请重新运行程序");
				etp = input.nextInt();//循环调用用户输入数据，直到输入正确，程序继续运行							
		}
			System.out.println("请输入运行时间段\n白天运行时间为早6点到晚6点\n夜间运行时间为晚6点到早6点\n"
					+ "运行时间为白天请输入0\n运行时间为夜间请输入1");
			int time = input.nextInt();
			while(time>1) {
				System.out.println("输入错误，请重新运行程序");
				time = input.nextInt();
		}
			System.out.println("请输入运行公里数");
			double km = input.nextDouble();		
			double money = 0;	
			
			
			switch (etp){//用开关语句对用户输入数据进行判断，单条件多分支
			case 0 :
				switch(time) {			
					case 0 :
						if(km<=0) {//if语句判断运行公里							
							System.out.printf("还没坐车花什么钱！！！");
							}
						else {
						if(km<=3) {//if语句判断运行公里
							money = 14;
							System.out.printf("甲出租车%s公里的白天价格为:%s元" , km ,money);
							}
						else{
							if(km<=10) {
							money = 14 + (km - 3)*2.5;
							System.out.printf("甲出租车%s公里的白天价格为:%s元" , km ,money);
									}
								}
						    }
							if(km>10) {
							money = 14 + (km - 3)*3.5;
							System.out.printf("甲出租车%s公里的白天价格为:%s元" , km ,money);
							}						
					break;
					case 1 :
						if(km<=0) {//if语句判断运行公里							
							System.out.printf("还没坐车花什么钱！！！");
							}
						else {
						 if(km<=3) {
							money = 18;
							System.out.printf("甲出租车%s公里的夜间价格为:%s元" , km ,money);
							}
						 else{
							if(km<=10) {
							money = 18 + (km - 3)*3.0;
							System.out.printf("甲出租车%s公里的夜间价格为:%s元" , km ,money);
									}
								}
						 	}
							if(km>10) {
							money = 18 + (km - 3)*4.7;
							System.out.printf("甲出租车%s公里的夜间价格为:%s元" , km ,money);
						    }					    
					break;				
						    }
			break;
			case 1 :
				switch(time) {			
					case 0 :
						if(km<=0) {//if语句判断运行公里							
							System.out.printf("还没坐车花什么钱！！！");
							}
						else {
						if(km<=3) {
							money = 14;
							System.out.printf("乙出租车%s公里的白天价格为:%s元" , km ,money);
							}
						else{						
							money = 14 + (km - 3)*2.5;
							System.out.printf("乙出租车%s公里的白天价格为:%s元" , km ,money);
							}	
						}												
					break;
					case 1 :
						if(km<=0) {//if语句判断运行公里							
							System.out.printf("还没坐车花什么钱！！！");
							}
						else {
						 if(km<=3) {
							money = 18;
							System.out.printf("乙出租车%s公里的夜间价格为:%s元" , km ,money);
							}
						 else{						
							money = 18 + (km - 3)*3.0;
							System.out.printf("乙出租车%s公里的夜间价格为:%s元" , km ,money);
							}
						 }											
					break;				
						    }
				break;
			}								
		}
	}
}
