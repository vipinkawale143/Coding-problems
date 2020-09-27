package app.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CharOccurence {

	public static void CharOccur(String str)
	{
		char[] arr=str.toCharArray();
		int len=arr.length;
		TreeMap<Character,Integer> imap=new TreeMap<Character, Integer>();
		Integer count=0;
		for(int i=0;i<len;i++)
		{
			Character temp=arr[i];
			for(int j=0;j<len;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
			imap.put(arr[i], count);
			count=0;
		}
		imap.remove(' ');
		System.out.println(imap);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		
		CharOccur(str);
		
	}

}
