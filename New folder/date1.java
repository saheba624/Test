package com.basic;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date1 {
	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Date date1=sdf.parse("2016-10-10");
		Date date2=sdf.parse("2017-11-11");
		System.out.println(sdf.format(date1));
		System.out.println(sdf.format(date2));
		if(date2.compareTo(date1)>0){
			System.out.println("11");
			
		}else {
			System.out.println("21");
			
		}
		
		try {
	   
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}

}
