package com.practice1;
import java.util.Random;
public  class random {
	Random r1=new Random();
	int bluenum=r1.nextInt(15)+1;
	int rednum[] =new int[6];
	int[] rednumball = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
			18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33 };
	int index;
	public void number(){
		// TODO Auto-generated method stub
		for(int i=0;i<rednum.length;i++){
			while(true){
				index=r1.nextInt(33);
				if(rednumball[index]!=0){
					rednum[i]=rednumball[index];
					rednumball[index]=0;	
					System.out.print(rednum[i]+" ");
					break;
				}
				
			}
			
			
		}
				System.out.println(bluenum);
	}

}
