package com.simpleprogram;

public class programs {
	//ascending order and descendig
	public static void main(String[] args) {
		int arr[]= {10,200,45,578,5};
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i]>arr[j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
				
			}
			
		}
		
	System.out.println("ascending");
	for (int i = 0; i < arr.length; i++) {
		System.out.println(arr[i]);
	}
	
	
	}

}
