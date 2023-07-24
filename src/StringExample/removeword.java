package StringExample;

import java.util.ArrayList;
import java.util.Arrays;

public class removeword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="java is programming language";
		String str2="java python is language";
		
		String arr[]=str1.split("\\s");
		String arr1[]=str2.split("\\s");
		
		ArrayList<String>list1=new ArrayList<String>(Arrays.asList(arr));
		ArrayList<String>list2=new ArrayList<String>(Arrays.asList(arr1));
	
		
		list1.removeAll(list2);
		System.out.println(list1);
		System.out.println(list2);

	}

}
