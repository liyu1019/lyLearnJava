package com.liyu.demo1;
/**
 * 冒泡排序
 * @author LIYU
 *
 */
public class sort {
	public static void main(String[] args) {
//		System.out.println("hello world");
		int a[] = {2,1,3,4,5,19,7,13,9,10};
		int max = 0;
		for(int i=1;i<10;i++){
			for(int j=0;j<10-i;j++){
				try{
				if(a[j]>a[j+1]){
					max=a[j];
					a[j]=a[j+1];
					a[j+1]=max;
				}
				}catch(Exception e){

				}
				}
			}
		for(int i=0;i<10;i++)
		{
			System.out.println(a[i]);
		}			
	}
}
