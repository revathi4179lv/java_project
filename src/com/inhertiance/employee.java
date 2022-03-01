package com.inhertiance;

public class employee extends project {
	public void empName() {
		System.out.println("emp name is : Aishu");

	}
	public static void main(String[] args) {
		employee e=new employee();
		e.empName();
		e.projectName();
		e.clientName();
		e.companyName();
	}
}
