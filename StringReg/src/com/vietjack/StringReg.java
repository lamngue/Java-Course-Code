package com.vietjack;

import java.util.regex.Pattern;

public class StringReg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		String data = "Hom    nay          troi dep qua";
		String[] str = data.split("\\s+"); //1 hoac nhieu khoang trang
		for(String element:str) {
			System.out.println(element);
		}*/
/*		String data = "Hom.nay.troi.dep.qua";
		String[] str = data.split("\\."); //1 hoac nhieu khoang trang
		for(String element:str) {
			System.out.println(element);
		}*/
		String data = "Hom345nay567troi789dep212qua";
		/*System.out.println(data.replaceAll("\\d", "")); //loai nhung thang so thay bang ""
		System.out.println(data.replaceAll("[^0-9]", ""));//loai nhung thang chu (ko phai so 0-9)
		System.out.println(data.replaceAll("[^a-zA-z]", ""));//loai nhung thang so (ko phai chu)*/	
		String regex = "[0-9]+";
		System.out.println(data.matches(regex));
		String data2 = "abc";
		String regex2 = "[a-zA-z]+";
		System.out.println(data2.matches(regex2));
		// +: 1 hoac nhieu, ?: 0 hoac 1, *: 0 hoac nhieu
		System.out.println(Pattern.matches("[amn]+", "aammmmnnnn")); //true
		System.out.println(Pattern.matches("[amn]+", "aammmmnzznnn")); //false
		System.out.println(Pattern.matches("[789]{1}\\d{9}", "8850312304")); // sdt bat dau bang 7,8 hoac 9, va 9 so sau la so tu nhien
		}

}
