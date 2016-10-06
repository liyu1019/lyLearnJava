package com.liyu.demo1;
/**
 * 递归
 * @author LIYU
 *
 */
public class digui {
	
	public static int dg(int n){
		int sum=0;
		if(n==5) 
			{
				return 1;
			}else{
				n--;
				return sum+n; 				
			}
		
	}
	public static void main(String[] args) {
//		int temp;
//		temp=dg(99);
		System.out.println(dg(4));
	}
}
