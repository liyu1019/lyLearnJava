package com.liyu.demo1;

import java.util.ArrayList;

public class DemoString {
	public static void main(String[] args){
		String a="abwea";
		String b="e";
		String c="";
//		String c="b";
//		System.out.println(a.charAt(3));
//		System.out.println(a.codePointAt(0));
//		System.out.println(a.codePointBefore(1));
//		System.out.println(a.codePointCount(0, 4));
		System.out.println(a.compareTo(b));
		System.out.println(a.compareToIgnoreCase(b));
		System.out.println(a.concat(b));
		System.out.println(a.contains("q"));
		System.out.println(a.contentEquals(b));
		System.out.println(a.endsWith("b"));
		System.out.println(a.equals(b));
		System.out.println(a.getBytes());
		System.out.println(a.hashCode());
		System.out.println(a.indexOf("w"));
		System.out.println(a.indexOf(b, 0));
		System.out.println(a.intern());
		System.out.println(c.isEmpty());
		System.out.println(a.lastIndexOf("a"));
		System.out.println(a.length());
	}
}
