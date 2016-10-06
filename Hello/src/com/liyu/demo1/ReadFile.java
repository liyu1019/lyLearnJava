package com.liyu.demo1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
//		ArrayList<String> str=new ArrayList<String>();
		String filepath="C:/Users/LIYU/Desktop/StringDemo.txt";
		File file = new File(filepath);
		BufferedInputStream buffer = new BufferedInputStream(new FileInputStream(file));		
		byte[] text=new byte[(int)file.length()];
		buffer.read(text);
		buffer.close();
		String msg=new String(text,0,text.length);		
		String[] s=msg.split(" ");	
		for(int i=0;i<s.length;i++){
//			if(!s[i].equals("")){
			for(int j=i+1;j<s.length;j++){
//				System.out.println("原始："+s[i]+"首位："+s[i].charAt(0));
				if(!s[i].equals("")&&!s[j].equals("")){
					if(s[i].length()>s[j].length())
					{
						String temp;
						temp=s[i];
						s[i]=s[j];
						s[j]=temp;
					}							
				}					
			}
		}
		for(int i=0;i<s.length;i++){
			for(int j=i+1;j<s.length;j++){				
				if(!s[i].equals("")&&!s[j].equals("")){
					if(s[i].length()==s[j].length()){
						if(s[i].charAt(s[i].length()-1)>s[j].charAt(s[j].length()-1))
						{
							String temp;
							temp=s[i];
							s[i]=s[j];
							s[j]=temp;
						}
					}	
				}					
			}
		}		
//			try{
//			
//			}catch(Exception e){
//				System.err.println(i);
//			}
		int cow=s.length/4;
		int row=s.length%4;
		for(int i=0;i<row+cow;i++){
			if(i<cow){
			System.out.printf("%20s",s[i]);
			System.out.printf("%20s",s[i+cow+row]);
			System.out.printf("%20s",s[i+cow*2+row]);
			System.out.printf("%20s",s[i+cow*3+row]);
			System.out.println();
			}else{
				System.out.printf("%20s",s[i]);
				System.out.println();
			}
		}		
//		for(int j=0;j<s[0].length();j++){
//			System.err.println(s[0].charAt(j));
//		}
		
//		System.out.println(s);
//		for(String i:s){
//			str.add(i);			
//		}
//		System.out.println(str);		
		};	
	}

