/*
Given an array of stock prices that are sorted by dates

10 11.3 10.9 10.7 13 13.5 18 17 16 12.4 14.9

Find the first & second best buy price
*/



package app.stock;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class BestStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		double[] arr= {10,11.3,10.9,10.7,13,13.5,18,17,16,12.4,14.9};
		
		TreeSet<Double> S=new TreeSet<Double>();
		//List<Double> l=new ArrayList<Double>();
		for(double num: arr)
		{
			S.add(num);
		}	
		Object[] d=S.toArray();
		int len=d.length;
		System.out.println("First best buy price"+d[0]);
		System.out.println("Second Best buy Price"+d[1]);
	}

}
