package com.array;

public class TaskArray {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			sum=sum+a[i];
		}
		double avg=sum/a.length;
		System.out.println("the sum is :"+sum);
		System.out.println("the avg is : "+avg);
		
		//find the size
		System.out.println();
		int b[]= {11,12,13,14,15,16};
		System.out.println("the size of the array is:"+b.length);
		
		//print the given values
		System.out.println();
		int c[]= {11,12,13,14,15,16};
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}
		System.out.println();
		
		//list
		int d[]=new int[6];
			d[0]=11;
			d[1]=12;
			d[2]=13;
			d[3]=14;
			d[4]=15;
			d[5]=16;
			for (int j = 0; j < d.length; j++) {
				System.out.println(d[j]);
			}
			
		}
	}




