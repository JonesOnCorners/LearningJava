package com.geeksforgeeks.practice;

import java.util.Scanner;

public class SpiderSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		s.nextLine();
		while(t-- >0)
		{
			String input = s.nextLine();
			String[] i1 = input.split("\\s");
			int len = Integer.parseInt(i1[0]);
			int u = Integer.parseInt(i1[1]);
			int d = Integer.parseInt(i1[2]);
			int distancecovered= 0;
			int stepcounter=0;
			while((len>distancecovered) && (len>=u))
			{
				
				distancecovered=u-d;
				len=len-distancecovered;
                
				stepcounter++;
				//System.out.println("length "+len+" "+distancecovered+" steps "+stepcounter);
			}
			System.out.println(stepcounter++);
		}
		
	}

}
