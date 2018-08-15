package com.practice1;

public class judge{
			int redsum=0;
			int bluesum=0;
			public void prize(){
				random o1=new random();
				customer o2=new customer();
				o2.buy();
				o1.number();
				
				if(o1.bluenum==o2.s2arry[6]){
					bluesum=1;
				}
				for (int i = 0; i < o2.s2arry.length; i++) {
					for (int j = 0; j < o1.rednum.length; j++) {
						// 如果顾客蓝球和机器相等就累加
						if ( o2.s2arry[i] == o1.rednum[j]) {
							redsum++;
							break;
						}
					}
				}
				
				System.out.println(bluesum);
				if(redsum==6&&bluesum==1){
					System.out.println("one");
				}else if(redsum==6&&bluesum==0){
					System.out.println("two");
				}else if(redsum==5&&bluesum==1){
					System.out.println("three");
				}else if((redsum==5&&bluesum==0)||(redsum==4&&bluesum==1)){
					System.out.println("four");
				}else if((redsum==4&&bluesum==0)||(redsum==4&&bluesum==1)){
					System.out.println("five");
				}else if(bluesum==1){
					System.out.println("six");
				}else{
					System.out.println("zero");
				}
			}
			
}
