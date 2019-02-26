package com.geeksforgeeks.practice;

import java.util.Scanner;

public class FourElements {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int t = s.nextInt();
		s.nextLine();
		while (t-- > 0) {
			int n = s.nextInt();
			s.nextLine();
			String iarray = s.nextLine();
			String[] s1 = iarray.split("\\s");
			Integer[] a = new Integer[n];
			int i = 0;
			for (String str : s1) {
				a[i] = Integer.parseInt(str.trim());// Exception in this line
				i++;
			}

			int x = s.nextInt();
			s.nextLine();
			int temp = 0;
			int flag = 0;
			// System.out.println(intarray.length);
			int arraylength = n;

			for (int j = 0; j < arraylength-3; j++) {
				for(int k=j+1;k<arraylength-2;k++) {
					for(int l=k+1;l<arraylength-1;l++) {
						for(int m=k+1;m<arraylength;m++) {
							if(a[j]+a[k]+a[l]+a[m]==x)
{
	flag=1;
}
							
						}
						
					}
						
				}
			}

			System.out.println(flag);
		}
	}

}
