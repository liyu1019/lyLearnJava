package com.liyu.demo1;
/**
 * 杨辉三角
 * @author LIYU
 *
 */
public class yanghui {
	public static final int N=12;
	public static void main(String[] args) {
		int[][] a=new int[N][N];
		for(int i=0;i<N;i++){
			a[i][i]=1;
			a[i][0]=1;
		}
		for(int i =2;i<a.length;i++){
			for(int j= 1;j<i+1;j++){
				a[i][j]=a[i-1][j-1]+a[i-1][j];
			}
		}	
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < i+1;  j++) {
				if(j==0){
					System.out.printf("%1d",a[i][j]);
				}else{
					System.out.printf("%5d",a[i][j]);
				}
			}
			System.out.println();
		}
		
	}
}
