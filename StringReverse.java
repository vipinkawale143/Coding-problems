package app.strings;

import java.util.Scanner;

public class StringReverse {

	public static String Strrev(String str)
	{
		char arr[]=str.toCharArray();// to reverse an array you need to convert it into toCharArray()
						//so index operation can be performed
		String str1;
		int last=arr.length;
		char arr2[]=new char[last];
		System.out.println(last);
		for(int i=0,j=last-1;i<last;i++,j--)
		{
			arr2[i]=arr[j];
			//System.out.println(arr2[i]);
		}
		str1=String.valueOf(arr2);// using String.valueof method to copy the char array to String do not use
					//toString method it will gives the hascode 
	
		return str1;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc=new Scanner(System.in);
			System.out.println("enter the line to print");
			String str=sc.nextLine();
			
			System.out.println(str);
			System.out.println("");
			
			String res=Strrev(str);
			System.out.println(res);
	}

}
