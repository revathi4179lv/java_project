package com.inhertiance;

public class LanguageInfo1 extends LanguageInfo{
	public void southIndia() {
		System.out.println("chennai-tamil");

	}
	public void NorthIndia() {
		System.out.println("hindi");

	}
	public static void main(String[] args) {
		LanguageInfo1 info=new LanguageInfo1();
		info.tamilLanguage();
		info.englishLanguage();
		info.hindiLanguage();
		info.southIndia();
		info.NorthIndia();
	}

}
