package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class CountIpAddress {
	
	static int count(String[] ip)
	{
		
Map<String,Integer> map= new HashMap<>();

for(String s: ip)
{
	map.put(s, map.getOrDefault(s, 0) + 1);
 }

String maxIP = null;
int maxCount = 0;

for (Map.Entry<String, Integer> entry : map.entrySet()) {
    if (entry.getValue() > maxCount) {
        maxCount = entry.getValue();
        maxIP = entry.getKey();
    }
}
return maxCount;	
	}
	 public static void main(String[] args) {
	        String[] ipAddresses = {
	            "192.168.1.1",
	            "192.168.1.2",
	            "192.168.1.1",
	            "10.0.0.1",
	            "192.168.1.2",
	            "192.168.1.1",
	            "172.16.0.1"
	        };

	        int mostFrequentIP = count(ipAddresses);
	        System.out.println("The IP address that occurs the most is: " + mostFrequentIP);
}
}