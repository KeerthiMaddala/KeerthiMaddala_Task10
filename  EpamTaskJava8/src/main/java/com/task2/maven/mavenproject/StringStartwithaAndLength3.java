package com.task2.maven.mavenproject;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringStartwithaAndLength3 {
	public static void main(String args[]){
		String[] strArray = {"Apple","ant","aaa","red","green"};
		List<String> strList = Arrays.asList(strArray);
		List<String> resList = filter(strList);
		System.out.println(resList);
	}
	public static List<String> filter(List<String> list){
		return list.stream()
				.filter(s -> s.startsWith("a"))
				.filter(s -> s.length()==3)
				.collect(Collectors.toList());
	}

}
