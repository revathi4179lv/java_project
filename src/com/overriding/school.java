package com.overriding;

public class school extends students {
	@Override
	public void studentname(String name) {
		super.studentname(name);
	}
	@Override
	public void studentMark(int mark) {
		super.studentMark(mark);
	}
	@Override
	public void studentId(int id) {
		super.studentId(id);
	}
	//main method
	public static void main(String[] args) {
		//object creation
		school s=new school();
		s.studentname("rithvik");
		s.studentMark(80);
		s.studentId(12345679);
	}
	}
