package com.geeksforgeeks.practice;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner s = new Scanner(System.in);
         int t = s.nextInt();
         s.nextLine();
         while(t-- > 0)
         {
        	 String s1 = s.nextLine();
        	 String s2 = s.nextLine();
        	 
        	 if(s1.length()!=s2.length())
        	 {
        		 System.out.println(0);
        	 }
        	 else
        	 {
        		 char[] a = s1.toCharArray();
        		 char[] b = s2.toCharArray();
        		 Arrays.sort(a);
        		 Arrays.sort(b);
        		 if(Arrays.equals(a, b))
        		 {
        			 System.out.println(1);
        		 }
        		 else
        		 {
        			 System.out.println(0);
        		 }
        	 }
        	 
         }
         
	}

}
