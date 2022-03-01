package com.inhertiance;

public class college extends staff  {
	public void collegeName() {
		System.out.println("ABC College");
	}
	public static void main(String[] args) {
		college c=new college();
		c.collegeName();
		c.stuId();
		c.stuName();
		c.stuDept();
		c.stfId();
		c.stfName();
		c.stfDept();
	}

}
