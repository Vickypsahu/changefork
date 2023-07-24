package StringExample;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveCharDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Using set
		String str="java is programming language";
		Set<Character>ch=new LinkedHashSet<Character>();
		for(char c:str.toCharArray())
		{
			ch.add(c);
		}
		System.out.println(ch.toString());
		System.out.println(String.valueOf(ch));
		for(char a:ch)
		{
			System.out.print(a);
		}
		System.out.println();
		//Using String
		String str2="java is programming language";
		String s="";
		for(int i=0;i<str.length();i++)
		{
			if(!s.contains(String.valueOf(str2.charAt(i))))
			{
				s=s+str2.charAt(i);
			}
			else
			{
				System.out.print(str2.charAt(i));
			}
		}
		System.out.println();
		System.out.println(s);
		
		
		
	String input="java is code";
	 String result = "";
	    for (int i = 0; i < input.length(); i++) {
	        if(!result.contains(String.valueOf(input.charAt(i)))) {
	            result += String.valueOf(input.charAt(i));
	        }
	    }
	    System.out.println(result);
	}
		
	}


