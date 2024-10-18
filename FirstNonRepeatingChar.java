package com.example.demo;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatingChar {
public static void main(String[] args) {
	
	
	String st="Javavv";
	
	String st1=Arrays.stream(st.split("")).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
.entrySet().stream().filter(n->n.getValue()!=1).map(n->n.getKey()).findFirst().get();
	System.out.println(st1);
}
}
