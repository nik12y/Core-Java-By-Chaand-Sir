package com.localDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class LocalDateTimeTest {

	public static void main(String[] args) {

		LocalDateTime localDateTime=LocalDateTime.now();
		System.out.println(localDateTime);
		
		LocalDateTime localDateTime1=LocalDateTime.MAX;
		System.out.println(localDateTime1);
		
		LocalDateTime localDateTime2=LocalDateTime.MIN;
		System.out.println(localDateTime2);
		
		LocalDateTime localDateTime3=LocalDateTime.from(localDateTime.plusHours(2));
		System.out.println(localDateTime3);
		                                                                         //.ofHours(2)
		LocalDateTime localDateTime4=LocalDateTime.from(localDateTime.atOffset(ZoneOffset.of("2022-02-02")));
		System.out.println(localDateTime4);
		/*	LocalDateTime localDateTime3=LocalDateTime.from(localDateTime.plusHours(2));
		System.out.println(localDateTime3);
		LocalDateTime localDateTime3=LocalDateTime.from(localDateTime.plusHours(2));
		System.out.println(localDateTime3);
		LocalDateTime localDateTime3=LocalDateTime.from(localDateTime.plusHours(2));
		System.out.println(localDateTime3);
		LocalDateTime localDateTime3=LocalDateTime.from(localDateTime.plusHours(2));
		System.out.println(localDateTime3);
		LocalDateTime localDateTime3=LocalDateTime.from(localDateTime.plusHours(2));
		System.out.println(localDateTime3);
		LocalDateTime localDateTime3=LocalDateTime.from(localDateTime.plusHours(2));
		System.out.println(localDateTime3);
		LocalDateTime localDateTime3=LocalDateTime.from(localDateTime.plusHours(2));
		System.out.println(localDateTime3);
		LocalDateTime localDateTime3=LocalDateTime.from(localDateTime.plusHours(2));
		System.out.println(localDateTime3);
		LocalDateTime localDateTime3=LocalDateTime.from(localDateTime.plusHours(2));
		System.out.println(localDateTime3);*/
		
	}
}
