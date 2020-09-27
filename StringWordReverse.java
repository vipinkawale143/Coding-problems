package app.strings;

import java.util.Scanner;

public class StringWordReverse {

	//static String str2;
	public static void WordReverse(String str)
	{
		String[] arr=str.split(" ");
		
		int len=arr.length;
		String[] str2=new String[len];
		for(int i=0;i<len;i++)
		{
			char[] temp1=arr[i].toCharArray();
			int len1=temp1.length;
			char[] temp2=new char[len1];
			for(int j=0,k=len1-1;j<len1;j++, k--)
			{
				temp2[j]=temp1[k];
			}
			str2[i]=String.valueOf(temp2);
		}
		
		for(int i=0;i<len;i++)
		{
			System.out.print(str2[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the string");
		String str=sc.nextLine();
		
		WordReverse(str);
	}

}
