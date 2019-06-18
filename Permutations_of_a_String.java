package com.intershala.javaapp;

import java.util.Scanner;

public class Permutation {
	public static void permute(String a,int l,int r){
		if(l==r){
			System.out.println(a);
		}
		else {
			for (int i = l; i <= r; i++) {
				a=swap(a, l, i);
				permute(a, l+1, r);
				a=swap(a, l, i);
			}
		}
	}
	public static String swap(String q,int i,int j){
		char[] b = q.toCharArray();
		char temp;
		temp=b[i];
		b[i]=b[j];
		b[j]=temp;
		return String.valueOf(b);
	}
	    public static void main(String[] args){
		String a= new String();
		Scanner sc = new Scanner(System.in);
		a=sc.nextLine();
		int len=a.length();
		permute(a,0,len-1);
	}
}
