package com.Scanner;
//Constructor
public class SoftwareDetails {
	//non-parameterized constructor
	public SoftwareDetails() {
		System.out.println("Software : Java");
	}
	//parameterized constructor
	public SoftwareDetails(float version) {
		System.out.println("Version  :" +version);
	}
	public SoftwareDetails(String Space) {
		System.out.println("Browser  :" +Space);
	}
	public SoftwareDetails(int ram) {
		System.out.println("Ram in MB:"+ram);
	}
	//main function
	public static void main(String[] args) {
		//method calling 
		SoftwareDetails c=new SoftwareDetails();
		SoftwareDetails s1=new SoftwareDetails(1.8f);
		SoftwareDetails s3=new SoftwareDetails("Internet Explorer 7.0 and above");
		SoftwareDetails s4=new SoftwareDetails(128);
		
	}
	//create object for every constructor

	
	

}
